import java.util.*;

public class RadiusValue {
        public static void main(String[] args) {
            double r = 0.0d;
            Scanner sn = new Scanner(System.in);
            System.out.println("Please Enter Radius: then press Enter");
           try {
               r = sn.nextDouble();
           }
           catch (InputMismatchException e) {
                String s = sn.nextLine();
                System.out.println("Invalid Radius: " +s);
            }

            System.out.println("Radius:"+ r);
    }

}
