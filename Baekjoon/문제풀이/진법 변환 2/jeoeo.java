import java.util.Scanner;

public class jeoeo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();
        
        System.out.println(Integer.toString(N, B).toUpperCase());
    }
}