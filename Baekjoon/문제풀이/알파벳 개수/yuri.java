
import java.util.*;

public class yuri {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] counts = new int[26]; // 알파벳 개수를 저장할 배열

        for (char ch : input.toCharArray()) {
            counts[ch - 'a']++; // 알파벳 위치에 따라 개수 증가
        }

        for (int count : counts) {
            System.out.print(count + " "); // 개수를 출력
        }
    }
}

    
