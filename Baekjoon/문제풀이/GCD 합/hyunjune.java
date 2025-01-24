import java.util.Scanner;

public class hyunjune {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int n = sc.nextInt(); 
            int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            long gcdSum = 0; 
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    gcdSum += findGCD(nums[i], nums[j]);
                }
            }

            System.out.println(gcdSum);
        }

        sc.close();
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
