import java.util.*;

public class yuri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                result.append(ch); // 알파벳은 바로 결과에 추가
            } else if (ch == '(') {
                stack.push(ch); // 여는 괄호는 스택에 추가
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop()); // 여는 괄호가 나올 때까지 스택에서 꺼냄
                }
                stack.pop(); // 여는 괄호 제거
            } else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    result.append(stack.pop()); // 우선순위에 따라 연산자를 결과에 추가
                }
                stack.push(ch); // 현재 연산자 스택에 추가
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop()); // 남은 연산자 추가
        }

        System.out.println(result.toString());
    }

    static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        return 0;
    }
}

    
