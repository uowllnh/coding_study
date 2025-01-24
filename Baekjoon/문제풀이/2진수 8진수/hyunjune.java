import java.util.Scanner;
import java.math.BigInteger;

public class hyunjune {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String binary = sc.next();

        BigInteger decimal = new BigInteger(binary, 2);
        String octal = decimal.toString(8); 
        System.out.println(octal);
       

        sc.close();
    }
}
