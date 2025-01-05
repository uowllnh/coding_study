package coding_study.Baekjoon.문제풀이.에디터;

import java.io.*;
import java.util.*;

public class jeoeo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        ArrayList<Character> text = new ArrayList<>();
        for (char c : br.readLine().toCharArray()) {
            text.add(c);
        }
        int cursor = text.size();

        int commandCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < commandCount; i++) {
            String[] command = br.readLine().split(" ");

            switch (command[0]) {
                case "L": 
                    if (cursor > 0) {
                        cursor--;
                    }
                    break;

                case "D":
                    if (cursor < text.size()) {
                        cursor++;
                    }
                    break;

                case "B":
                    if (cursor > 0) {
                        text.remove(cursor - 1);
                        cursor--;
                    }
                    break;

                case "P":
                    text.add(cursor, command[1].charAt(0));
                    cursor++;
                    break;
            }
        }

        for (char c : text) {
            result.append(c);
        }

        System.out.println(result);
    }
}
