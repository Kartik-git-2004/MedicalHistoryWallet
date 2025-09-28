🩺 Medical History Wallet

A Java-based console application for securely managing and storing patient medical records. The system is designed for intermediate-level Java developers and demonstrates key concepts such as Object-Oriented Programming (OOP), Collections, File I/O, and Exception Handling.

It can later be extended with databases (MySQL), GUI (Swing/JavaFX), and AI/ML integration for predictive healthcare analytics.

✨ Features
Patient Management

Add patient details: ID, Name, Age, Blood Group, Allergies

Search patients by ID

View all patient records

Update and delete records

Medical History Tracking

Add medical history entries for patients (date, condition, medicines, notes)

View patient’s complete medical history

Data Persistence

Save all records to file (patients.dat) using serialization

Load data automatically when the app starts

Console Menu

Simple, user-friendly, menu-driven interface

Input validation and exception handling


🏗 System Architecture

The system is organized into several components:

Patient Class : Holds patient information and medical history list

MedicalHistory Class :Stores individual medical history entries

WalletManager Class : Handles all patient operations (add, search, delete, view, save/load)

MainApp Class:  Provides the console menu and controls program flow

🚀 Getting Started
Prerequisites

Java JDK 11 or higher

Any IDE (IntelliJ, Eclipse, VS Code) or terminal with javac

Installation

Clone the repository:

git clone https://github.com/yourusername/medical-history-wallet.git
cd medical-history-wallet


Compile the Java files:

javac *.java


Run the application:

java MainApp

🖥 Usage

When you run the application, you’ll see a console menu like this:

==== Medical History Wallet ====
1. Add Patient
2. View Patients
3. Search Patient
4. Delete Patient
5. Save & Exit


Example run:

Enter ID: 101
Enter Name: Rahul Sharma
Enter Age: 32
Enter Blood Group: B+
Enter Allergies: Penicillin

✅ Patient added successfully!


Data is automatically saved into patients.dat and loaded at the next run.

⚙️ Configuration

File Storage: Records are stored in patients.dat (created automatically).

Serialization: Patients and MedicalHistory objects implement Serializable.

🔮 Future Scope

Database Integration (MySQL): Replace file storage with a database using JDBC.

GUI: Add JavaFX/Swing interface for better usability.

Encryption: Secure medical records using Java Crypto API.

AI/ML Integration: Export data to CSV/JSON for predictive analytics (e.g., health risk predictions).

Web App: Upgrade to Spring Boot + REST APIs for a scalable solution.

📚 Concepts Covered

Object-Oriented Programming (OOP)

Java Collections (ArrayList, HashMap)

File I/O (Serialization/Deserialization)

Exception Handling

Menu-driven Console Programs
