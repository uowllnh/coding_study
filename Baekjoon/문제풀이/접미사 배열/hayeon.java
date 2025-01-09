import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class hayeon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine().trim();

        ArrayList<String> suffixes = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            suffixes.add(text.substring(i));
        }

        Collections.sort(suffixes);

        for (String suffix : suffixes) {
            System.out.println(suffix);
        }
    }
}
