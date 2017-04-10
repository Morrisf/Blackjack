import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 * Created by h205p3 on 3/10/17.
 */
public class Blackjack {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Deck gameDeck = new Deck();

        System.out.println("What is you name?");
        String nameInput = scan.nextLine();
        Person player = new Person(nameInput);

        gameDeck.deal(player.hand, 2);

        System.out.println(gameDeck.deck.size());
        System.out.println(player.hand.size());
        player.returnHand();
    }
}
//changessssss

//this is a change too
