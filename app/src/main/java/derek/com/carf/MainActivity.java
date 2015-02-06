package derek.com.carf;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t = (TextView)findViewById(R.id.textView);
        TextView t2 = (TextView)findViewById(R.id.textView2);
        TextView t3 = (TextView)findViewById(R.id.textView3);

        Deck d = new Deck();

        Player p = new Player("Derek",1,5);
        String temps = "";
        //Draw five cards into player p hand.
        int counter = 0;
        for(int i = 0; i<5; i++){
            p.drawCard(d.nextCard());
        }

        ArrayList<Card> temp;
        temp = new ArrayList<>(p.getPlayerHand().size());
        for(int i= 0; i <temp.size(); i++){
            temp.add(p.getCard(i));
        }

        for(int i= 0; i <p.getHandSize(); i++){

            temps += p.getCard(i).getValue() + " ";

            if(p.getCard(i).getSuit() == 3){
                temps +="♠";
            }else if(p.getCard(i).getSuit() == 2){
                temps +="♣";
            }else if(p.getCard(i).getSuit() == 1){
                temps +="♦";
            }else if(p.getCard(i).getSuit() == 0){
                temps +="♥";
            }
            temps += "\n";
        }
        t.setText(temps);
        //Player p places card 2 on the table
        p.placeCard(p.getCard(2));

        temps = "";
        for(int i= 0; i <p.getHandSize(); i++){

            temps += p.getCard(i).getValue() + " ";

            if(p.getCard(i).getSuit() == 3){
                temps +="♠";
            }else if(p.getCard(i).getSuit() == 2){
                temps +="♣";
            }else if(p.getCard(i).getSuit() == 1){
                temps +="♦";
            }else if(p.getCard(i).getSuit() == 0){
                temps +="♥";
            }
            temps += "\n";
        }
        t2.setText(temps);

        temps = "";

        temps+=p.getTableCard(0).getValue();

        t3.setText(temps);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
