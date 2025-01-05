import java.util.Scanner;

public class jeoeo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); 
        int[] counts = new int[26]; 

        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }

        for (int count : counts) {
            System.out.print(count + " ");
        }
    }
}
