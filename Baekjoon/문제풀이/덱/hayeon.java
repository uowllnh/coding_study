// deque.addFirst("x");     "x"를 앞쪽에 추가
// deque.addLast("x");      "x"를 뒤쪽에 추가
// deque.pollFirst();       덱 앞문자 제거하고 반환
// deque.pollLast();        덱 뒷문자 제거하고 반환
// deque.peekFirst();       덱 앞문자 반환
// deque.peekLast();        덱 뒷문자 반환

package Baekjoon.문제풀이.덱;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;

public class hayeon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<String> deque = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");

            if (command[0].equals("push_front")) {
                deque.addFirst(command[1]);
            } else if (command[0].equals("push_back")) {
                deque.addLast(command[1]);
            } else if (command[0].equals("pop_front")) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.pollFirst());
                } else {
                    System.out.println("-1");
                }
            } else if (command[0].equals("pop_back")) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.pollLast());
                } else {
                    System.out.println("-1");
                }
            } else if (command[0].equals("size")) {
                System.out.println(deque.size());
            } else if (command[0].equals("empty")) {
                System.out.println(deque.isEmpty() ? "1" : "0");
            } else if (command[0].equals("front")) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.peekFirst());
                } else {
                    System.out.println("-1");
                }
            } else if (command[0].equals("back")) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.peekLast());
                } else {
                    System.out.println("-1");
                }
            }
        }
    }
}
