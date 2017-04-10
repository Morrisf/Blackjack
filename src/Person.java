import java.util.ArrayList;
/**
 * Created by h205p3 on 3/8/17.
 */
public class Person {
    String playerName;
    ArrayList<Card> hand = new ArrayList<>();

    public Person(String playerName){
        this.playerName = playerName;
    }

    public Person(){}

    public void returnHand(){

        System.out.println(this.hand);

    }


}
