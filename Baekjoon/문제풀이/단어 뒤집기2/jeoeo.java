import java.util.*;

public class jeoeo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        boolean Tag = false;

        for (char c : input.toCharArray()) {
            if (c == '<') {
                if (temp.length() > 0) {
                    result.append(temp.reverse());
                    temp.setLength(0);
                }
                Tag = true;
                result.append(c);
            } else if (c == '>') {
                Tag = false;
                result.append(c);
            } else if (Tag) {
                result.append(c);
            } else if (c == ' ') {
                result.append(temp.reverse()).append(c);
                temp.setLength(0);
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
