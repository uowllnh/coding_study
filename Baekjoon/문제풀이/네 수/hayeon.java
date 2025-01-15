import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hayeon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] list = br.readLine().split(" ");
        String num1 = list[0] + list[1];
        String num2 = list[2] + list[3];

        long result = Long.parseLong(num1) + Long.parseLong(num2);
        System.out.println(result);
    }
}
