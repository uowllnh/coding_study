package coding_study.Baekjoon.문제풀이.괄호;

import java.util.Scanner;

public class hayeon {
    public static String isVPS(String string) {
        int open = 0;
        int close = 0;

        for (char ch : string.toCharArray()) {
            if (ch == '(') { 
                if (close > 0) {
                    return "NO";
                }
                open++;
            } else if (ch == ')') { //닫는 괄호가 나오면 열린 괄호 카운트 줄이면서 진행
                if (open > 0) {
                    open--; 
                } else {
                    return "NO";
                }
            }
        }
        // 모든 괄호 처리 후 여는 괄호와 닫는 괄호 카운트 모두 0일때만 yes
        return open == 0 ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("T 입력:");
        int T = scanner.nextInt();
        scanner.nextLine();

        String[] results = new String[T];

        for (int i = 0; i < T; i++) {
            System.out.print("괄호 입력:");
            String ps = scanner.nextLine().trim();
            results[i] = isVPS(ps);
        }

        for (String result : results) {
            System.out.println(result);
        }

        scanner.close();
    }
}
