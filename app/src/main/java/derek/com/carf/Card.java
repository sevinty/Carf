package derek.com.carf;

/**
 * Created by damas_000 on 2/6/2015.
 */
public class Card {
    int value;
    int suit;

    public Card(int value, int suit){
        this.value=value;
        this.suit=suit;
    }

    public int getSuit(){
        return suit;
    }

    public int getValue(){
        return value;
    }

    public int getCard(){
        return value * suit;
    }
}
