package Baekjoon.문제풀이.쇠막대기;

import java.util.*;

public class jeoeo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(); 
        Stack<Character> stack = new Stack<>(); 
        int cnt = 0; 

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '(') {
                stack.push('('); 
            } else {
                if (a.charAt(i - 1) == '(') {
                    stack.pop(); 
                    cnt += stack.size(); 
                } else {
                    stack.pop(); 
                    cnt += 1; 
                }
            }
        }

        System.out.println(cnt);
    }
}
