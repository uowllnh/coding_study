import java.io.*;
import java.util.StringTokenizer;

public class jeoeo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int max = Math.max(N, M);
		int min = Math.min(N, M);
		int a = max;
		int b = min;
		
		while(a % b != 0) {
			int a_b = a;
			a = b;
			b = a_b % b;
		}
		System.out.println(b);
		
		int i = max;
		while(max % min != 0) {
			max += i;
		}
		System.out.println(max);
	}

}