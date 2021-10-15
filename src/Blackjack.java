import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Blackjack {

    static ArrayList<Integer> cardsPlayed = new ArrayList<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Welcome to Blackjack");
        System.out.println(" ");
        System.out.println("Would you like to play: yes/no");
        String playerAnswer = sc.next();

        if (playerAnswer.equals("yes")) {

            System.out.println("Your cards are:");
            NewCard();
            NewCard();
            System.out.println("Would you like another card? yes/no");
            String answer = sc.next();

            while (answer.equals("yes")){

                System.out.println("Your cards are:");
                NewCard();
                System.out.println("Would you like another card? yes/no");
                answer = sc.next();
            }



        }else if (playerAnswer.equals("no")) {
            System.out.println("OK BYE");
        }else {
            System.out.println("Invalid Answer! Try Again");
        }

    }
    public static void NewCard(){
        int[] cards = {1,2,3,4,5,6,7,8,9,10,10,10};
        int randomCard = new Random().nextInt(cards.length);
        System.out.println("= " + randomCard);
        cardsPlayed.add(randomCard);

    }
}
