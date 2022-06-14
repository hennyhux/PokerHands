public class Poker {

    public static void main(String args[]){
        Card newCard = new Card(Suits.CLUBS, Values.ACE);
        System.out.println(newCard.getValue().value);

    }

}
