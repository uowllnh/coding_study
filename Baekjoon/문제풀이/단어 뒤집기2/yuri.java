import java.util.Scanner;
import java.util.Stack;

public class yuri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        boolean insideTag = false;

        for (char c : input.toCharArray()) {
            if (c == '<') {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
                insideTag = true;
                result.append(c);
            } else if (c == '>') {
                insideTag = false;
                result.append(c);
            } else if (insideTag) {
                result.append(c);
            } else {
                if (c == ' ') {
                    while (!stack.isEmpty()) {
                        result.append(stack.pop());
                    }
                    result.append(c);
                } else {
                    stack.push(c);
                }
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        System.out.println(result);
    }
}
