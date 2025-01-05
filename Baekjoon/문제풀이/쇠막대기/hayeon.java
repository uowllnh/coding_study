package Baekjoon.문제풀이.쇠막대기;

import java.util.Scanner;
import java.util.Stack;

public class hayeon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String parentheses = scanner.nextLine().trim();
        Stack<Character> stk = new Stack<>();
        int cnt = 0;

        for (int i = 0; i < parentheses.length(); i++) {
            if (parentheses.charAt(i) == '(') {
                stk.push('(');
            } else {
                if (parentheses.charAt(i - 1) == '(') {
                    stk.pop();
                    cnt += stk.size();
                } else {
                    stk.pop();
                    cnt += 1;
                }
            }
        }

        System.out.println(cnt);
        scanner.close();
    }
}
