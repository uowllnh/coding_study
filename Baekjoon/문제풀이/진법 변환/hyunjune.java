import java.util.Scanner;

public class hyunjune {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next(); 
        int B = scanner.nextInt();
        scanner.close();
        
        int result = 0;
        int len = N.length();
        
        for (int i = 0; i < len; i++) {
            char digit = N.charAt(len - 1 - i); 
            int value;
            
            if ('0' <= digit && digit <= '9') {
                value = digit - '0'; 
            } else {
                value = digit - 'A' + 10; 
            }
            
            result += value * Math.pow(B, i; 
        }
        
        System.out.println(result);
    }
}
