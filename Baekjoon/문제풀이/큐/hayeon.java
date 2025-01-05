package Baekjoon.문제풀이.큐;

import java.io.*;
import java.util.*;

public class hayeon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> queue = new LinkedList<>();
        
        int n = Integer.parseInt(br.readLine().trim());
        
        for (int i = 0; i < n; i++) {
            String command = br.readLine().trim();
            if (command.startsWith("push")) {
                String[] parts = command.split(" ");
                int x = Integer.parseInt(parts[1]);
                queue.add(x);
            } else if (command.equals("pop")) {
                if (queue.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(queue.poll()).append("\n");
                }
            } else if (command.equals("size")) {
                sb.append(queue.size()).append("\n");
            } else if (command.equals("empty")) {
                sb.append(queue.isEmpty() ? "1" : "0").append("\n");
            } else if (command.equals("front")) {
                if (queue.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(queue.peek()).append("\n");
                }
            } else if (command.equals("back")) {
                if (queue.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(queue.peekLast()).append("\n");
                }
            }
        }
        System.out.print(sb.toString());
    }
}
