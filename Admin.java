import java.time.LocalDate;

public class Admin extends User {
    // Constructor เรียกใช้ Superclass (User)
    public Admin(String name, int year, int month, int day) {
        super(name, year, month, day);
    }

    // Override Method displayInfo()
    @Override
    protected void displayInfo() {
        super.displayInfo(); // เรียกใช้ method displayInfo() จาก User
        System.out.println("User type: admin");
    }

    // Overload Method displayInfo(boolean full)
    protected void displayInfo(boolean full) {
        if (full) {
            displayInfo(); // แสดงข้อมูลเต็ม
            System.out.println("Today's Date: " + LocalDate.now());
        } else {
            System.out.println("User type: admin");
        }
    }
}
