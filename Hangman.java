import java.util.*;

public class Hangman{
    public static void main(String[] args){

        System.out.println("_____");
        System.out.println("|/   |");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|_______");

        System.out.println("Ready to play Hangman?");

         Scanner s = new Scanner(System.in);
        System.out.println("Y/N?");

        String answer = s.nextLine();

        switch (answer) {
            case "N", "n" -> System.out.println("See you next time!");
            case "Y", "y" -> {
                System.out.println("Choose a difficulty: Easy (4), Medium(5), Hard (6)");
                String difficulty = s.nextLine();

                switch (difficulty) {
                       case "easy", "Easy" -> System.out.println("Easy (4 letters)");
                    case "Medium", "medium" -> System.out.println("Medium (5 letters)");
                    case "Hard", "hard" -> System.out.println("Hard (6 letters)");
                }
                System.out.println("_____");
                System.out.println("|/   |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|_______");

                switch (difficulty) {
                    case "easy", "Easy" -> System.out.println("__ __ __ __");
                    case "Medium", "medium" -> System.out.println("__ __ __ __ __");
                    case "Hard", "hard" -> System.out.println("__ __ __ __ __ __");
                    }
                Random random = new Random();
                int easyResponses = random.nextInt(20) + 1;
                
                switch (easyResponses) {
                    case 1 -> System.out.println("able");
                    case 2 -> System.out.println("acid");
                    case 3 -> System.out.println("baby");
                    case 4 -> System.out.println("bear");
                    case 5 -> System.out.println("crow");
                    case 6 -> System.out.println("coal");
                    case 7 -> System.out.println("dear");
                    case 8 -> System.out.println("draw");
                    case 9 -> System.out.println("ears");
                    case 10 -> System.out.println("eels");
                    case 11 -> System.out.println("feel");
                    case 12 -> System.out.println("fear");
                    case 13 -> System.out.println("grow");
                    case 14 -> System.out.println("gear");
                    case 15 -> System.out.println("aged");
                    case 16 -> System.out.println("aunt");
                    case 17 -> System.out.println("bail");
                    case 18 -> System.out.println("beer");
                    case 19 -> System.out.println("bald");
                    case 20 -> System.out.println("born");
                    case 21 -> System.out.println("beef");
                  }
              }
          }
      }
  }

