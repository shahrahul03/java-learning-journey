package Inheritence;

public class Rectangle extends Shape {
	double length;
	double breadth;
	
	public Rectangle (double length, double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public void area() {
	 double area = length *breadth;
	System.out.println("Area:"+area);
	}
	public void perimeter () {
	double perimeter = 2*(length+breadth);
		System.out.println("perimeter:"+perimeter);
	}
	public void displayRectangle() {
		System.out.println("This is rectangular shape");
	}
}
