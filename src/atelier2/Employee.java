package atelier2;

public class Employee {
    
	private int id , salary;
	private String firstName , lastName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}
	public Employee(int id, int salary, String firstName, String lastName) {
		this.id = id;
		this.salary = salary;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getAnnualSalary() {
		return salary * 12;
	}
	
	public int raiseSalary(int percent) {
		return salary + (salary*(percent/100));
	}
	
	
	
	
	
}
