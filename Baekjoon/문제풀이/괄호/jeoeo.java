package coding_study.Baekjoon.문제풀이.괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class jeoeo {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      Stack<Character> stack = new Stack<>();
      String S = br.readLine();

      boolean vps = true;

      for (int j = 0; j < S.length(); j++) {
        if (S.charAt(j) == '(') {
          stack.push(S.charAt(j));
        } else if (stack.isEmpty()) {
          vps = false;
          break;
        } else {
          stack.pop();
        }
      }

      System.out.println(vps && stack.isEmpty() ? "YES" : "NO");
    }
  }
}