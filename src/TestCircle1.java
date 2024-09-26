import java.util.Scanner;

public class TestCircle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("กรุณาใส่ตัวเลขรัศมี: ");
        double r = scanner.nextInt();
        double result = Math.PI * Math.pow(r,2);

        System.out.println("พื้นที่วงกลม: " + result);
    }
}
