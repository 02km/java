import java.util.Scanner;
import java.util.Random;

public class Main_v2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int score = 0;
    for (int i = 1; i < 11; i++) {
      int number1 = (int) (Math.random() * 10) + 0;
      int number2 = (int) (Math.random() * 10) + 0;

      String times = "*";

      System.out.print("What is " + number1 + " times " + number2 + " ?");
      int answer = input.nextInt();

      while ((number1 * number2) != answer) {
        Random random = new Random();
        int index = random.nextInt(4) + 1;
        switch (index) {
          case 1:
            System.out.println("No. Please try again.");
            break;
          case 2:
            System.out.println("Wrong. Try once more.");
            break;
          case 3:
            System.out.println("Don't give up!");
            break;
          case 4:
            System.out.println("No. Keep trying.");
            break;
        }
        answer = input.nextInt();
      }

      if ((number1 * number2) == answer) {
        Random random = new Random();
        int index = random.nextInt(4) + 1;
        switch (index) {
          case 1:
            System.out.println("Very good!");
            break;
          case 2:
            System.out.println("Excellent!");
            break;
          case 3:
            System.out.println("Nice work!");
            break;
          case 4:
            System.out.println("Keep up the good work!");
            break;
        }
        score = score + 1;
        System.out.println("Score is currently: " + score);
      }
    }
  }
}