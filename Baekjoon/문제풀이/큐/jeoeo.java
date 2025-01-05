package coding_study.Baekjoon.문제풀이.큐;

import java.io.*;
import java.util.*;

public class jeoeo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");

            switch (command[0]) {
                case "push":
                    queue.add(Integer.parseInt(command[1])); 
                    break;

                case "pop":
                    if (queue.isEmpty()) {
                        sb.append("-1\n"); 
                    } else {
                        sb.append(queue.poll()).append("\n"); 
                    }
                    break;

                case "size":
                    sb.append(queue.size()).append("\n"); 
                    break;

                case "empty":
                    sb.append(queue.isEmpty() ? "1" : "0").append("\n"); 
                    break;

                case "front":
                    if (queue.isEmpty()) {
                        sb.append("-1\n"); 
                    } else {
                        sb.append(queue.peek()).append("\n"); 
                    }
                    break;

                case "back":
                    if (queue.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(((LinkedList<Integer>) queue).peekLast()).append("\n"); // 가장 뒤의 정수 출력
                    }
                    break;
            }
        }

        System.out.print(sb);
    }
}
