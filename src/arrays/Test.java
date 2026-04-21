package arrays;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		store and print data of five products 
//		create array 
//		Product products [] = new Product[3];
////		write data in array 
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i =0; i<products.length; i++) {
//			Product p = new Product();
//			System.out.println("enter id");
//			p.setId(sc.nextInt());
//			System.out.println("name");
//			p.setName(sc.next());
//			System.out.println("company");
//			p.setCompany(sc.next());
//			System.out.println("price");
//			p.setPrice(sc.nextInt());
////			p.setId(3409);
////			p.setName("mobile");
////			p.setPrice(947);
////			p.setCompany("cg");
//			products[i]= p;
//		}
////		read data from array 
//		int tp = 0;
//		for (Product pd :products) {
//			System.out.println(pd);
//			tp = tp+pd.getPrice();
//		}
//		System.out.println("total price ="+tp);
//		String cName = "";
//		for (Product pds : products) {
//			System.out.println(pds);
//			cName = cName+ pds.getCompany();
//		}
//		System.out.println("company name"+ cName);
		
		Employee[] employees = new Employee[3];
		Scanner sc = new Scanner(System.in);

	
		// 🔹 Step 1: Input Employee Data

		for (int i = 0; i < employees.length; i++) {
		    Employee e = new Employee();

		    System.out.println("Enter id:");
		    e.setId(sc.nextInt());
		    sc.nextLine(); // Clear buffer after number input

		    System.out.println("Enter name:");
		    e.setName(sc.nextLine());

		    System.out.println("Enter company name:");
		    e.setCompanyName(sc.nextLine());

		    System.out.println("Enter salary:");
		    e.setSalary(sc.nextDouble());
		    sc.nextLine(); // Clear buffer

		    System.out.println("Enter department:");
		    e.setDepartment(sc.nextLine());

		    System.out.println("Enter post:");
		    e.setPost(sc.nextLine());

		    System.out.println("Enter city:");
		    e.setCity(sc.nextLine());

		    // Store object in array
		    employees[i] = e;
		}


		// 🔹 Step 2: Print All Employees
		
		System.out.println("\n--- All Employees ---");
		for (int i = 0; i < employees.length; i++) {
		    System.out.println(employees[i]); // Calls toString()
		}

	
		// 🔹 (a) Total Salary of All Employees
		
		double totalSalary = 0;
		for (int i = 0; i < employees.length; i++) {
		    totalSalary += employees[i].getSalary();
		}
		System.out.println("\nTotal Salary of Employees: " + totalSalary);

		
		// 🔹 (b) Print Employees of IT Department
	
		System.out.println("\n--- IT Department Employees ---");
		for (int i = 0; i < employees.length; i++) {
		    if (employees[i].getDepartment().equals("IT")) {
		        System.out.println(employees[i]);
		    }
		}

	
		// 🔹 (c) Count Employees of Admin Department
		
		int adminCount = 0;
		for (int i = 0; i < employees.length; i++) {
		    if (employees[i].getDepartment().equals("Admin")) {
		        adminCount++;
		    }
		}
		System.out.println("\nTotal Admin Employees: " + adminCount);

		
		// 🔹 (d) Count & Print Employees of Particular City
	
		String targetCity = "ktm";
		int cityCount = 0;

		System.out.println("\n--- Employees from " + targetCity + " ---");
		for (int i = 0; i < employees.length; i++) {
		    if (employees[i].getCity().equals(targetCity)) {
		        System.out.println(employees[i]);
		        cityCount++;
		    }
		}
		System.out.println("Total Employees in " + targetCity + ": " + cityCount);

	
		// 🔹 (e) Total Salary of Particular Department
		
		String targetDept = "IT";
		double deptSalary = 0;

		for (int i = 0; i < employees.length; i++) {
		    if (employees[i].getDepartment().equals(targetDept)) {
		        deptSalary += employees[i].getSalary();
		    }
		}
		System.out.println("\nTotal Salary of " + targetDept + " Department: " + deptSalary);

		
		// 🔹 (f) Highest and Lowest Salary
		
		double max = employees[0].getSalary();
		double min = employees[0].getSalary();

		for (int i = 1; i < employees.length; i++) {
		    double salary = employees[i].getSalary();

		    if (salary > max) {
		        max = salary;
		    }

		    if (salary < min) {
		        min = salary;
		    }
		}

		System.out.println("\nHighest Salary: " + max);
		System.out.println("Lowest Salary: " + min);
		
	}
}