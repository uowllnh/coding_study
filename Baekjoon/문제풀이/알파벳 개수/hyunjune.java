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
            result[i] = s.indexOf(currentChar); 
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
