# Mini-AI-Assistant

Mini AI Assistant – Sarah

A simple yet interactive Mini AI Assistant built using Java, applying OOP concepts, and executed in VS Code.
This project demonstrates how basic AI-like conversational behavior can be implemented using Java classes, methods, loops, and date/time functions.

📌 Features

Greets the user with personalized messages

Shows the current time and date

Responds to simple user queries

Uses object-oriented programming principles

Runs in the console

Beginner-friendly and easy to extend

🛠️ Technologies Used
Component	Description
Java	Core logic & OOP implementation
VS Code	IDE used for development
Java Libraries	Scanner, Random, Date, Calendar, SimpleDateFormat
📂 Project Structure
Mini-AI-Assistant/
│
├── Sarah.java        # Main source code for AI assistant
├── README.md         # Project documentation
└── (space for additional files/features)

⚙️ How the Code Works
1. User Input Handling

Uses Scanner class to take input such as:

Name

Queries

Commands

2. AI Response Logic

The assistant gives random responses using:

Random random = new Random();

3. Time & Date Display

Implemented using:

Date date = new Date();
SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

4. Loop for Continuous Conversation

A while or do-while loop keeps the assistant active until the user exits.

5. OOP Concepts Used

✔ Classes
✔ Objects
✔ Methods
✔ Encapsulation
✔ Basic interaction design

🚀 How to Run

Install Java JDK 8+

Open the project in VS Code

Run the file using:

javac Sarah.java
java Sarah
