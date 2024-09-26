import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        int [] num = new int[10];
        int max=0;
        Scanner sn = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.print("Input Number["+i+"]: ");
            num[i]= sn.nextInt();
        }
        for(int i=0;i<10;i++){
            if(i==0){
                max=num[i];
            } else{
                if(num[i]>max){
                    max=num[i];
                }
            }
        }
        System.out.println("Max Number: "+max);
    }
}