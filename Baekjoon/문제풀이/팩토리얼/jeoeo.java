package Baekjoon.문제풀이.팩토리얼;

import java.util.Scanner;
 
public class jeoeo {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		in.close();
		
		int sum = factorial(N);
		System.out.println(sum);
		
	}
	
	public static int factorial(int N) {
		if(N <= 1) return 1;
		return N * factorial(N - 1);		
	}
 
}