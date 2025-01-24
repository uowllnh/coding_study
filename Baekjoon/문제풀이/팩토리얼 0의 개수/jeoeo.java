import java.util.Scanner;

public class jeoeo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int zeroCount = 0; 
        int i = 5;

        while (i <= N) {
            zeroCount += N / i; 
            i *= 5;         
        }

        System.out.println(zeroCount);
    }
}
