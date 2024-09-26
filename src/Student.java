import java.util.*;
public class Student {
    String stuId;
    String stuName;
    int stuHomeWork;
    int stuTest;
    int stuMidterm;
    int stuFinal;
    static void gradeCalculate(int score){
        if (score > 80){
            System.out.println("Your Score: "+score+" Your Grade A!!!");
        } else if (score >69) {
            System.out.println("Your Score: "+score+" Your Grade B!!!");
        } else if (score >59) {
            System.out.println("Your Score: "+score+" Your Grade C!!!");
        } else if (score >49) {
            System.out.println("Your Score: "+score+" Your Grade D!!!");
        } else{
            System.out.println("Your Score: "+score+" Unfortunately Your Grade is F!!!");
        }
    }
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Student s = new Student();
        try{
            System.out.print("Input Student ID: ");
            s.stuId= sn.nextLine();
            System.out.print("Input Student Name: ");
            s.stuName = sn.nextLine();
            System.out.print("Input Student HomeWork Score: ");
            s.stuHomeWork = sn.nextInt();
            System.out.print("Input Student Test Score: ");
            s.stuTest = sn.nextInt();
            System.out.print("Input Student Midterm Score: ");
            s.stuMidterm = sn.nextInt();
            System.out.print("Input Student Final Score: ");
            s.stuFinal = sn.nextInt();
            int sum = s.stuHomeWork+ s.stuTest+ s.stuMidterm+s.stuFinal;
            System.out.println("Your Student ID: "+s.stuId+" "+"Your Student Name: "+s.stuName);
            gradeCalculate(sum);
        } catch (InputMismatchException e){
            System.out.println("Input Error!!!");
        }
    }
}