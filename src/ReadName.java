import com.sun.source.doctree.SystemPropertyTree;

import java.awt.*;
import java.util.*;
import java.io.*;
public class ReadName {
    public static void main(String[] args) {
        String inputfile = "C:/JavaProject/src/contact.csv";
        Scanner sn;
        try {
            sn = new Scanner(new File(inputfile));
            sn.useDelimiter(",");
            while (sn.hasNext()) {
                System.out.println("Name: " + sn.next());
                System.out.println("Last Name: " + sn.next());
                System.out.println("Phone: " + sn.next());
                System.out.println("email: " + sn.nextLine().substring(1));
                System.out.println();
            }
        }
        catch (FileNotFoundException e){
            System.err.println("Input file not found: " + inputfile);
            System.exit(0);

        }

    }
}
