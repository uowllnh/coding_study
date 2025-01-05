
import java.util.*;

public class yuri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String postfix = sc.nextLine();
        double[] values = new double[n];
        for (int i = 0; i < n; i++) values[i] = sc.nextDouble(); // 각 변수의 값을 입력받음

        Stack<Double> stack = new Stack<>();
        for (char ch : postfix.toCharArray()) {
            if (Character.isLetter(ch)) {
                stack.push(values[ch - 'A']); // 변수 값을 스택에 푸시
            } else {
                double b = stack.pop(), a = stack.pop();
                switch (ch) {
                    case '+': stack.push(a + b); break; // 덧셈
                    case '-': stack.push(a - b); break; // 뺄셈
                    case '*': stack.push(a * b); break; // 곱셈
                    case '/': stack.push(a / b); break; // 나눗셈
                }
            }
        }

        System.out.printf("%.2f", stack.pop()); // 결과 출력
    }
}

