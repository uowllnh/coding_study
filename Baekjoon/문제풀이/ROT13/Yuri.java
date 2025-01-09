package Baekjoon.문제풀이.ROT13;

import java.util.ArrayList;
import java.util.Scanner;

public class yuri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력받기
        String[] input = scanner.nextLine().split(" ");
        ArrayList<Character> result = new ArrayList<>();

        for (String str : input) {
            for (int j = 0; j < str.length(); j++) {
                char text = str.charAt(j);

                // 알파벳 대소문자 확인
                if ((text >= 'A' && text <= 'Z') || (text >= 'a' && text <= 'z')) {
                    // ROT13 처리
                    if ((text <= 'Z' && text + 13 > 'Z') || (text <= 'z' && text + 13 > 'z')) {
                        result.add((char) (text - 13));
                    } else {
                        result.add((char) (text + 13));
                    }
                } else {
                    // 알파벳이 아닌 경우 그대로 추가
                    result.add(text);
                }
            }
            // 단어 간 공백 추가
            result.add(' ');
        }

        // 결과 출력
        for (char c : result) {
            System.out.print(c);
        }
    }
}

