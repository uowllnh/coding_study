import java.io.*;
import java.util.Stack;

public class hyunjune {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        String testString = br.readLine();
        for (int i = 0; i < testString.length(); i++) {
            leftStack.push(testString.charAt(i));
        }

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            String command = br.readLine();
            switch (command.charAt(0)) {
                case 'L':
                    if (!leftStack.isEmpty()) rightStack.push(leftStack.pop());
                    break;
                case 'D':
                    if (!rightStack.isEmpty()) leftStack.push(rightStack.pop());
                    break;
                case 'B':
                    if (!leftStack.isEmpty()) leftStack.pop();
                    break;
                case 'P':
                    leftStack.push(command.charAt(2));
                    break;
            }
        }

        while (!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }

        while (!rightStack.isEmpty()) {
            bw.write(rightStack.pop());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
