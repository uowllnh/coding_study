package Baekjoon.문제풀이.에디터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class hayeon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String date = br.readLine();
        int m = Integer.parseInt(br.readLine());

        Stack<Character> left = new Stack<>();
        Deque<Character> right = new ArrayDeque<>();

        for (char ch : date.toCharArray()) {
            left.push(ch);
        }

        for (int i = 0; i < m; i++) {
            String commandLine = br.readLine();
            String[] command = commandLine.split(" ");

            if (command[0].equals("L")) {
                if (!left.isEmpty()) {
                    right.addFirst(left.pop());
                }
            } else if (command[0].equals("D")) {
                if (!right.isEmpty()) {
                    left.push(right.pollFirst());
                }
            } else if (command[0].equals("B")) {
                if (!left.isEmpty()) {
                    left.pop();
                }
            } else if (command[0].equals("P")) {
                if (command.length > 1) {
                    left.push(command[1].charAt(0));
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (char ch : left) {
            result.append(ch);
        }
        for (char ch : right) {
            result.append(ch);
        }

        System.out.println(result.toString());
    }
}
