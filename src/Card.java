

/**
 * Created by h205p3 on 3/8/17.
 */
public class Card {
    String face;
    String suit;
    int value;

    public Card(String Face, String Suit, int Value){
        this.face = Face;
        this.suit = Suit;
        this.value = Value;
    }

    public Card(){

    }

    public String toString(){
        return "This is the "+this.face+" of "+this.suit;
    }

}
