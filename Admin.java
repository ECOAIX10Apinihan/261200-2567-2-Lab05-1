public class Admin extends User {
    // Overriding the displayInfo method
    @Override
    public void displayInfo() {
        // ใช้ Getter เพื่อดึงค่า name และ dob จาก User
        System.out.println("Name: " + getName());
        System.out.println("Date of Birth: " + getDob());
        System.out.println("User type: admin");
    }

    // Overloading displayInfo method
    public void displayInfo(boolean full) {
        if (full) {
            // Full details
            displayInfo(); // Call the overridden method
            System.out.println("Today's Date: " + java.time.LocalDate.now());
        } else {
            System.out.println("User type: admin");
        }
    }
}
