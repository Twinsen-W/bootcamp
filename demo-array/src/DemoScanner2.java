import java.util.Scanner;

public class DemoScanner2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //System.out.println("Please input a number");
    //int number = scanner.nextInt(); // wait for user input
    //System.out.println(number);
    //System.out.println("The input is " + number);



    //scanner.close();

    // Game
    // Bomb =38, random (1-100)
    // User: 50, (1-49)
    // if user selected number = bomb, exit loop

    int bomb = (int) (Math.random() * 99) + 1;
    int input = -1;
    int max = 100;
    int min = 1;
    do {
      System.out.println("Please select a number between" + min "and" + max);
    }
 
     input = scanner.nextInt(); // wait for user input
      // validate user input, if it is out of range, ask the question again. (continue)
      if (input < min || input > max) {
        continue;
      }
      // revise the range of numbers for next round
      if (input > bomb) {
        max = input -1;
      } else if (input < bomb) {
        min = input + 1;
      }
    }
      System.out.println(" You got the bomb! It is " + bomb);

  
     
scanner.close();

    }
  }

