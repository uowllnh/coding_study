import java.util.Scanner;

public class jeoeo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력이 끝날 때까지 반복
        while (scanner.hasNext()) {
            try {
                int n = scanner.nextInt();  
                int k = scanner.nextInt();
                int chicken = n;       

                // 쿠폰을 모두 소진할 때까지 반복
                while (n >= k) {
                    chicken += n / k; 
                    n = (n / k) + (n % k); 
                }

                // 결과 출력
                System.out.println(chicken);

            } catch (Exception e) {
                break;  // 입력이 더 이상 없으면 종료
            }
        }

        scanner.close();
    }
}
