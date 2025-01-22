import java.io.*;

public class jeoeo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int limit = 1000000;
        boolean[] isPrime = new boolean[limit + 1];

        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * 2; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            boolean found = false;

            for (int i = n - 3; i >= 3; i -= 2) { 
                if (isPrime[i] && isPrime[n - i]) {
                    sb.append(n).append(" = ").append(n - i).append(" + ").append(i).append("\n");
                    found = true;
                    break;
                }
            }

            if (!found) {
                sb.append("Goldbach's conjecture is wrong.\n");
            }
        }

        System.out.print(sb);
    }
}
