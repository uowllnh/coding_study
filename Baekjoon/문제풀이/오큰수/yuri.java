import java.util.*;

public class yuri {
    public static void main(String[] args) {
        int num;
        int NGE;
        List<Integer> result_int = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt(); // num 입력받기
        sc.nextLine(); // 버퍼 정리
        String st = sc.nextLine(); // 다음 줄 입력받기

        String[] list = st.split(" ");
        int[] list_int = new int[num];

        // 입력 문자열을 정수 배열로 변환
        for (int i = 0; i < num; i++) {
            list_int[i] = Integer.parseInt(list[i]);
        }

        // 오큰수(NGE) 계산
        for (int a = 0; a < num; a++) {
            NGE = -1;
            for (int j = a + 1; j < num; j++) { // 수정: j는 a + 1부터 시작
                if (list_int[a] < list_int[j]) {
                    NGE = list_int[j];
                    break;
                }
            }
            result_int.add(NGE);
        }

        // 결과를 공백으로 구분된 문자열로 출력
        String result = String.join(" ",
            result_int.stream()
                      .map(String::valueOf)
                      .toArray(String[]::new));
        System.out.println(result);

        sc.close();
    }
}
