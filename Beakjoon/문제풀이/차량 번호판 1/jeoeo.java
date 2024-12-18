import java.util.Scanner;

public class jeoeo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String format = scanner.nextLine();
        
        int total = 1;
        char prev = '\0';

        for (int i = 0; i < format.length(); i++) {
            char current = format.charAt(i);
            
            if (current == 'c') {
                if (prev == 'c') {
                    total *= 25;
                } else {
                    total *= 26;
                }
                prev = 'c';
            } else if (current == 'd') {
                if (prev == 'd') {
                    total *= 9;
                } else {
                    total *= 10;
                }
                prev = 'd';
            }
        }

        System.out.println(total);
    }
}
