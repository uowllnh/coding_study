package Baekjoon.문제풀이.ROT13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class yuri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력받기
        String text = scanner.nextLine();
        ArrayList<String> result = new ArrayList<>();

        // 모든 접미사를 리스트에 추가
        for (int i = 0; i < text.length(); i++) {
            result.add(text.substring(i));
        }

        // 사전순으로 정렬
        Collections.sort(result);

        // 결과 출력
        for (String suffix : result) {
            System.out.println(suffix);
        }
    }
}
