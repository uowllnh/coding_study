import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class hyunjune {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        String A = input[0];
        String B = input[1];
        String C = input[2];
        String D = input[3];

        long num1 = Long.parseLong(A + B); 
        long num2 = Long.parseLong(C + D); 

        System.out.println(num1 + num2);
    }
}
