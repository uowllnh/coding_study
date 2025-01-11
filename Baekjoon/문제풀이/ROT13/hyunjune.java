import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class hyunjune {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String T = br.readLine();
        StringBuilder result = new StringBuilder(); 
        
        for (char ch : T.toCharArray()) {
          
            if (ch >= 'A' && ch <= 'Z') {
                char rotated = (char) ((ch - 'A' + 13) % 26 + 'A');
                result.append(rotated);
            }
            
            else if (ch >= 'a' && ch <= 'z') {
                char rotated = (char) ((ch - 'a' + 13) % 26 + 'a');
                result.append(rotated);
            }
            
            else {
                result.append(ch);
            }
        }
        
        System.out.println(result.toString());
    }
}
