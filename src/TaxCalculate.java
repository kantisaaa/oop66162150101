import java.util.Scanner;

public class TaxCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("กรุณาป้อนรายได้ของบุคคลที่ " + i + ": ");
            try {
                double income = scanner.nextDouble();

                double taxRate;
                if (income < 100000) {
                    taxRate = 0.05;
                } else if (income < 500000) {
                    taxRate = 0.1;
                } else if (income < 1000000) {
                    taxRate = 0.2;
                } else if (income < 4000000) {
                    taxRate = 0.3;
                } else {
                    taxRate = 0.37;
                }

                double tax = income * taxRate;
                System.out.println("ภาษีที่ต้องชำระของบุคคลที่ " + i + " คือ: " + tax + " บาท");
            } catch (Exception e) {
                System.out.println("ข้อมูลที่ป้อนไม่ถูกต้อง กรุณาป้อนตัวเลขเท่านั้น");
                i--;
            }
        }
    }
}