import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class hayeon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine().strip());
        StringBuilder results = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String[] words = br.readLine().strip().split(" ");  //문장 입력받고 단어 분리
            for (String word : words) {
                results.append(new StringBuilder(word).reverse()).append(" ");  //단어 뒤집기
            }
            results.append("\n");
        }
        System.out.print(results);
    }
}
