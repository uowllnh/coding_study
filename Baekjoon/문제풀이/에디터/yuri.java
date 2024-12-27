import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int people = sc.nextInt();
        int sub = sc.nextInt();
        List<Integer> josephus = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        // 초기 사람 리스트 생성
        for (int i = 0; i < people; i++) {
            josephus.add(i);
        }

        int crt = 0;

        // 반복문으로 제거 진행
        for (int i = 0; i < people; i++) {
            crt += sub;

            // crt가 리스트 범위를 초과할 경우 순환 처리
            while (crt > people) {
                int remain = crt - people;
                result.add(josephus.get(remain));
                crt = remain;
            }

            // 현재 인덱스에 해당하는 값을 결과에 추가
            result.add(josephus.get(crt - 1));
        }

        // 결과 출력
        System.out.println(result);
    }
}
