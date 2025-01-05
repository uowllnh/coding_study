import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class hyunjune {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        String s = br.readLine();
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int[] result = new int[26];
        
        for (int i = 0; i < alphabet.length(); i++) {
            char currentChar = alphabet.charAt(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == currentChar) {
                    count++;
                }
            }
            result[i] = count;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int count : result) {
            sb.append(count).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
