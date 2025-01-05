import java.io.*;
import java.util.*;

public class jeoeo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String postfix = br.readLine();
        double[] values = new double[N];
        
        for (int i = 0; i < N; i++) {
            values[i] = Double.parseDouble(br.readLine());
        }
        
        Stack<Double> stack = new Stack<>();
        
        for (char c : postfix.toCharArray()) {
            if (Character.isLetter(c)) {
                stack.push(values[c - 'A']);
            } else {
                double b = stack.pop();
                double a = stack.pop();
                switch (c) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                }
            }
        }
        
        System.out.printf("%.2f\n", stack.pop());
    }
}
