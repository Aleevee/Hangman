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
                }
            }
        }
    }

