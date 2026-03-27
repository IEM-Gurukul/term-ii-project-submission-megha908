[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title

Library Management System using Java (OOP)

## Problem Statement (max 150 words)

The Library Management System is designed to manage books and users efficiently. Manual library systems are time-consuming and error-prone. This system allows users to add books, view available books, issue books, and return books using a simple graphical interface. It improves accuracy and reduces manual work using Java and Object-Oriented Programming concepts.

## Target User

- Students
- Librarians
- Admin

## Core Features

- Add Book
- Show Books
- Issue Book
- Return Book
- GUI Interface using Swing 


## OOP Concepts Used

- Abstraction:Used abstract class User
- Inheritance:Student and Admin inherit User
- Polymorphism:showRole() method overridden
- Exception Handling:Used try-catch in GUI input
- Collections / Threads: ArrayList used to store books



## Proposed Architecture Description

The project follows a layered architecture:
- Model Layer: Contains classes like Book and User
- Service Layer: Handles logic such as adding, issuing, and returning books
- GUI Layer: Provides user interface using Java Swing

## How to Run

1. Open project in VS Code
2. Open terminal inside src folder
3. Compile:
   javac gui/*.java model/*.java service/*.java Main.java
4. Run:
   java Main

## Git Discipline Notes
Minimum 10 meaningful commits required.

