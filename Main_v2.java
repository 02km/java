import java.util.Scanner; 
import static java.lang.System.in;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


public class Main_v2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int score = 0;
        for (int i = 1; i < 11; i++) {
          int number1 = (int) (Math.random() * 10) + 10;
          int number2 = (int) (Math.random() * 10) + 0;

          String times = "*";

           System.out.print("What is " + number1 +  " times " + number2 + " ?");
          int answer = input.nextInt();

          while ((number1 * number2) != answer) {
              final String[] wrong_list = {"No. Please try again.", "Wrong. Try once more. ", "Don't give up!", "No. Keep trying."};
              Random random = new Random();
              int index = random.nextInt(wrong_list.length);
              System.out.println(wrong_list[index]); 
              answer = input.nextInt();
          }

          if ((number1 * number2) == answer) {

              final String[] right_list = {"Very good!", "Excellent!", "Nice work! ", "Keep up the good work!"};
              Random random = new Random();
              int index = random.nextInt(right_list.length);
              System.out.println(right_list[index]);  
              score = score + 1;
              System.out.println("Score is currently: " + score);
          }
    }
  }
}

/* 
Correct answers:
Very good! 
Excellent! 
Nice work! 
Keep up the good work! 

incorrect  answers:
No. Please try again. 
Wrong. Try once more. 
Don't give up! 
No. Keep trying. 

 */