import java.math.BigInteger;
import java.util.Scanner;

public class hayeon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String binary = sc.nextLine();
        sc.close();

        //형변환 + 10진수로 바꿈
        BigInteger a = new BigInteger(binary, 8);
		
        // 형변환 + 2진수로 바꿈
		String s = a.toString(2);
		
		System.out.println(s);
    }
}
