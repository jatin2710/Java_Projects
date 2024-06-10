package LJKU;

public class Faculty {
	String name,email;
	int salary;
	
	public Faculty() {
		name = "defaultName";
		email = "defaultEmail";
		salary = 000;
	}
	
	

	public Faculty(String name, String email, int salary) {
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Faculty [name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}
}
