import java.util.*;

public class BracketCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        
        for (int i = 0; i < t; i++) {
            String brackets = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;
            
            for (int j = 0; j < brackets.length(); j++) {
                char c = brackets.charAt(j);
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        isValid = false;
                        break;
                    }
                }
            }
            
            if (isValid && stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
