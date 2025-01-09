package Baekjoon.문제풀이.오등큰수;

import java.io.*;
import java.util.*;

public class jeoeo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] result = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            freq.put(A[i], freq.getOrDefault(A[i], 0) + 1);
        }
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < N; i++) {

            while (!stack.isEmpty() && freq.get(A[stack.peek()]) < freq.get(A[i])) {
                result[stack.pop()] = A[i];
            }
            stack.push(i);
        }
        
        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }
        
        for (int i = 0; i < N; i++) {
            bw.write(result[i] + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
