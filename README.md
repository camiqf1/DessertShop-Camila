Dessert Shop Application - Lab 3a
This project involves building a dessert shop application that demonstrates the principles of object-oriented programming (OOP), including inheritance, encapsulation, and method overriding. The application allows for modeling different dessert items (Candy, Cookie, IceCream, and Sundae) with relevant attributes and behaviors.

Features
Object-Oriented Design:
Inheritance hierarchy: DessertItem serves as the base class.
Derived classes: Candy, Cookie, IceCream, and Sundae.
Encapsulation:
All attributes are private with appropriate getters and setters.
Custom Constructors:
Each class supports constructors for easy object creation.
Unit Testing:
Comprehensive JUnit 5 test suite to validate class structure and functionality.
Learning Objectives
Understand and implement class inheritance.
Learn encapsulation by using private attributes and public methods.
Practice creating and using constructors with parameters.
Explore unit testing with JUnit.
Class Structure
1. DessertItem (Base Class)
Attributes: name (String)
Methods:
Getters and setters for name.
2. Candy (Extends DessertItem)
Attributes:
candyWeight (double)
pricePerPound (double)
Methods:
Getters and setters for candyWeight and pricePerPound.
3. Cookie (Extends DessertItem)
Attributes:
cookieQty (int)
pricePerDozen (double)
Methods:
Getters and setters for cookieQty and pricePerDozen.
4. IceCream (Extends DessertItem)
Attributes:
scoopCount (int)
pricePerScoop (double)
Methods:
Getters and setters for scoopCount and pricePerScoop.
5. Sundae (Extends IceCream)
Attributes:
toppingName (String)
toppingPrice (double)
Methods:
Getters and setters for toppingName and toppingPrice.
How to Use
Setup the Project:
Clone the repository.
Ensure you have a Java development environment with JUnit 5.
Compile the Code:
Compile all Java files in the DessertShop package.
Run Tests:
Execute the JUnit test suite (Lab3aTests) to validate your implementation.
