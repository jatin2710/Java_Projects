package employeedata;

public class Stud
{

		 private String name;

		    // Default constructor
		    public Stud() 
		    {
		        this.name = "Unknown";
		    }
		    
		    // Parameterized constructor
		    public Stud(String name) 
		    {
		        this.name = name;
		    }

		    // Getter for name
		    public String getName() 
		    {
		        return name;
		    }

		    public static void main(String[] args) 
		    {
		    	// Creating object without passing Name
		    	Stud Stud1 = new Stud();
		    	System.out.println("Stud Name : "+ Stud1.getName());
		    	
		    	// Creating object with passing Name
		    	Stud Stud2 = new Stud("Alish");
		    	System.out.println("Stud Name : "+ Stud2.getName());
		    }
}

	


