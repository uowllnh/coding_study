import java.util.*;

public class StackSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        
        int current = 1;
        boolean possible = true;
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            
            while (current <= num) {
                stack.push(current);
                result.append("+\n");
                current++;
            }
            
            if (stack.peek() == num) {
                stack.pop();
                result.append("-\n");
            } else {
                possible = false;
                break;
            }
        }
        
        if (possible) {
            System.out.print(result);
        } else {
            System.out.println("NO");
        }
    }
}
