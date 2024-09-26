import java.util.*;
public class Array3 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int con=0;
        System.out.print("Input Sentence: ");
        try {
            String str= sn.nextLine();
            if(str.length()>30){
                System.out.print("you cannot input your Sentence more 30 Characters!! ");
            }else {
                for (int i = 0; i < str.length(); i++) {
                    String str1 = str.substring(i, i + 1);
                    char ch= str1.charAt(0);
                    int n=ch;
                    if(n>=65 && n<=90){
                        System.out.println(ch);
                        con++;
                    }
                }
            }
            System.out.println("Your Sentence: " + str + "\n" + "Big Characters Number: " + con);
        } catch (InputMismatchException e){
            System.out.println("Your Input is Mismatch!!, Please input Again");
        }
    }
}