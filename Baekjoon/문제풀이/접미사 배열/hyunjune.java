import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class hyunjune {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        String[] suffixes = new String[S.length()];

        for (int i = 0; i < S.length(); i++) {
            suffixes[i] = S.substring(i);
        }

        Arrays.sort(suffixes);
      
        for (String suffix : suffixes) {
            System.out.println(suffix);
        }
    }
}
