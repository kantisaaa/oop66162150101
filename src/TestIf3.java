import java.util.Scanner;

public class TestIf3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("กรอกตัวเลขจำนวนเต็ม (1-100):");
        int marks = scanner.nextInt();

        if(marks< 50){
            System.out.println("fail");
        }
        else if (marks<60){
            System.out.println("D grade");
        }
        else if (marks<70){
            System.out.println("C grade");
        }
        else if (marks <80){
            System.out.println("B grade");
        }
        else if (marks< 90){
            System.out.println("A grade");
        }
        else if (marks<101){
            System.out.println("A+ grade");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
