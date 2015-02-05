package derek.com.carf;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;


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

        //Draw five cards into player p hand.
        int counter = 0;
        while(p.getHandSize()>counter){
            p.drawCard(d.nextCard());
            counter++;
        }

        //get the values stored in player p hand
        int temp[] = new int[p.getHandSize()];
        temp = p.getPlayerHand();
        String temps = "";
        for(int i= 0; i <temp.length; i++){
            if(temp[i] >0 && temp[i]<=13){
                temps+=temp[i] + "♥   ";
            }else if(temp[i] >13 && temp[i]<=26){
                temps+=temp[i]-13 + "♦   ";
            }else if(temp[i] >26 && temp[i]<=39){
                temps+=temp[i]-26 + "♣   ";
            }else if(temp[i] >39 && temp[i]<=52){
                temps+=temp[i]-39 + "♠   ";
            }else if(temp[i] >52){
                temps+="J☻   ";
            }
            temps+="\n";
        }
        t.setText(temps);
        //Player p places card 2 on the table
        p.placeCard(p.getCard(2),2);

        //get the values of playerTable and display them in a textview
        temp = new int[p.getTableSize()];
        temp = p.getPlayerTable();
        temps ="";
        for(int i= 0; i <temp.length; i++){
            if(temp[i] >0 && temp[i]<=13){
                temps+=temp[i] + "♥   ";
            }else if(temp[i] >13 && temp[i]<=26){
                temps+=temp[i]-13 + "♦   ";
            }else if(temp[i] >26 && temp[i]<=39){
                temps+=temp[i]-26 + "♣   ";
            }else if(temp[i] >39 && temp[i]<=52){
                temps+=temp[i]-39 + "♠   ";
            }else if(temp[i] >52){
                temps+="J☻   ";
            }
            temps+="\n";
        }
        t2.setText(temps);

        temp = p.getPlayerHand();
        temps = "";
        for(int i= 0; i <temp.length; i++){
            if(temp[i] >0 && temp[i]<=13){
                temps+=temp[i] + "♥   ";
            }else if(temp[i] >13 && temp[i]<=26){
                temps+=temp[i]-13 + "♦   ";
            }else if(temp[i] >26 && temp[i]<=39){
                temps+=temp[i]-26 + "♣   ";
            }else if(temp[i] >39 && temp[i]<=52){
                temps+=temp[i]-39 + "♠   ";
            }else if(temp[i] >52){
                temps+="J☻   ";
            }
            temps+="\n";
        }
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
