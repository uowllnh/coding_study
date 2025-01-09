package Baekjoon.문제풀이.문자열 분석;
import java.util.Scanner;

public class yuri {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                int[] result = {0, 0, 0, 0}; // 소문자, 대문자, 숫자, 공백
                String input = scanner.nextLine();

                for (char a : input.toCharArray()) {
                    if (a >= 'a' && a <= 'z') {
                        result[0]++; // 소문자
                    } else if (a >= 'A' && a <= 'Z') {
                        result[1]++; // 대문자 
                    } else if (a == ' ') {
                        result[3]++; // 공백 
                    } else {
                        result[2]++; // 숫자 또는 기타 문자 
                    }
                }

                
                System.out.println(result[0] + " " + result[1] + " " + result[2] + " " + result[3]);
            } catch (Exception e) {
                break; // 예외 발생 시
            }
        }
    }
}
