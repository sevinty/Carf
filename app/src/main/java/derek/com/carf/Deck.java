package derek.com.carf;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Derek Schmell on 2/4/2015.
 *
 */
public class Deck {
   // int[] cards; //integers represent the card values value/4 = card value and type
    ArrayList<Card> cards;
    Random rand;
    Card card;

    private final int DECK_SIZE = 52; //Deck size = 52 cards without jokers

    int index; //last drawn card;

    public Deck(){
        //local variables are initialized
        rand = new Random();
        cards = new ArrayList<>(DECK_SIZE);
        index = -1;

        //function call initializes the array
        initalizeDeck();
        //shuffles the array in a random order
        shuffleDeck();
    }

    public Deck(int deckSize){
        //local variables are initialized
        rand = new Random();
        cards = new ArrayList<>(deckSize);
        index = -1;

        //function call initializes the array
        initalizeDeck();
        //shuffles the array in a random order
        shuffleDeck();
    }


    //initializes the array of cards in order
    private void initalizeDeck(){
        //for loop sets the card values 1-52 in order.

       for(int j = 0; j<4; j++){
           for(int i = 1; i<=13; i++){
               card = new Card(i,j);
               cards.add(card);
           }
       }

    }


    //shuffles the array of cards
    private void shuffleDeck(){
        Card tempIndex; //holds the value from the randomly selected index
        int tempRand; //holds the random int

        for(int i = 0; i<cards.size();i++){
            tempRand=rand.nextInt(52);
            tempIndex = cards.get(tempRand);
            cards.set(tempRand,cards.get(i));
            cards.set(i,tempIndex);
        }
    }


    //returns the next card in the array
    public int nextCard(){
        //increases the current top card index by 1
        index++;
        //returns the value
        return cards.get(index).getCard();
    }


    //returns the whole deck in its current order
    public String toString(){
        String temp ="";
        for(int i = 0; i<cards.size(); i++){
            temp+=Integer.toString(cards.get(i).getCard()) + "   ";
            if(i%6 == 0 && i!=0){
                temp+="\n";
            }
        }
        return temp;
    }

}
