import java.util.Scanner;

public class hyunjune {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
       
        long answer = 1; 
        if (T == 0 || T == 1) {
            System.out.println(1);
        } else {
            for (int i = 2; i <= T; i++) {
                answer *= i;
            }
            System.out.println(answer);
        }

        sc.close();
    }
}
