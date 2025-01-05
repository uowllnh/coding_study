import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class hyunjune {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] data = new int[T];
        for (int i = 0; i < T; i++) {
            data[i] = Integer.parseInt(input[i]);
        }

        int[] result = new int[T];
        for (int i = 0; i < T; i++) {
            result[i] = -1;
        }
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < T; i++) {
            while (!stack.isEmpty() && data[stack.peek()] < data[i]) {
                result[stack.pop()] = data[i];
            }
            stack.push(i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
