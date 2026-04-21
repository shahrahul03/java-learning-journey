package practice_3;

public class Test {
	public static void main(String[] args) {
//		engineer object 
		Engineer e = new Engineer(1,"rahul","35990",4936.3);
		

		Manager m = new Manager(2,"hari","8687",9343.43,"us-market");
		Admin a = new Admin(43,"name","hfdkj",9473);
		Director d = new Director (43,"namme", "934798",973.3,"jflkah",43794.0);
		System.out.println("Engineer");
        e.printEmployee();

        System.out.println("Manager");
        m.printEmployee();
        System.out.println("Department: " + m.getDeptName());

        System.out.println(" Admin");
        a.printEmployee();

        System.out.println(" Director ");
        d.printEmployee();
        System.out.println("Department: " + d.getDeptName());
        System.out.println("Budget: " + d.getBudget());

       
//         Test Logic
        
        System.out.println("After Salary Increase");
        e.raiseSalary(5000);  // Increase salary
        e.printEmployee();

        System.out.println("After Name Change ");
        a.setName("William ");
        a.printEmployee();
	}

}
