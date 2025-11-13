
# ☕ Java Fundamentals — OOP Concepts in Action

This project demonstrates **core Object-Oriented Programming (OOP)** principles in Java — including **classes, constructors, polymorphism, method overloading, and method overriding** — through three simple yet insightful console programs.  

Each question builds on foundational OOP concepts and helps strengthen your understanding of how Java structures real-world logic. 🚀

---

## 🧩 QUESTION 1 — Product Management Console App

### 📝 Task Description

Write a Java console application that:
1. Defines a `Product` class with:
   - `ProductId`
   - `ProductName`
   - `ProductDescription`
   - `ProductQuantity`
2. Overrides a method to display a product’s details.
3. Uses a constructor to initialize all instance variables.
4. Creates and displays a **list of products**.

### 💻 Implementation Summary

- The `Product` class includes all required fields.  
- A **constructor** initializes the fields when a product is created.  
- The `toString()` method is **overridden** to neatly display product details.  
- A **list of products** is created and displayed using a simple loop.

### 🧠 Concepts Practiced
- Classes and Objects  
- Constructors  
- Method Overriding (`toString`)  
- Lists and Iteration


---

## 🔺 QUESTION 2 — Polymorphism, Overloading & Overriding

### 📝 Task Description

Polymorphism allows objects of different classes to be treated uniformly via shared interfaces or base classes.  
- **Method Overloading** → same method name, different parameters (compile-time polymorphism).  
- **Method Overriding** → same method name, same parameters, but redefined in a subclass (runtime polymorphism).  

Create a Java program to:
1. Demonstrate **method overloading**.  
2. Differentiate **overloading** vs **overriding** in a clear example.

### 💻 Implementation Summary

- Created an abstract `Shape` class with an abstract method `Area()`.  
- Implemented subclasses:
  - `Rectangle` (with overloaded `Area()` methods)
  - `Square` (which **overrides** the parent `Area()` method)
- Demonstrated compile-time and runtime polymorphism in the main class.

### 🧠 Concepts Practiced
- Abstract Classes  
- Method Overloading  
- Method Overriding  
- Compile-time vs Runtime Polymorphism  



---

## ⚽ QUESTION 3 — Constructors in Action

### 📝 Task Description

In Java, a **constructor** is a special method called automatically when an object is created using `new`.  
Its role is to **initialize** the object’s state or perform setup tasks.

Tasks:
1. Describe how constructors differ from regular methods.  
2. Write a full Java program demonstrating the use of constructors.

### 💻 Implementation Summary

- Created a `Team` class with a single field `team`.  
- The **constructor** initializes the team name and prints a message when called.  
- The `display()` method is a normal function used to show team information.

### ⚙️ Features of a Constructor
- Same name as the class.  
- No return type (not even `void`).  
- Automatically called when an object is created.  
- Can be **parameterized** or **default**.  
- Used for **initializing objects**, not general logic.

### 🧠 Concepts Practiced
- Constructors  
- Object Instantiation  
- Instance Variables and Methods  

