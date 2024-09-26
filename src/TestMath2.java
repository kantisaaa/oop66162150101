import java.util.*;
import java.lang.Math;
public class TestMath2 {
    public static void main(String[] args) {
        int x =0;
        Scanner sn = new Scanner(System.in);
        System.out.print("Input integer: ");
        try {
            x = sn.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Your Input is Mimatch!!, Pleae input Again");
        }
        System.out.println("Square Root: "+Math.sqrt(x));
    }
}
