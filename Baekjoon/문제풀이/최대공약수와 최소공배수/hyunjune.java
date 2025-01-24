import java.util.Scanner;

public class hyunjune {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int num = a * b;

        if (a > b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            System.out.println(a);          
            System.out.println(num / a);    
        } else {
            
            while (a != 0) {
                int temp = a;
                a = b % a;
                b = temp;
            }
            System.out.println(b);         
            System.out.println(num / b);   
        }

        sc.close(); 
    }
}
