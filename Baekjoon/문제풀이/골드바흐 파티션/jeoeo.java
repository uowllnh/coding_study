import java.io.BufferedReader;
import java.io.InputStreamReader;

public class jeoeo {
    public static boolean[] decimal;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        decimal = new boolean[1000001];
        countDecimal();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            int ans = 0;
            int temp = Integer.parseInt(br.readLine());
            for(int j = 2; j <= temp / 2; j++) {
                if(!decimal[j] && !decimal[temp - j]) {
                    ans++;
                }
            }
            System.out.println(ans);
        }

    }

    public static void countDecimal() {
        for(int i = 2; i <= Math.sqrt(decimal.length); i++) {
            if(decimal[i]) continue;
            for(int j = i * i; j < decimal.length; j += i) {
                decimal[j] = true;
            }
        }
    }
}