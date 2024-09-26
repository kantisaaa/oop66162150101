public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) { // วนลูปชั้นนอก (Outer loop)
            System.out.println("Outer: " + i);
            for (int j = 1; j <= 3; j++) { // วนลูปชั้นใน (Inner loop)
                System.out.println("\tInner: " + j);
            }
        }
    }
}

