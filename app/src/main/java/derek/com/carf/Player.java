package derek.com.carf;

/**
 * Created by damas_000 on 2/4/2015.
 */
public class Player {
    int[] playerHand;
    int[] playerTable;
    String nickname;
    int id;
    int handIndex;
    int tableIndex;

    public Player(String nickname, int id, int handSize){
        //TODO initialize local variables
        this.nickname= nickname;
        this.id = id;
        playerHand = new int[handSize];
        playerTable = new int[1];
        handIndex= 0;
        tableIndex = 0;
    }

    //places a card onto the table
    public void placeCard(int card, int handIndex){
        playerTable[tableIndex]=card;
        playerHand[handIndex]=-1;
        moveCards();

    }

    //gets the max number of cards player can hold
    public int getHandSize(){
        return playerHand.length;
    }

    //draws top card from the deck -> stores in playerHand array
    public void drawCard(int card){
        playerHand[handIndex] = card;
        handIndex++;
    }

    //gets the card at the index selected
    public int getCard(int index){
        return playerHand[index];
    }

    //returns the playerHand array
    public int[] getPlayerHand(){
        return playerHand;
    }

    //returns the playerTable array
    public int[] getPlayerTable(){
        return playerTable;
    }

    public int getTableSize(){
        return playerTable.length;
    }

    //fixes hand so the last index is the free one.
    private void moveCards(){
        int tempIndex = 0; //used for holding the value of where any -1 is stored.

        for(int i =0; i< playerHand.length; i++){
            if(playerHand[i] == -1 && playerHand.length-1 != i){
                playerHand[i]=playerHand[i+1];
                playerHand[i+1] = -1;
            }
        }
    }

}
