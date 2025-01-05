package Baekjoon.문제풀이.오등큰수;

import java.util.*;

class yuri {

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int num = sc.nextInt();
        sc.nextLine();
        String[] numList = sc.nextLine().split(" ");
        int[] duplList = new int[num];
        for (int i = 0; i < num; i++) {
            duplList[i] = Integer.parseInt(numList[i]);
        }

        // 숫자와 빈도수를 저장
        int[][] elementList = new int[num][2];
        for (int j = 0; j < num; j++) {
            elementList[j][0] = duplList[j]; // 숫자
            elementList[j][1] = countFrequency(duplList, duplList[j]); // 빈도수
        }

        // 결과 리스트
        List<Integer> result = new ArrayList<>();

        // 오등큰수 찾기
        for (int i = 0; i < num; i++) {
            boolean found = false;
            for (int j = i + 1; j < num; j++) {
                if (duplList[i] != elementList[j][0] && elementList[i][1] < elementList[j][1]) {
                    result.add(elementList[j][0]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                result.add(-1);
            }
        }

        // 결과 출력
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) {
                System.out.print(" ");
            }
        }
    }

    // 빈도수 계산
    public static int countFrequency(int[] array, int value) {
        int count = 0;
        for (int num : array) {
            if (num == value) {
                count++;
            }
        }
        return count;
    }
}
