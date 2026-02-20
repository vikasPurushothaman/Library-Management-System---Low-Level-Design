📚 Library Management System

A modular, object-oriented Library Management System built using Java 17, implementing core OOP principles and multiple design patterns including:

Factory Pattern

Strategy Pattern

Observer Pattern

SOLID Principles

🚀 Features

📖 Add and manage books

👤 Register and manage patrons

🏢 Multi-branch library support

🔄 Transfer books between branches

📕 Checkout and return books

📝 Loan tracking

🔔 Reservation system with notification (Observer Pattern)

🧠 AI-like recommendation system (Strategy Pattern)

🏭 Book creation using Factory Pattern

📊 Logging support

🏗 Project Structure



library-management-system/
│
├── model/
│   ├── Book.java
│   ├── Patron.java
│   ├── Loan.java
│   ├── Branch.java
│
├── service/
│   ├── LibraryService.java
│   ├── LendingService.java
│   ├── ReservationService.java
│
├── strategy/
│   ├── RecommendationStrategy.java
│   ├── HistoryRecommendationStrategy.java
│   
│
├── factory/
│   ├── BookFactory.java
│
├── observer/
│   ├── Observer.java
│   ├── ReservationNotifier.java
│
├── Main.java
└── README.md

🧠 Design Patterns Used
1️⃣ Factory Pattern

Used in BookFactory to create book objects in a controlled and scalable way.

Why?

Encapsulates object creation

Makes the system extendable

Reduces tight coupling

2️⃣ Strategy Pattern

Used in RecommendationStrategy.

Implementations:

GenreRecommendationStrategy

HistoryRecommendationStrategy

Why?

Allows dynamic selection of recommendation algorithm

Open/Closed Principle compliant

3️⃣ Observer Pattern

Used in ReservationService.

When a reserved book becomes available:

All subscribed observers are notified automatically.

Why?

Decouples notification logic

Enables scalable event-driven behavior

🏢 Multi-Branch Support

Each branch maintains its own inventory.

Features:

Add books per branch

Transfer books between branches

Fetch all books across branches

📕 Loan Management

Loan tracks:

Checkout date

Return date

Active loan status

System ensures:

A book cannot be borrowed if already checked out.

🛠 Technologies Used

Java 17

IntelliJ IDEA

java.util.logging

OOP Principles

Design Patterns

▶ How To Run
Compile
javac Main.java

Run
java Main


Or simply run using IntelliJ.

💡 Sample Output
Recommended Books:
- Clean Architecture
- Clean Code

INFO: Books added to library.
INFO: Patron added.
INFO: Book checked out: ISBN003
INFO: Book returned: ISBN003

Process finished with exit code 0

🔐 OOP Principles Applied

Encapsulation

Abstraction

Inheritance

Polymorphism

Separation of Concerns

🎯 Future Improvements
---------------------

Add CLI-based menu system

Add database integration (MySQL/PostgreSQL)

Add REST API (Spring Boot)

Add concurrency handling

Add JUnit testing

Add overdue fine calculation

Add user authentication

📈 Why This Project Is Interview-Ready

This project demonstrates:

Strong OOP knowledge

Clean code structure

Design pattern implementation

Scalability thinking

Real-world system modeling

👨‍💻 Author
-------------
Vikas P
Java Backend Developer