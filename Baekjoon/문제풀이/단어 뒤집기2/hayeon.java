import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hayeon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        boolean inTag = false;

        for (char c : s.toCharArray()) {
            if (c == '<') {
                if (temp.length() > 0) {
                    result.append(temp.reverse());
                    temp.setLength(0);
                }
                inTag = true;
                result.append(c);
            } else if (c == '>') {
                inTag = false;
                result.append(c);
            } else if (inTag) {
                result.append(c);
            } else if (c == ' ') {
                if (temp.length() > 0) {
                    result.append(temp.reverse());
                    temp.setLength(0);
                }
                result.append(c);
            } else {
                temp.append(c);
            }
        }

        if (temp.length() > 0) {
            result.append(temp.reverse());
        }
        System.out.println(result);
    }
}
