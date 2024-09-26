import java.util.Scanner;

public class TestIf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("กรอกตัวเลขจำนวนเต็ม (1-10):");
        int num = scanner.nextInt();
if(num<1 || num >10){
    System.out.println("Invalid!!!");
} else {
    if (num > 5) {
        System.out.println("num more than 5");
    } else {
        System.out.println("num less than 5");
    }
}
    }
}
