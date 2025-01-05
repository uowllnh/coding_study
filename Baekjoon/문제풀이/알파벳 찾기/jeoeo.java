import java.util.Scanner;

public class jeoeo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] positions = new int[26]; 
        for (int i = 0; i < 26; i++) {
            positions[i] = -1; 
        }

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a'; 
            if (positions[index] == -1) {
                positions[index] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(positions[i] + " "); 
        }
    }
}
