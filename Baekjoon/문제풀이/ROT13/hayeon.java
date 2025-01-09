package Baekjoon.문제풀이.ROT13;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class hayeon {
    public static void main(String[] args) throws IOException {
        char[] upper = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] lower = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isAlphabetic(c)) {
                if (Character.isLowerCase(c)) {
                    int result = new String(lower).indexOf(c);
                    answer.append(lower[result + 13]);
                } else {
                    int result = new String(upper).indexOf(c);
                    answer.append(upper[result + 13]);
                }
            } else {
                answer.append(c);
            }
        }

        System.out.println(answer.toString());
    }
}


