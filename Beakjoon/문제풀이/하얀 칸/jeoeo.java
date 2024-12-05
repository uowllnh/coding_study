import java.util.Scanner;

public class jeoeo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0;

    for (int i = 0; i < 8; i++) {
      String line = sc.nextLine().trim();
      for (int j = 0; j < 8; j++) {
        if ((i+j) % 2 == 0 && line.charAt(j) == 'F') {
          count++;
        }
      }
    }
    
    System.out.println(count);

  }
}


//코드 오류는 없으나 입력값 제대로 처리안됨