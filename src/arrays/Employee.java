package arrays;

public class Employee {
	/*
	 * 
	 * 	 * Q> WAP to store and print data 
	 *    of 10 Employees(id,name,company,salary,department,post,city):
	 *    
	 *    a> find total salary of employee.
	 *    b> print employees of IT department.
	 *    c> count employees of Admin department.
	 *    d> count and print employees of particular city.
	 *    e> calculate total salary of particular department.
	 *    f> find highest and lowest salary of employee.
	 */
	private int id;
	private String name;
	private String CompanyName;
	private double salary;
	private String department; 
	private String post;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", CompanyName=" + CompanyName + ", salary=" + salary
				+ ", department=" + department + ", post=" + post + ", city=" + city + "]";
	}
	

}
