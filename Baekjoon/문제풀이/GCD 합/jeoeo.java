import java.io.*;
import java.util.*;

public class jeoeo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); 
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int size = Integer.parseInt(st.nextToken());
            int[] arr = new int[size];

            for (int j = 0; j < size; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            long total = 0;

            for (int j = 0; j < size; j++) {
                for (int k = j + 1; k < size; k++) {
                    total += gcd(arr[j], arr[k]);
                }
            }

            sb.append(total).append("\n");
        }

        System.out.print(sb);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
