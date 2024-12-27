import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine()); // 명령어 개수
        LinkedList<String> queue = new LinkedList<>();

        for (int i = 0; i < T; i++) {
            String[] command = sc.nextLine().split(" ");

            switch (command[0]) {
                case "push":
                    queue.add(command[1]); // 큐의 뒤에 추가
                    break;

                case "pop":
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.poll()); // 첫 번째 요소를 반환 및 제거
                    }
                    break;

                case "size":
                    System.out.println(queue.size()); // 큐의 크기 출력
                    break;

                case "empty":
                    System.out.println(queue.isEmpty() ? 1 : 0); // 큐가 비었는지 확인
                    break;

                case "front":
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.peek()); // 첫 번째 요소를 반환 (제거하지 않음)
                    }
                    break;

                case "back":
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.getLast()); // 마지막 요소 반환
                    }
                    break;

                default:
                    System.out.println("Invalid command"); // 잘못된 명령어 처리
                    break;
            }
        }
    }
}
