import com.jatin.assignment.utilities.EmployeeUtilities;
import com.jatin.assignment.employee.Manager;
import com.jatin.assignment.employee.Developer;

/**
 * The AssignmentMain class is the entry point of the application.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        // Create a Manager instance
        Manager manager = new Manager();
        manager.setName("Alice");
        manager.setEmployeeId(101);
        manager.setSalary(90000);
        manager.setDepartment("Engineering");

        // Create a Developer instance
        Developer developer = new Developer();
        developer.setName("Bob");
        developer.setEmployeeId(102);
        developer.setSalary(80000);
        developer.setProgrammingLanguage("Java");

        // Use EmployeeUtilities to print details
        System.out.println("Manager Details:");
        EmployeeUtilities.printEmployeeDetails(manager);

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.printEmployeeDetails(developer);
    }
}