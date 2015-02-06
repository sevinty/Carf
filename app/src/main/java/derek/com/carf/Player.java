package derek.com.carf;

import java.util.ArrayList;

/**
 * Created by damas_000 on 2/4/2015.
 */
public class Player {

     //cards that the player has in their hand.
    ArrayList<Card> playerHand;
    //cards that the player has placed on the table.
    ArrayList<Card> playerTable;
    //players nickname
    String nickname;
    //players id TODO should be automatically generated
    int id;
    //TODO remove un-needed vars
    int handIndex;
    int tableIndex;


    public Player(String nickname, int id, int handSize){
        //obvious
        this.nickname= nickname;
        this.id = id;
        //set player hand size to the size passed
        playerHand = new ArrayList<>(handSize);

        //TODO determine best size to set the player's table to, later
        playerTable = new ArrayList<>(handSize);
    }

    //places a card onto the table
    public void placeCard(int card, int handIndex){

        for(int i = 0; i<playerHand.size(); i++){
            if(card == playerHand.get(i).getCard()){
                playerTable.add(playerHand.get(i));
                playerHand.remove(i);
            }
        }
    }

    //resizes the hand size to accommodate more cards
    public void resizeArray(){
        //TODO automatically resize arrays when needed.
    }

    //gets the max number of cards player can hold
    public int getHandSize(){
        return playerHand.size();
    }

    //draws top card from the deck -> stores in playerHand array
    public void drawCard(Card card){
        playerHand.add(card);

        handIndex++;
    }



    //gets the card at the index selected
    public int getCard(int index){
        return playerHand.get(index).getCard();
    }

    //returns the playerHand array
    public ArrayList getPlayerHand(){
        return playerHand;
    }

    //returns the playerTable array
    public ArrayList getPlayerTable(){
        return playerTable;
    }

    public int getTableSize(){
        return playerTable.size();
    }



}
