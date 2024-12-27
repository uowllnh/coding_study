import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 문자열과 커서(△) 추가
        String str = sc.nextLine() + "△";
        int T = Integer.parseInt(sc.nextLine()); // 테스트 케이스 개수

        for (int i = 0; i < T; i++) {
            String[] command = sc.nextLine().split(" ");
            if (command[0].equals("D")) {
                str = D(str);
            } else if (command[0].equals("L")) {
                str = L(str);
            } else if (command[0].equals("B")) {
                str = B(str);
            } else if (command[0].equals("P")) {
                String text = command[1];
                str = P(str, text);
            } else {
                System.out.println("해당 명령어는 존재하지 않음");
            }
        }

        // 최종 문자열에서 커서(△) 제거 후 출력
        System.out.println(str.replace("△", ""));
    }

    // 커서를 왼쪽으로 이동
    public static String L(String str) {
        int cursorIdx = str.indexOf("△");
        if (cursorIdx > 0) {
            str = str.substring(0, cursorIdx - 1) + "△" + str.substring(cursorIdx - 1, cursorIdx) + str.substring(cursorIdx + 1);
        }
        return str;
    }

    // 커서를 오른쪽으로 이동
    public static String D(String str) {
        int cursorIdx = str.indexOf("△");
        if (cursorIdx < str.length() - 1) {
            str = str.substring(0, cursorIdx) + str.substring(cursorIdx + 1, cursorIdx + 2) + "△" + str.substring(cursorIdx + 2);
        }
        return str;
    }

    // 커서 왼쪽 문자를 삭제
    public static String B(String str) {
        int cursorIdx = str.indexOf("△");
        if (cursorIdx > 0) {
            str = str.substring(0, cursorIdx - 1) + "△" + str.substring(cursorIdx + 1);
        }
        return str;
    }

    // 커서 위치에 문자 추가
    public static String P(String str, String text) {
        int cursorIdx = str.indexOf("△");
        str = str.substring(0, cursorIdx) + text + "△" + str.substring(cursorIdx + 1);
        return str;
    }
}
