import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        boolean insideTag = false;

        for (char c : input.toCharArray()) {
            if (c == '<') {

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

  
        }

        System.out.println(result);
    }
}
