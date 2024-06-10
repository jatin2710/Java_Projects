package member;

public class Employee extends Member{
	
	String spacialization;
	
	Employee(String name, String phone, String address, int age, double salary, String spacialization) {
		super(name, phone, address, age, salary);
		this.spacialization = spacialization;
	}

	@Override
	public String toString() {
		return "Employee [spacialization=" + spacialization + ", name=" + name + ", phone=" + phone + ", address="
				+ address + ", age=" + age + ", salary=" + salary + "]";
	}

	
}
