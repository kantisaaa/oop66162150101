public class RecursiveSequence {

    // Recursive method สำหรับคำนวณ g(n)
    public static int g(int n) {
        if (n == 0) {
            return 1; // base case
        } else {
            return 2 * g(n - 1); // recursive case
        }
    }

    public static void main(String[] args) {
        // พิมพ์ผลลัพธ์ของ g(n) เมื่อ 0 <= n < 10
        for (int i = 0; i < 10; i++) {
            System.out.println("g(" + i + ") = " + g(i));
        }
    }
}