# Lab: Fitness Tracker
This program is meant to calculate the calories burned based off the type of exercise, time it took to complete, and the distance ran. 

## How to Run
1. Open the program on IDE.
2. Enter the type of exercise.
3. Enter the time it took to complete and the distance they ran.
4. View calculated amount of calories burned.
   
Part 1: Write Your Java Inheritance Program
Create a new project in your IDE named LabFitnessTracker. Write a Java program from scratch based on the following specifications:

Create the Parent Class (Workout):

Fields: String type and int duration (in minutes).

A method named showWorkout() that prints the workout type and duration.

Create the Child Class (RunningWorkout):

Use the extends keyword to inherit from Workout.

Add a new field: double distance (in km).

Define a method named showDetails() that calls the parent's showWorkout() method, prints the distance, and calculates/prints calories burned using the formula: distance * 60.

Create the Main Class:

Use a Scanner to prompt the user to enter the workout type, duration, and distance.

Instantiate a RunningWorkout object, assign the values, and call showDetails().

Updated README with lab instructions. 
