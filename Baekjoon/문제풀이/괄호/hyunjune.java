import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < testCases; i++) {
            String s = br.readLine(); 
            int count = 0;
            boolean isVPS = true;
            
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                
                if (ch == '(') {
                    count++;
                } else if (ch == ')') {
                    count--;
                }
                
                if (count < 0) {
                    isVPS = false;
                    break;
                }
            }
            
            if (count == 0 && isVPS) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        br.close();
    }
}
