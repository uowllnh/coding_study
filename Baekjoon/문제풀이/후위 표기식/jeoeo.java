import java.util.Scanner;
import java.util.Stack;

public class jeoeo {
    public static String postfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int rank[] = new int[256];

        rank['+'] = 1;
        rank['-'] = 1;
        rank['*'] = 2;
        rank['/'] = 2;
        rank['('] = 0;

        for (char ch : infix.toCharArray()) {
            if (Character.isLetter(ch)) {
                result.append(ch);
            } else if (ch == '(') { 
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); 
            } else {
                while (!stack.isEmpty() && rank[stack.peek()] >= rank[ch]) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String infix = sc.nextLine();
        System.out.println(postfix(infix));
        sc.close();
    }
}
