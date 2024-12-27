import java.util.LinkedList;
import java.util.Scanner;

public class hayeon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        LinkedList<Integer> circle = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            circle.add(i);
        }

        StringBuilder res = new StringBuilder();
        res.append("<");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k - 1; j++) {
                circle.addLast(circle.removeFirst());
            }
            res.append(circle.removeFirst());
            if (i < n - 1) {
                res.append(", ");
            }
        }

        res.append(">");
        System.out.println(res);

        scanner.close();
    }
}
