package Baekjoon.문제풀이.진법 변환;

import java.util.Scanner;

public class hayeon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String n = scanner.next(); 
        int b = scanner.nextInt();
        scanner.close();

        int answer = 0;  // 변환된 10진수 값을 저장할 변수 초기화

        // n 문자열을 거꾸로 순회하며 변환
        for (int i = 0; i < n.length(); i++) {
            char j = n.charAt(n.length() - 1 - i);  // 뒤집힌 문자열의 i번째 문자
            answer += Math.pow(b, i) * num.indexOf(j);  // 해당 자리의 값을 10진수로 변환하여 누적
        }

        System.out.println(answer);  // 최종 결과 출력
    }
}
