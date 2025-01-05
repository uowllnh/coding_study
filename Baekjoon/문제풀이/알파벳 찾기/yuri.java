import java.util.*;

public class yuri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] positions = new int[26];
        Arrays.fill(positions, -1); // 모든 위치를 -1로 초기화

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (positions[ch - 'a'] == -1) {
                positions[ch - 'a'] = i; // 알파벳 처음 등장 위치 기록
            }
        }

        for (int position : positions) {
            System.out.print(position + " "); // 결과 출력
        }
    }
}
