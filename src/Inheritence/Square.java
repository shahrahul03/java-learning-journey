package Inheritence;

public class Square extends Rectangle {
	double side;
	
	public Square(double side) {
	super(side,side); //call parent constructor
	this.side =side;
	}
	public void displaySquare() {
		System.out.println("Square is a rectangle");
	}

}
