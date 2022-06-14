import java.util.ArrayList;
import java.util.Arrays;

public class Poker {

    public static void main(String args[]){
        firstTestCase();

    }

    public static void firstTestCase(){
        ArrayList<Card> blackHand = new ArrayList<>(Arrays.asList
                (new Card(Suits.HEARTS, Values.TWO),
                 new Card(Suits.DIAMONDS, Values.THREE),
                 new Card(Suits.SPADES, Values.FIVE),
                 new Card(Suits.CLUBS, Values.NINE),
                 new Card(Suits.DIAMONDS, Values.KING)
                ));

        Hand firstHand = new Hand(blackHand);

        ArrayList<Card> whiteHand = new ArrayList<>(Arrays.asList
                (new Card(Suits.CLUBS, Values.TWO),
                        new Card(Suits.HEARTS, Values.THREE),
                        new Card(Suits.SPADES, Values.FOUR),
                        new Card(Suits.CLUBS, Values.EIGHT),
                        new Card(Suits.HEARTS, Values.ACE)
                ));

        Hand secondHand = new Hand(whiteHand);
    }

}
