import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baek1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 입력 받을 수열의 크기
        
        int[] T = new int[n];
        for (int i = 0; i < n; i++) {
            T[i] = Integer.parseInt(br.readLine()); // 수열 입력
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int now = 1;

        for (int number : T) {
            while (number >= now) {
                stack.push(now);
                result.append("+\n");
                now++;
            }

            if (stack.peek() == number) {
                stack.pop();
                result.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println(result.toString());
    }
}