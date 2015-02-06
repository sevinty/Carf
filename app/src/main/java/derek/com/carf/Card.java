package derek.com.carf;

/**
 * Created by damas_000 on 2/6/2015.
 */
public class Card {
    int value;
    int suit;
    int[] suits = {13,26,39};

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

    public void setCard(int card){
        int tempSuit=0;
        int tempValue;

        for(int i = 0; i<suits.length; i++){
            if(card > suits[i]) {
                tempSuit = i;
            }
        }
        value = card - suits[tempSuit];
        suit = tempSuit;
    }

    public int getCard(){
        return value * suit;
    }
}
