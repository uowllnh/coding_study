import java.util.Stack;
import java.util.Scanner;

class yuri {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt(); // 테스트 케이스 수 입력
            sc.nextLine(); // 개행 문자 처리

            StringBuilder finalResult = new StringBuilder(); // 모든 테스트 케이스 결과를 저장

            for (int i = 0; i < T; i++) {
                Stack<Character> stack = new Stack<>();
                StringBuilder result = new StringBuilder(); // 각 테스트 케이스 결과

                String text = sc.nextLine(); // 문장 입력
                if (text.isEmpty()) {
                    finalResult.append("\n"); // 빈 줄 처리
                    continue;
                }

                String[] text_list = text.split("\\s+"); // 공백 기준으로 문자열 분리
                for (String word : text_list) { // 각 단어 처리
                    for (int k = 0; k < word.length(); k++) {
                        stack.push(word.charAt(k)); // 단어의 각 문자를 스택에 추가
                    }
                    while (!stack.isEmpty()) {
                        result.append(stack.pop()); // 스택에서 문자를 꺼내 결과에 추가
                    }
                    result.append(" "); // 단어와 단어 사이에 공백 추가
                }

                finalResult.append(result.toString().trim()).append("\n"); // 결과 저장
            }

            System.out.print(finalResult.toString().trim()); // 최종 결과 출력
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
