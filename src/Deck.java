import sun.jvm.hotspot.utilities.IntArray;
import java.util.Random;

import java.util.ArrayList;


/**
 * Created by h205p3 on 3/8/17.
 */
public class Deck {

    ArrayList<Card> deck = new ArrayList<>();
    Random rand = new Random();


    public Deck() {
        String[] suits = {"Diamonds", "Spades", "Clubs", "Hearts"};
        String[] faces = {"King", "Queen", "Jack", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "Ace"};
        int[] value = {13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int i = 0; i < faces.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                this.deck.add(new Card(faces[i], suits[j], value[j]));
            }
        }

    }

    public void deal(ArrayList dealTo, int numCards) {
        for ( int i = 0; i < numCards; i++) {
            int randNum = rand.nextInt(this.deck.size());
            System.out.println(randNum);

            dealTo.add(randNum, this.deck);
            this.deck.remove(randNum);
        }

    }

    public void returnDeck(){

        System.out.println(this.deck.toString());

    }
}


