package com.Projects;

import java.util.*;

// 1. Interface
interface Chatbot {
    String getResponse(String input) throws InvalidInputException;
    void addResponse(String keyword, String response);
}

// 2. Custom Exception (FIXED)
class InvalidInputException extends Exception {
    public InvalidInputException(String msg) {
        super(msg); // ✅ FIXED (important)
    }
}

// 3. Smart Chatbot
class SmartChatbot implements Chatbot {

    private HashMap<String, String> responseMap;

    public SmartChatbot() {
        responseMap = new HashMap<>();
        loadDefaultResponses();
    }

    private void loadDefaultResponses() {

        responseMap.put("hello", "Hi! 👋 How can I help you today?");
        responseMap.put("hi", "Hello there! 😊");
        responseMap.put("good morning", "Good morning! ☀️");

        responseMap.put("bye", "Goodbye! 👋");
        responseMap.put("see you", "Take care! 😊");

        responseMap.put("help", "Try: hello, time, calc add 5 10, add keyword response");

        responseMap.put("who are you", "I am a Java Smart Chatbot.");
        responseMap.put("what can you do", "I can chat, do math, and store responses.");

        responseMap.put("time", "Current time: " + new Date());

        responseMap.put("default", "Sorry 😅 I didn't understand that. Type 'help'.");
    }

    @Override
    public String getResponse(String input) throws InvalidInputException {

        // ❌ EMPTY INPUT HANDLING
        if (input == null || input.trim().isEmpty()) {
            throw new InvalidInputException("Input cannot be empty!");
        }

        input = input.toLowerCase().trim();

        // 1. EXIT handled outside

        // 2. SAFE MATH COMMAND
        if (input.startsWith("calc ")) {
            return handleMath(input);
        }

        // 3. EXACT MATCH (SAFE)
        if (responseMap.containsKey(input)) {
            return responseMap.get(input);
        }

        // 4. TOKEN-BASED MATCH (FIX for "hiking → hi bug")
        String[] tokens = input.split("\\s+");

        for (String token : tokens) {
            if (responseMap.containsKey(token)) {
                return responseMap.get(token);
            }
        }

        return responseMap.get("default");
    }

    // ✅ SAFE MATH HANDLER (ROBUST)
    private String handleMath(String input) {

        try {
            String[] parts = input.trim().split("\\s+");

            if (parts.length != 4) {
                return "Invalid format! Use: calc add 5 10";
            }

            String op = parts[1];

            int a = Integer.parseInt(parts[2]);
            int b = Integer.parseInt(parts[3]);

            switch (op) {

                case "add":
                    return "Result: " + (a + b);

                case "subtract":
                    return "Result: " + (a - b);

                default:
                    return "Unknown operation! Use: add or subtract";
            }

        } catch (NumberFormatException e) {
            return "Invalid numbers! Use: calc add 5 10";
        } catch (Exception e) {
            return "Invalid format! Use: calc add 5 10";
        }
    }

    @Override
    public void addResponse(String keyword, String response) {

        if (keyword == null || response == null ||
            keyword.trim().isEmpty() || response.trim().isEmpty()) {
            return;
        }

        responseMap.put(keyword.toLowerCase().trim(), response.trim());
    }
}

// 4. MAIN CLASS
public class SmartChatbotSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SmartChatbot bot = new SmartChatbot();

        System.out.println("🤖 Smart Chatbot Started!");
        System.out.println("Type 'exit' to stop\n");

        while (true) {

            try {
                System.out.print("You: ");
                String input = sc.nextLine();

                input = input.trim();

                // EXIT
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Bot: Bye 👋");
                    break;
                }

                // ❗ ADMIN COMMAND (STRICT FIX)
                if (input.toLowerCase().startsWith("add ")) {

                    String[] parts = input.split("\\s+", 3);

                    if (parts.length != 3) {
                        System.out.println("Error: Use format → add keyword response");
                        continue;
                    }

                    if (parts[1].length() < 2 || parts[2].length() < 2) {
                        System.out.println("Error: keyword/response too short");
                        continue;
                    }

                    bot.addResponse(parts[1], parts[2]);
                    System.out.println("Bot: Added new response!");
                    continue;
                }

                // RESPONSE FROM BOT
                String reply = bot.getResponse(input);
                System.out.println("Bot: " + reply);

            } catch (InvalidInputException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}