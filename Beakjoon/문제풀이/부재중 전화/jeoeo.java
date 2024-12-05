import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jeoeo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //한 줄로 입력 받기, 공백으로 구분해서 값을 나눔
        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);  //노래 수
        int L = Integer.parseInt(input[1]);  //노래 길이
        int D = Integer.parseInt(input[2]);  //전화벨 간격

        int totalTime = N * L + (N - 1) * 5;
        int answer = D;
        
        // 노래의 구간을 순차적으로 확인하여 전화를 받을 수 있는 첫 번째 시간을 찾음
        while (answer <= totalTime) {
            boolean canAnswer = true;  //전화벨을 받을 수 있는지 여부
            for (int i = 0; i < N; i++) {
                int start = i * (L + 5);       //노래 시작 시간
                int end = (i + 1) * L + i * 5; //노래 끝 시간

                if (answer >= start && answer < end) {
                    canAnswer = false;
                    break;
                }
            }

            if (canAnswer) {
                System.out.println(answer);
                return;
            }
            
            // 다음 전화벨 울리는 시간으로 증가
            answer += D;
        }

        System.out.println(answer);
    }
}
