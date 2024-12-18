import java.util.Scanner;

public class jeoeo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if(input.equals("#")) {
                break;
            }

            //공백을 기준으로 알파벳과 문장 분리
            String[] parts = input.split(" ", 2);
            char a = parts[0].charAt(0);
            String b = parts[1];

            a = Character.toLowerCase(a);
            b = b.toLowerCase();

            int count = 0;
            for (int i = 0; i < b.length(); i++) {
                if(b.charAt(i) == a) {
                    count++;
                }
            }
            System.out.println(a+" "+count);
        }
        scanner.close();
    }
}
