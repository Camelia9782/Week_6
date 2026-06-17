# 📘 Flexible Notification System
A simple Java program demonstrating how to send notifications through different channels (Email, SMS, WhatsApp) using interfaces, composition, and polymorphism.

## 🎯 Project Purpose
The purpose of this software is to show how a notification system can be designed so that different delivery channels can be swapped at runtime without changing the core logic.

It demonstrates:
- Interface‑based design
- Runtime flexibility
- Clean, maintainable object‑oriented structure
- Logging of all notifications sent

This makes the system easy to extend (e.g., adding new channels like Slack or Push) while keeping the AlertSystem unchanged.

## ⚡ Quick Start (Under 5 Minutes)
Follow these steps to run the program quickly:

1. Download or clone this repository  
2. Open either the `Assignment4` or `Assignment5` folder  
3. Compile all `.java` files:
   javac *.java
4. Run the program:
   java AlertSystem

You will see:
- Email notifications  
- SMS notifications  
- WhatsApp notifications (Assignment 5)  
- A printed log of all messages sent  

## 🖥️ Prerequisites
To run this program, you need:
- Operating System: Windows, macOS, or Linux  
- Java Runtime: Java JDK 17+  
- Hardware: Any standard computer capable of running a Java console program  

## 🧩 Components
- NotificationMedium — interface defining the `send()` method  
- EmailService — sends email notifications  
- SMSService — sends SMS notifications  
- WhatsAppService — sends WhatsApp notifications (Assignment 5)  
- AlertSystem — main controller that selects the medium, sends messages, and logs them  

## 📂 Project Structure
Assignment4/
 ├── NotificationMedium.java
 ├── EmailService.java
 ├── SMSService.java
 ├── AlertSystem.java

Assignment5/
 ├── NotificationMedium.java
 ├── EmailService.java
 ├── SMSService.java
 ├── WhatsAppService.java
 ├── AlertSystem.java

## 📌 Purpose of This Repository
This repository is designed so another engineer can easily:
- Understand the system  
- Run it immediately  
- Extend it with new notification types  
- Maintain both Assignment 4 and Assignment 5  

## 👤 Author
Camelia  
Merrimack College — CSC6301


