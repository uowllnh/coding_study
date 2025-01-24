import java.util.Scanner;

public class hayeon {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long m = sc.nextLong();
        sc.close();
        
        long two_cnt = cnt2(n) - cnt2(n - m) - cnt2(m);
		long five_cnt = cnt5(n) - cnt5(n - m) - cnt5(m);

        
		System.out.println(Math.min(five_cnt, two_cnt));
		
	}
		
	public static long cnt2(long num) {
		int count = 0;
		
		while(num >= 2) {
			count += (num / 2);
			num /= 2;
		}
		return count;
	}

	public static long cnt5(long num) {
		int count = 0;
		
		while(num >= 5) {
			count += (num / 5);
			num /= 5;
		}
		return count;
	}

 
}
