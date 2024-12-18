import java.util.Scanner;

public class jeoeo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();  // 입력받은 단어

        int totalTime = 0;

        for (char c : word.toCharArray()) {
            if (c >= 'A' && c <= 'C') {
                totalTime += 3;  // A, B, C -> 3초
            } else if (c >= 'D' && c <= 'F') {
                totalTime += 4;  // D, E, F -> 4초
            } else if (c >= 'G' && c <= 'I') {
                totalTime += 5;  // G, H, I -> 5초
            } else if (c >= 'J' && c <= 'L') {
                totalTime += 6;  // J, K, L -> 6초
            } else if (c >= 'M' && c <= 'O') {
                totalTime += 7;  // M, N, O -> 7초
            } else if (c >= 'P' && c <= 'S') {
                totalTime += 8;  // P, Q, R, S -> 8초
            } else if (c >= 'T' && c <= 'V') {
                totalTime += 9;  // T, U, V -> 9초
            } else if (c >= 'W' && c <= 'Z') {
                totalTime += 10; // W, X, Y, Z -> 10초
            }
        }

        System.out.println(totalTime);
    }
}
