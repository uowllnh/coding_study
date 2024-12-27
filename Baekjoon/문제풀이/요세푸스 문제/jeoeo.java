import java.util.*;

public class jeoeo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        int K = sc.nextInt(); 

        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        List<Integer> result = new ArrayList<>();

        int index = 0;
        while (!queue.isEmpty()) {
            index = (index + K - 1) % queue.size();
            result.add(queue.remove(index)); 
        }

        System.out.print("<");
        for (int i = 0; i < result.size(); i++) {
            if (i == result.size() - 1) {
                System.out.print(result.get(i));
            } else {
                System.out.print(result.get(i) + ", ");
            }
        }
        System.out.print(">");
    }
}