import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class jeoeo {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());

    Stack<Integer> stack = new Stack<>();
    int current = 1;

    for (int i = 0; i < n; i++) {
      int value = Integer.parseInt(br.readLine());

      while (current <= value) {
        stack.push(current++);
        sb.append("+\n");
      }

      if (stack.peek() == value) {
        stack.pop();
        sb.append("-\n");
      } else {
        System.out.println("NO");
        return;
      }
    }

    System.out.println(sb);
  }
}