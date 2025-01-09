import java.util.Scanner;

public class jeoeo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            int lower = 0, upper = 0, digit = 0, space = 0;

            for (char c : line.toCharArray()) {
                if (Character.isLowerCase(c)) lower++;
                else if (Character.isUpperCase(c)) upper++;
                else if (Character.isDigit(c)) digit++;
                else if (c == ' ') space++;
            }

            System.out.println(lower + " " + upper + " " + digit + " " + space);
        }
        sc.close();
    }
}
