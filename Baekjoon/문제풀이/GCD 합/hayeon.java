package Baekjoon.문제풀이.GCD 합;

import java.util.Scanner;

public class hayeon {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int tc = 0; tc < t; tc++) {
			int n = sc.nextInt();
			int []num = new int[n];
			for(int i = 0; i < n; i++) {
				num[i] = sc.nextInt();
			}
			int sum = 0;
			for(int i = 0; i  <n ; i++) {
				for(int j = i; j < n; j++) {
					if(i != j) {
						sum += gcd(num[i],num[j]);
					}
				}
			}
			System.out.println(sum);
		}
	}
	
	
	public static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a%b);
	}
}
