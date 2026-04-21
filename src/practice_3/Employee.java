package practice_3;

public class Employee {
	private int empID;
	private String name;
	private String ssn;
	private double salary;
	
	public Employee (int empID, String name, String ssn, double salary) {
		this.empID= empID;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
		
	}

	public int getEmpID() {
		return empID;
	}

	public String getName() {
		return name;
	}

	public String getSsn() {
		return ssn;
	}

	public double getSalary() {
		return salary;
	}

	

	public void setName(String name) {
		
		if (name != null && !name.isEmpty()) {
			this.name = name;
			
		}
		else {
			System.out.println("invalid name");
		}
		
	}
	public void raiseSalary(double increase) {
		if (increase >0) {
			salary += increase;
		}
		else {
			System.out.println("invalid salary ");
			}
		}
	public void printEmployee() {
		System.out.println("id: "+ empID);
		System.out.println("Name: "+ name);
		System.out.println("SSn: "+ ssn);
		System.out.println("Salary: "+ salary);
	}

	
	

}
