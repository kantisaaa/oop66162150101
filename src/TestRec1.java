import java.util.Scanner;

public class TestRec1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("กรุณาใส่ความยาว: ");
        int length = scanner.nextInt();

        System.out.print("กรุณาใส่ความกว้าง: ");
        int width = scanner.nextInt();

        int area = length * width;

        System.out.println("พื้นที่สี่เหลี่ยมผืนผ้า: " + area);
    }
}

