import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("กรุณากรอกจำนวนเต็ม 10 จำนวน: ");
        
        for (int i=0; i<10; i++) {
            System.out.print("จำนวนที่ " + (i+1) + ": ");
            int number = scanner.nextInt();
            numbers.add(number);
        }

//        Collection.sort(numbers);
        
        System.out.println("จำนวนที่เรียงลำดับแล้ว: ");
        for (int number : numbers){
            System.out.print(number + " ");
        }
    }
}
