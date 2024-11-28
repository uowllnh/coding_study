import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        StringBuilder output = new StringBuilder();

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();

            if (command.startsWith("push")) {
                int x = Integer.parseInt(command.split(" ")[1]);
                stack.push(x);
            } else if (command.equals("pop")) {
                output.append(stack.isEmpty() ? -1 : stack.pop()).append("\n"); 
            } else if (command.equals("size")) {
                output.append(stack.size()).append("\n");
            } else if (command.equals("empty")) {
                output.append(stack.isEmpty() ? 1 : 0).append("\n");
            } else if (command.equals("top")) {
                output.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
            }
        }

        sc.close();

        System.out.print(output);
    }
}
