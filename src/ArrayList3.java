import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> message = new ArrayList<>(); // สร้าง ArrayList เพื่อเก็บข้อความ

        System.out.println("กรอกข้อความ (ไม่เกิน 30 ตัวอักษร):");
        String input = scanner.nextLine();

        // ตรวจสอบความยาวของข้อความ
        if (input.length() > 30) {
            System.out.println("ข้อความที่กรอกยาวเกิน 30 ตัวอักษร!");
        } else {
            // นำข้อความใส่ใน ArrayList
            for (char c : input.toCharArray()) {
                message.add(c);
            }

            // ตรวจสอบว่าข้อความเป็นตัวอักษรตัวใหญ่ทั้งหมดหรือไม่
            boolean allUppercase = true;
            for (char c : message) {
                if (Character.isLetter(c) && !Character.isUpperCase(c)) {
                    allUppercase = false;
                    break;
                }
            }

            if (allUppercase) {
                System.out.println("ข้อความมีตัวอักษรทั้งหมดเป็นตัวใหญ่.");
            } else {
                System.out.println("ข้อความมีตัวอักษรตัวเล็กอยู่ด้วย.");
            }
        }

        scanner.close();
    }
}
