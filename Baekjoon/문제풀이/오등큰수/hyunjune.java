import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
import java.util.HashMap;

public class hyunjune {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int T = Integer.parseInt(input[0]);
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(input[i + 1]);
        }

        HashMap<Integer, Integer> distict_arr = new HashMap<>();
        for (int num : arr) {
            distict_arr.put(num, distict_arr.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[T];
        for (int i = 0; i < T; i++) {
            result[i] = -1;
        }
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < T; i++) {
            while (!stack.isEmpty() && freq.get(arr[stack.peek()]) < freq.get(arr[i])) {
                result[stack.pop()] = arr[i];
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
