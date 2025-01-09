package Baekjoon.문제풀이.나머지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hayeon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        
        double result1 = (a + b) % (double)c;
        double result2 = ((a%(double)c) + (b%(double)c)) % c;
        double result3 = (a * b) % (double)c;
        double result4 = ((a % (double)c) * (b % (double)c)) % c;
        
        System.out.println(result1 + " " + result2 + " " + result3 + " " + result4);
        
        br.close();
    }
}
