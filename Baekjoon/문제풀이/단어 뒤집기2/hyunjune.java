import java.io.*;

public class Hyunjune {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        boolean tag = false;

        for (char ch : s.toCharArray()) {
            if (ch == '<') {
                if (word.length() > 0) {
                    result.append(word.reverse()); 
                    word.setLength(0); 
                }
                tag = true;
                result.append(ch);
            } else if (ch == '>') {  
                tag = false;
                result.append(ch);
            } else if (tag) {  
                result.append(ch);
            } else { 
                if (ch == ' ') { 
                    result.append(word.reverse()).append(ch);
                    word.setLength(0);
                } else {
                    word.append(ch);
                }
            }
        }

        if (word.length() > 0) {
            result.append(word.reverse());
        }

        System.out.println(result.toString());
    }
}
