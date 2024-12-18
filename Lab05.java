public class Lab05 {
    public static void main(String[] args) {
        // Step 3: สร้าง Instance ของ User
        User john = new User("John", 1954, 2, 18); // User ชื่อ John เกิดวันที่ 18 ก.พ. 1954
        System.out.println("=== User Information ===");
        john.displayInfo(); // แสดงข้อมูลของ User

        System.out.println("\n=== Admin Information ===");
        // Step 4: สร้าง Instance ของ Admin
        Admin nicolas = new Admin();
        nicolas.setName("Nicolas"); // ตั้งชื่อ Admin เป็น Nicolas
        nicolas.setDob(java.time.LocalDate.of(1964, 1, 7)); // กำหนดวันเกิด Admin เป็น 7 ม.ค. 1964

        // เรียกใช้ displayInfo() ที่ถูก Override
        nicolas.displayInfo();

        System.out.println("\n=== Admin Information (Full Details) ===");
        // เรียกใช้ displayInfo(boolean full) ที่ถูก Overload
        nicolas.displayInfo(true); // แสดงรายละเอียดเต็ม (full = true)

        System.out.println("\n=== Admin Information (Short Details) ===");
        nicolas.displayInfo(false); // แสดงเฉพาะ User type เท่านั้น
    }
}
