package OverridingExercise;

public class Test {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println( c.add(4.4, 3.40));
		System.out.println (c.add(3, 2));
		System.out.println (c.add(1,2, 43));
		
		Shape s = new Shape();
		s.draw();
		s = new Triangle();
		s.draw();
		s= new Rectangle();
		s.draw();
		s = new Circle();
		s.draw();
		
		
	}

}
