import java.util.Scanner;

public class ScanData {
    public static void main(String[] args) {
        String pname;
        int qty;
        double price;
        Scanner sn = new Scanner(System.in);
        System.out.println("Please enter quantity, price and " +
                "product description then press enter");
        qty = sn.nextInt(); // scan for integer
        price = sn.nextDouble(); // scan for double
        pname = sn.nextLine(); // scan for string until end of line
        System.out.println("Product: " + pname);
        System.out.println("Quantity: " + qty);
        System.out.println("Price: " + price);
        System.out.println("Amount: "+ qty * price);
    }
}
