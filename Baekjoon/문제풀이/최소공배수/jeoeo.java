package Baekjoon.문제풀이.최소공배수;

import java.io.*;
import java.util.StringTokenizer;

public class jeoeo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); 

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int aa = a, bb = b;

            while (a % b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }

            sb.append((aa * bb) / b).append("\n");
        }

        System.out.print(sb);
    }
}
