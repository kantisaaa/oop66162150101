import java.util.Scanner;

public class InputCharDetect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("กรุณาป้อนอักขระ: ");
        try {
            char ch = scanner.next().charAt(0);

            if (Character.isDigit(ch)) {
                System.out.println(ch + " เป็นตัวเลข");
            } else {
                System.out.println(ch + " ไม่ใช่ตัวเลข");
            }
        } catch (Exception e) {
            System.out.println("ข้อมูลที่ป้อนไม่ถูกต้อง กรุณาป้อนอักขระตัวเลขเท่านั้น");
        }
    }
}