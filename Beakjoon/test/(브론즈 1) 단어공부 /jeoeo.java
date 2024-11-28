import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String word = scanner.nextLine().toUpperCase();
        
        HashSet<Character> setword = new HashSet<>();
        for (char c : word.toCharArray()) {
            setword.add(c);
        }
        
        int maxCount = 0;
        char result = '?';

        for (char c : setword) {
            int count = 0;

            for (char w : word.toCharArray()) {
                if (w == c) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                result = c;
            } else if (count == maxCount) {
                result = '?';
            }
        }
        
        System.out.println(result);
    }
}
