import java.time.LocalDate;

public class User {
    // Fields
    private String name;
    private LocalDate dob;

    // Constructors
    public User() { // Default constructor
        this.name = null;
        this.dob = LocalDate.now();
    }

    public User(String name, int year, int month, int day) { // Parameterized constructor
        this.name = name;
        this.dob = LocalDate.of(year, month, day);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for dob
    public LocalDate getDob() {
        return dob;
    }

    // Setter for dob
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    // Method to display user information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
    }
}
