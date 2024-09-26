import java.util.InputMismatchException;
import java.util.Scanner;

public class SwitchVowell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("กรอกตัวอักษร (A-Z) (a-z):");
        try {
            int ch = scanner.nextInt();
            System.out.println("Input charactor: ");
        }
        catch (InputMismatchException e) {
            char ch = scanner.next().charAt(0);
            ch= Character.toLowerCase(ch);
            switch (ch) {case'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println("Vowel");
                break;
                default:
                    System.out.println("Consonant");
            }
        }
    }
}
