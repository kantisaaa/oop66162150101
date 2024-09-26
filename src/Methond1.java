import java.util.Scanner;
public class Methond1 {

    // Method สำหรับนับจำนวนสระภาษาอังกฤษ
    public static int countVowels(String input) {
        int count = 0;
        String vowels = "AEIOUaeiou";  // สระภาษาอังกฤษทั้งพิมพ์ใหญ่และพิมพ์เล็ก

        for (int i = 0; i < input.length(); i++) {
            if (vowels.indexOf(input.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("กรุณากรอกข้อความ: ");
        String input = scanner.nextLine();

        int vowelCount = countVowels(input);
        System.out.println("จำนวนสระในข้อความคือ: " + vowelCount);
    }
}