import java.util.Scanner;

class TemCalculate1 {
    public static void main(String args[] ){
        Scanner sc = new Scanner( System.in );
        double f = 0.0;
        try {
            System.out.print("กรุณากรอก องศาฟาเรนไฮต์ (F) : ");
            f = sc.nextDouble();
        } catch( Exception e ) {
            f = 0;
        }
        if( f > 0 ) {
            double c = ( f - 32 ) * 5 / 9;
            System.out.printf("%.2f องศาฟาเรนไฮต์ (F) เท่ากับ %.2f องศาเซลเซียส (C)", f, c);
        }
    }
}