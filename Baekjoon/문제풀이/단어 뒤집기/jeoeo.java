import java.util.Scanner;

public class jeoeo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int test = Integer.parseInt(scanner.nextLine());

    for (int i = 0; i < test; i++) {

      String sentence = scanner.nextLine();

      String[] words = sentence.split(" ");

      for (int j = 0; j < words.length; j++) {
        words[j] = new StringBuilder(words[j]).reverse().toString();
      }

      System.out.println(String.join(" ",words));
      
    }
  }
}
