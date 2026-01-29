# Prathista-lostfoud-project
1. INTRODUCTION

Lost items are a common problem in public places such as colleges, offices, malls, and transport stations. Managing lost and found items manually is inefficient and error-prone.

The Lost Item Reporting System is a menu-driven command line application developed using Core Java, MySQL, and JDBC. It helps users to record lost and found items digitally and retrieve them easily from a database.

2. OBJECTIVES OF THE PROJECT

* To develop a simple console-based application using Java
* To understand database connectivity using JDBC
* To store lost and found item details in a MySQL database
* To perform CRUD operations (Create and Read)
* To build a beginner-friendly menu-driven application

3. SCOPE OF THE PROJECT

* Users can report lost items
* Users can report found items
* Users can view all lost items
* Users can view all found items
* The system works in a command line environment
* Designed for academic and learning purposes


4. TECHNOLOGIES USED
Technology	Description
Core Java	Application logic
MySQL	Database storage
JDBC	Java–Database connectivity
Eclipse / IntelliJ	IDE
MySQL Workbench / XAMPP	Database management



5. SYSTEM REQUIREMENTS
Hardware Requirements

Processor: Intel i3 or higher

RAM: 4 GB minimum

Hard Disk: 10 GB free space

Software Requirements

JDK 8 or above

MySQL Server 8.x

MySQL Connector/J

Java IDE (Eclipse / IntelliJ)

6. PROJECT STRUCTURE
LostItemSystem/
│
├── Main.java
├── DBConnection.java
├── LostFoundDAO.java

7. DATABASE DESIGN
Database Name
lost_found_db

Table: lost_items
Field Name	Data Type
id	INT (Primary Key, Auto Increment)
item_name	VARCHAR(100)
location	VARCHAR(100)
lost_date	DATE
Table: found_items
Field Name	Data Type
id	INT (Primary Key, Auto Increment)
item_name	VARCHAR(100)
location	VARCHAR(100)
found_date	DATE



8. MODULE DESCRIPTION
8.1 DBConnection Module

Establishes connection between Java and MySQL

Uses JDBC DriverManager

Returns a Connection object

8.2 LostFoundDAO Module

Handles all database operations

Uses PreparedStatement to insert data

Retrieves records using ResultSet

8.3 Main Module

Displays menu options

Accepts user input

Calls DAO methods based on user choice

Controls application flow

9. FUNCTIONAL REQUIREMENTS

* User can add lost item details
* User can add found item details
* User can view lost item records
* User can view found item records
* User can exit the application safely



10. NON-FUNCTIONAL REQUIREMENTS

* Simple user interface
* Fast database access
* Secure database operations using PreparedStatement
* Easy to maintain and extend



11. WORKING OF THE SYSTEM

* User starts the application
* Menu options are displayed
* User selects an option
* Input data is taken from the user
* JDBC connects Java with MySQL
* Data is stored or retrieved from the database
* Output is displayed on the console



12. SAMPLE OUTPUT
===== LOST ITEM REPORTING SYSTEM =====
1. Report Lost Item
2. Report Found Item
3. View Lost Items
4. View Found Items
5. Exit

Item name: purse
Location: gottigere
Date: 2026-01-29
Lost item reported successfully.



13. ADVANTAGES OF THE SYSTEM

* Reduces manual record keeping
* Easy to use and understand
* Efficient data storage
* Suitable for beginners
* Real-world application concept



14. LIMITATIONS OF THE SYSTEM

* No user authentication
* No update or delete functionality
* Command line interface only
* No automatic matching of lost and found items



15. FUTURE ENHANCEMENTS

* Add update and delete operations
* Implement user login system
* Convert CLI to GUI using JavaFX
* Add search functionality
* Generate reports



16. CONCLUSION

The Lost Item Reporting System successfully demonstrates how Java applications can interact with a MySQL database using JDBC. The project helps in understanding core Java concepts, database connectivity, and menu-driven programming. It is suitable for academic use and can be enhanced further.

17. REFERENCES

* Java Documentation – Oracle
* MySQL Official Documentation
* JDBC API Documentation
