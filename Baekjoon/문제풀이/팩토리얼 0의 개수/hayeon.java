package Baekjoon.문제풀이.팩토리얼 0의 개수;
 
import java.util.Scanner;

public class hayoen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        int two = 0;
        int five = 0;

        for(int i = 1; i <= n; i++) {
            int fac = i;

            while (fac % 2 == 0) {
                two++;
                fac /= 2;
                
            }

            while (fac % 5 == 0){
                five++;
                fac /= 5;
            }
        }

        int min = Math.min(two, five);
        System.out.println(min);
    }
    
}
