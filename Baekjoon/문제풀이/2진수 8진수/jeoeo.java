import java.util.Scanner;

public class jeoeo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String n = sc.nextLine();
        
        int d = Integer.parseInt(n, 2);
        
        System.out.println(Integer.toOctalString(d));
        
        sc.close();
    }
}
