import java.util.Scanner;

public class jeoeo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); 
        scanner.close();

        if (N == 0) {
            System.out.println("0");
            return;
        }

        StringBuilder result = new StringBuilder();

        while (N != 0) {
            int remainder = N % -2; 
            N = N / -2;            

            if (remainder < 0) {
                remainder += 2;
                N += 1;
            }

            result.append(remainder);
        }

        System.out.println(result.reverse().toString());
    }
}
