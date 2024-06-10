package member;

public class Manager extends Member{
	
	String department;
	
	Manager(String name, String phone, String address, int age, double salary,String department) {
		super(name, phone, address, age, salary);
		this.department = department;
	}

	@Override
	public String toString() {
		return "Manager [department=" + department + ", name=" + name + ", phone=" + phone + ", address=" + address
				+ ", age=" + age + ", salary=" + salary + "]";
	}

	
	
}
