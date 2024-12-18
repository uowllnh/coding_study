import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jeoeo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int count = 0; // 각 테스트 케이스마다 사탕개수 초기화
            br.readLine(); // 빈 줄 처리

            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            char[][] arr = new char[r][c]; // 배열에 행렬 저장

            // 박스 내용물을 받아서 배열에 저장
            for (int j = 0; j < r; j++) {
                // box는 한 줄의 문자열로 각 행의 값을 저장
                String box = br.readLine();
                for (int k = 0; k < c; k++) {
                    // charAt(k)을 사용하여 개별 문자를 배열 arr에 저장
                    arr[j][k] = box.charAt(k);
                }
            }

            // 가로 방향 >o<
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c - 2; k++) { // c-2 : k가 배열의 끝을 넘지 않도록 하기 위한 조건
                    if (arr[j][k] == '>' && arr[j][k + 1] == 'o' && arr[j][k + 2] == '<') {
                        count++;
                    }
                }
            }

            // 세로 방향 vo^
            for (int j = 0; j < r - 2; j++) { // r에서 2칸을 뺀 범위까지 검사
                for (int k = 0; k < c; k++) {
                    if (arr[j][k] == 'v' && arr[j + 1][k] == 'o' && arr[j + 2][k] == '^') {
                        count++;
                    }
                }
            }

            // 사탕 수 출력
            System.out.println(count);
        }
    }
}
