# Java Training Exercises

## Introduction

This repository contains the exercises for the Java training. The aim is to discover the Java programming language and its features.
For each exercise, don't forget to create a main method to test/run your code.  

## Getting Started

1. Create a new Java blank project in your favorite IDE, JDK 21.
2. Initialize a new Git repository in your project.
3. Create a new package `fr.ynov.java` in the `src` folder.

## Exercises - Easy

For all exercises, create a new Java class in the `fr.ynov.java.easy` package.

### 1. Hello World

Create a simple Java program that prints "Hello, World!" to the console.
Add a class "HelloWorld" in the package.

### 2. Loops

Create a Java program that prints the numbers from 1 to 10 using a `for` loop. 
Add a class "For" in the package. 

Do the same using a `while` loop.  
Add a class "While" in the package.

Do the same using a `do while` loop.  
Add a class "DoWhile" in the package.

### 3. Arrays

Create a Java program that creates an array of integers and prints the elements of the array.  
Add a class "Array" in the package.

Use for and foreach loops to print the elements of the array.

### 4. Scanners

Create a Java program that asks the user for his name and age and prints them.  
Add a class "ScanMe" in the package.

Create a Java program that asks the user for a number and prints if this number is even or odd.  
Add a class "EvenOrOdd" in the package.

### 5. Main args

Create a Java program that takes 2 number as arguments, then asking the user for an operator (+, -, *, /) and prints the result of the operation.  
Add a class "Calculator" in the package.

## Exercises - Medium

For all exercises, create a new Java class in the `fr.ynov.java.medium` package.

### 1. Methods

Create a Java program that contains a method that takes a number as a parameter and returns the square of this number.
Add a class "Square" in the package.

The method should be static.

Updates the program to read the number from the user OR from the arguments (you choose). Then call the method and print the result.

Reflexion: What is the difference between a static method and a non-static method?

### 2. Classes and Enum

Create a class `Person` with the following attributes:
- `name` (String)
- `age` (int)
- `gender` (String)
- `height` (float)
- `weight` (float)
- `nationality` (Enum)

Create a constructor that takes all the attributes as parameters.  
Create a method that prints all the attributes of the person.  

Add a class "Person" in the package.

Updates the `Person` class to remove the age attribute and add a `birthDate` attribute (Date).
Create a method that calculates the age of the person based on the birthdate.  
Hint: You can use LocalDate & Period for this.

For testing your class, create a `public static void main(String[] args)` method in the `Person` class.

Reflexion: Looks on the JavaDoc the Record class. What is the difference between a Record and a Class and a Enum?

### 3. Quality of Objects

Create a Java class `Quality` with the following attributes:
- `id` (int)
- `name` (String)

On a main class, create 2 Quality objects with the same id and name and compare them using the `==` operator, then using the `equals` method.

After that, override the `equals` and `hashCode` methods to ensure that two `Quality` objects are considered equal if they have the same `id` and `name`.

Add a class "Quality" in the package.

#### 4. Reading files

Create a Java program that reads a file and prints its content. The file must be created by yourself and contain some text.

Add a class "ReadFile" in the package.  

Update the methods to create a folder that contains multiples files and read all the files in the folder.

#### 5. Writing files

Create a Java program that reads a file and write its content in another file. The reading file must be created by yourself and contain some text. 
The output file must be created by the program, don't forget to close the file after writing.  

#### 6. Palindrome

Create a Java program that reads a word from the user and prints if this word is a palindrome or not.  
A palindrome is a word that reads the same backward as forward.  

Add a class "Palindrome" in the package.

#### 7. Rock Paper Scissors game

Create a Java program that plays the Rock Paper Scissors game.  
The program should ask the user to choose between Rock, Paper, and Scissors. 
Then the program should randomly choose one of the three options and print the result.  

Put all the classes (records, enums, classes, etc.) in the package `fr.ynov.java.game`.  

Try to separate the logic of the game from the main class. Use class attributes to store the game state. 

It can also be interested to have a Player class that contains the name and the score of the player. 
It can be useful to ask the user to enter his name at the beginning of the game.  

Write a beautiful code with comments, good structure, good naming methods, good visibility, etc.

Bonus : you can save the best score in a file and read it at the beginning of the game. Like a leaderboard.  
