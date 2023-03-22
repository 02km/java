import java.util.Scanner; 
import static java.lang.System.in;

public class Main.v2 {
    public static void main (String[] args) {
        int score = 0;
        for (int i = 1; i < 11; i++) {
          int number1 = (int) (Math.random() * 10) + 10;
          int number2 = (int) (Math.random() * 10) + 0;



          String times = "*";

          Scanner input = new Scanner(in);
          System.out.print("What is " + number1 +  " times " + number2 + " ?");
          int answer = input.nextInt();

          while ((number1 * number2) != answer) {
              System.out.print("Incorrect, please try again:");
              answer = input.nextInt();
          }

          if ((number1 * number2) == answer) {
              System.out.println("Correct, Very Good!");
              score = score + 1;
              System.out.println("Score is currently: " + score);
          }
          
    }
  }
}