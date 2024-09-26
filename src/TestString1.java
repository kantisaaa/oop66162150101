import java.util.Scanner;

public class TestString1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("กรุณาป้อนข้อความ: ");
        String input = scanner.nextLine();

        int length = input.length();
        int e = input.indexOf("e",0);
        e++;
        System.out.println("ป้อนข้อความ: "+input);
        System.out.println("ความยาวข้อความ: "+length);
        System.out.println("ตำแหน่งตัว E: "+e);

        scanner.close();
    }
}
