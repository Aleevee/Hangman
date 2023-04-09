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
            case "Y", "y" -> System.out.println("Let's begin!");
        }
    }
}

