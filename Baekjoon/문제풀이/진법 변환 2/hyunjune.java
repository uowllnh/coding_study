import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        StringBuilder result = new StringBuilder();

        while (N > 0) {
            int remainder = N % B;
            N /= B;

            if (remainder < 10) {
                result.append(remainder);  
            } else {
                result.append((char) (remainder - 10 + 'A'));  
            }
        }

        System.out.println(result.reverse().toString()); 
    }
}
