package OverridingExercise;
//## *Lab Exercise 2: Method Overriding (Runtime Polymorphism)*
//
//*Objective:* Implement runtime polymorphism using inheritance.
//
//*Task:*
//
//* Create a base class Shape with method draw()
//* Create subclasses Circle, Rectangle, Triangle
//* Override draw() in each subclass
//
//*Requirements:*
//
//* Use base class reference to call subclass methods
//* Demonstrate dynamic method dispatch
//
//---

public class Shape {
	public void draw() {
		System.out.println("draw");
	}

}
