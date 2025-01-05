import java.util.ArrayList;
import java.util.Scanner;

public class yuri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        String[] command = scanner.nextLine().split(" ");
        int people = Integer.parseInt(command[0]);
        int sub = Integer.parseInt(command[1]);

        ArrayList<Integer> josephus = new ArrayList<>();
        for (int i = 1; i <= people; i++) {
            josephus.add(i);
        }

        ArrayList<Integer> result = new ArrayList<>();
        int crt = 0;
        int crt_people = people;

        for (int i = 0; i < people; i++) {
            crt += sub;

            if (crt <= crt_people) {
                result.add(josephus.get(crt - 1));
                josephus.set(crt - 1, 0);
            } else {
                int remaind = crt - crt_people;

                // 0 제거
                while (josephus.contains(0)) {
                    josephus.remove(Integer.valueOf(0));
                }

                crt_people = josephus.size();
                result.add(josephus.get(remaind - 1));
                josephus.set(remaind - 1, 0);
                crt = remaind;
            }
        }

        System.out.println(result);
        scanner.close();
    }
}
