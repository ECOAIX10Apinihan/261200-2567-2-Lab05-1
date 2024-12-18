public class Lab05 {
    public static void main(String[] args) {
        // สร้าง User instance
        User john = new User("John", 1954, 2, 18);
        System.out.println("=== User Information ===");
        john.displayInfo();

        // สร้าง User instance สำหรับ Sylvester
        User sylvester = new User("Sylvester", 1946, 7, 6);
        System.out.println("\n=== User Information (Sylvester) ===");
        sylvester.displayInfo();

        // สร้าง Admin instance
        Admin nicolas = new Admin("Nicolas", 1964, 1, 7);
        System.out.println("\n=== Admin Information ===");
        nicolas.displayInfo(); // Override Method

        System.out.println("\n=== Admin Information (Full Details) ===");
        nicolas.displayInfo(true); // Overloaded Method

        System.out.println("\n=== Admin Information (Short Details) ===");
        nicolas.displayInfo(false); // Overloaded Method
    }
}
