//package Inheritence;
//
//public class Test {
//	public static void main(String[] args) {
////		Programmer p = new Programmer();
////		p.id =343;
////		p.name="rahul";
////		p.company = "meta";
////		p.bonus=900;
////		p.progLang="java";
////		p.project="fb";
////		p.phone="989894334";
////		
////		p.print();
////		Rectangle object
//		Rectangle r = new Rectangle(10,9.08);
//		r.area();
//		r.perimeter();
////		square object
//		Square s = new Square(4);
//		s.area();
//		s.perimeter();
////		step 1 create array of square objects size 10;
//		Square[] squares = new Square[10];
////		step 2 create square objects and store in array 
//		for (int i = 0; i< squares.length; i++) {
//			squares[i] = new Square (i+1); //side = 1to 10
//		}
////		step 3 loop through array and print area
//		for (int i =0; i< squares.length; i++) {
//			System.out.println("Square"+ (i+1)+ "->");
//			squares[i].area();
//		}
//		
//		Circle c = new Circle();
//		s.displayShape();
//		s.displayRectangle();
//		s.displaySquare();
//		c.displayCircle();
//		
//		
//	}
//
//}

package Inheritence;

public class Test {
    public static void main(String[] args) {

      
        // 🔹 Rectangle Object
        
        // Create a Rectangle object with length = 10 and breadth = 9.08
        Rectangle r = new Rectangle(10, 9.08);

        // Call methods to calculate and print area and perimeter
        r.area();
        r.perimeter();
      
        // Square Object
        
        // Create a Square object with side = 4
        Square s = new Square(4);

        // Square inherits area() and perimeter() from Rectangle
        s.area();
        s.perimeter();


               // Array of Square Objects
       
        // Step 1: Create an array to store 10 Square objects
        Square[] squares = new Square[10];

        // Step 2: Initialize each element of array with Square objects
        for (int i = 0; i < squares.length; i++) {
            // Creating Square with side values from 1 to 10
            squares[i] = new Square(i + 1);
        }

        // Step 3: Loop through array and print area of each square
        for (int i = 0; i < squares.length; i++) {
            System.out.println("Square " + (i + 1) + " -> ");
            squares[i].area(); // Call area method for each object
        }

        
        //  Inheritance Demonstration
        

        // Create Circle object
        Circle c = new Circle();

        // Using Square object to call methods from:
        // 1. Shape class (grandparent)
        s.displayShape();

        // 2. Rectangle class (parent)
        s.displayRectangle();

        // 3. Square class (itself)
        s.displaySquare();

        // Calling Circle's own method
        c.displayCircle();
        
    }
}
