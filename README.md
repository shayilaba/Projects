📌 Smart Chatbot System (Java Console Application)

🧠 Overview
The Smart Chatbot System is a console-based Java application that simulates a simple rule-based chatbot. It responds to user inputs using keyword matching and demonstrates core Object-Oriented Programming (OOP) concepts such as interfaces, encapsulation, and abstraction.<br>
The system also includes exception handling, dynamic response addition, and basic intent-based processing like greetings, FAQs, and simple arithmetic operations.

🚀 Features
<br>
💬 Keyword-based chatbot responses
<br>
🧠 Basic intent recognition (greetings, help, identity, time, etc.)
<br>
➕ Simple arithmetic operations (add, subtract)
<br>
⚡ Dynamic response addition (admin feature)
<br>
⚠️ Custom exception handling for invalid inputs
<br>
🔍 Fallback response for unknown queries
<br>
📚 Modular OOP-based design using interfaces and classes

🛠️ Tech Stack
<br>
Java (Core)
<br>
OOP Principles (Encapsulation, Abstraction, Interfaces)
<br>
Collections Framework (HashMap)
<br>
Exception Handling

🏗️ Project Structure
<br>
SmartChatbotSystem
<br>
│
<br>
├── Chatbot (Interface)
<br>
├── SmartChatbot (Main Logic Class)
<br>
├── InvalidInputException (Custom Exception)
<br>
└── ChatbotSystem (Main Class)

⚙️ How It Works
<br>
User enters a message in the console.
<br>
Input is normalized (converted to lowercase).
<br>
System checks:
<br>
Direct keyword match
<br>
Partial keyword match
<br>
If match found → returns response
<br>
If input is math-related → performs calculation
<br>
If input is invalid → throws/handles exception
<br>
If no match → fallback response is shown

💡 Example Inputs
<br>
hello
<br>
who are you
<br>
add 5 10
<br>
subtract 20 5
<br>
time
<br>
unknown query

⚠️ Exception Handling
<br>
Empty input → triggers custom exception
<br>
Invalid admin command format → throws InvalidInputException
<br>
Invalid number format in math → handled using try-catch
<br>

📈 Future Improvements
<br>
GUI version using Java Swing/JavaFX<br>
NLP-based intelligent response system<br>
Database integration for persistent memory<br>
Voice-enabled chatbot support<br>

🎯 Learning Outcomes
<br>
Strong understanding of OOP design<br>
Real-world simulation of chatbot logic<br>
Hands-on experience with exception handling<br>
Working with HashMaps and collections<br>
Basic system design thinking

👨‍💻 Author<br>
Shayila B A
