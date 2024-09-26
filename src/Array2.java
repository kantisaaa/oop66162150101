import java.util.*;
public class Array2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Scanner sn = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.print("Input Number["+i+"]: ");
            nums.add(sn.nextInt());
        }
        Collections.sort(nums);
        for(Integer i:nums){
            System.out.println(i);

        }
    }
}