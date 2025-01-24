import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hayeon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        
        int gcd = gcd(a, b);  
        int lcm = lcm(a, b);

        System.out.println(gcd);
        System.out.println(lcm);
    }

    // 최대공약수
    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a%b);
    }

    // 최소공배수
    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }
}
