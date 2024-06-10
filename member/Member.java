package member;

public class Member {
	
	String name, phone, address;
	int age;
	double salary;
	
	Member(String name,String phone,String address,int age,double salary){
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.age = age;
		this.salary = salary;
	}
	
	void printSalary() {
		System.out.println("Salary: "+this.salary);
	}
}
