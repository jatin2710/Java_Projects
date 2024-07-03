import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Person {
    private String name;
    private String address;
    private String telephoneNumber;
    private String mobileNumber;
    private String headOfFamily;
    private String uniqueID;

    public Person(String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily, String uniqueID) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.mobileNumber = mobileNumber;
        this.headOfFamily = headOfFamily;
        this.uniqueID = uniqueID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getHeadOfFamily() {
        return headOfFamily;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}

public class Directory {
    private Map<String, Person> directory;
    private Scanner scanner;

    public Directory() {
        this.directory = new HashMap<>();
        this.scanner = new Scanner(System.in);
    }

    public void createEntry() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter telephone number (if available): ");
        String telephoneNumber = scanner.nextLine();
        System.out.print("Enter mobile number (if available): ");
        String mobileNumber = scanner.nextLine();
        System.out.print("Enter head of family: ");
        String headOfFamily = scanner.nextLine();
        System.out.print("Enter unique ID: ");
        String uniqueID = scanner.nextLine();

        if (directory.containsKey(uniqueID)) {
            System.out.println("Unique ID already exists. Please try again.");
            return;
        }

        Person person = new Person(name, address, telephoneNumber, mobileNumber, headOfFamily, uniqueID);
        directory.put(uniqueID, person);
        System.out.println("Entry created successfully!");
    }

    public void editEntry() {
        System.out.print("Enter unique ID of the entry to edit: ");
        String uniqueID = scanner.nextLine();

        if (!directory.containsKey(uniqueID)) {
            System.out.println("Entry not found. Please try again.");
            return;
        }

        Person person = directory.get(uniqueID);
        System.out.print("Enter new telephone number (if available): ");
        String telephoneNumber = scanner.nextLine();
        System.out.print("Enter new mobile number (if available): ");
        String mobileNumber = scanner.nextLine();

        person.setTelephoneNumber(telephoneNumber);
        person.setMobileNumber(mobileNumber);
        System.out.println("Entry edited successfully!");
    }

    public void displayMenu() {
        System.out.println("Directory Menu:");
        System.out.println("1. Create a database entry");
        System.out.println("2. Edit an entry");
        System.out.println("3. Exit");
    }

    public static void main(String[] args) {
        Directory directory = new Directory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            directory.displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    directory.createEntry();
                    break;
                case 2:
                    directory.editEntry();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}