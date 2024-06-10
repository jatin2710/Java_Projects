package member;

public class MainClass {
	
	public static void main(String args[]) {

		Employee emp = new Employee("Ankit", "9090909090", "Ahmedabad",34,85000,"JAVA");
		Manager m1 = new Manager("Rohan Singh", "9898989898", "Nepal", 45,130000,"Android Development");
		
		System.out.println(emp);
		System.out.println(m1);
	}
}
