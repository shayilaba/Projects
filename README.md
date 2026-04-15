📌 Smart Chatbot System (Java Console Application)

🧠 Overview
The Smart Chatbot System is a console-based Java application that simulates a simple rule-based chatbot. It responds to user inputs using keyword matching and demonstrates core Object-Oriented Programming (OOP) concepts such as interfaces, encapsulation, and abstraction.
The system also includes exception handling, dynamic response addition, and basic intent-based processing like greetings, FAQs, and simple arithmetic operations.

🚀 Features
💬 Keyword-based chatbot responses
🧠 Basic intent recognition (greetings, help, identity, time, etc.)
➕ Simple arithmetic operations (add, subtract)
⚡ Dynamic response addition (admin feature)
⚠️ Custom exception handling for invalid inputs
🔍 Fallback response for unknown queries
📚 Modular OOP-based design using interfaces and classes

🛠️ Tech Stack
Java (Core)
OOP Principles (Encapsulation, Abstraction, Interfaces)
Collections Framework (HashMap)
Exception Handling

🏗️ Project Structure
SmartChatbotSystem
│
├── Chatbot (Interface)
├── SmartChatbot (Main Logic Class)
├── InvalidInputException (Custom Exception)
└── ChatbotSystem (Main Class)

⚙️ How It Works
User enters a message in the console.
Input is normalized (converted to lowercase).
System checks:
Direct keyword match
Partial keyword match
If match found → returns response
If input is math-related → performs calculation
If input is invalid → throws/handles exception
If no match → fallback response is shown

💡 Example Inputs
hello
who are you
help
add 5 10
subtract 20 5
add thanks You are welcome
time
unknown query

⚠️ Exception Handling
Empty input → triggers custom exception
Invalid admin command format → throws InvalidInputException
Invalid number format in math → handled using try-catch

📈 Future Improvements
GUI version using Java Swing/JavaFX
NLP-based intelligent response system
Database integration for persistent memory
Voice-enabled chatbot support

🎯 Learning Outcomes
Strong understanding of OOP design
Real-world simulation of chatbot logic
Hands-on experience with exception handling
Working with HashMaps and collections
Basic system design thinking

👨‍💻 Author
Shayila B A
