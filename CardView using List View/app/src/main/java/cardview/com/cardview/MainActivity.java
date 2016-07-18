package cardview.com.cardview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView mListView;
    ArrayList<String> data;
    ArrayAdapter<String> arrayAdapter;
    String[] source; //source array
    CardView cardview;
    Context context;
    //CardView cardview;
    LinearLayout.LayoutParams layoutparams;
    TextView textview;
    RelativeLayout relativeLayout;
    int size=10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView=(ListView)findViewById(R.id.listView);
        cardview=(CardView)findViewById(R.id.card_view);
         source=new String[size];
         data=new ArrayList<String>();
         //context = getApplicationContext();

        //relativeLayout = (RelativeLayout)findViewById(R.id.relativelayout);
       setSource();
        dynamicallyAddItems();
        //CreateCardViewProgrammatically();
    }
    public void setSource(){ //used to store elements to array
        for(int i=0;i<size;i++)
            source[i]="sample list data "+i;
    }
    public void dynamicallyAddItems(){
        int i;
        //cardview = new CardView(context);
        for(i=0;i<source.length;i++)
            data.add(source[i]);

        //ListView listView=(ListView)findViewById(R.id.listView);
        arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,data);
       // mListView.setAdapter(arrayAdapter);
        cardview.setLayoutParams(new RelativeLayout.LayoutParams(2000, 2000));
        //cardView.setMinimumWidth(1000);
        //cardView.setCardElevation(100);
        mListView.setAdapter(arrayAdapter);
    }

    public void CreateCardViewProgrammatically(){
        cardview = new CardView(context);
        //context = cardview.getContext();
        CardView cardview=new CardView(context);
        layoutparams = new LayoutParams(
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT
        );

        //for(int i=0;i<size;i++){
        cardview.setLayoutParams(layoutparams);

        cardview.setRadius(15);

        cardview.setPadding(25, 25, 25, 25);

        cardview.setCardBackgroundColor(Color.MAGENTA);

        cardview.setMaxCardElevation(30);

        cardview.setMaxCardElevation(6);

        textview = new TextView(context);

        textview.setLayoutParams(layoutparams);

        textview.setText("CardView Programmatically");

        textview.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);

        textview.setTextColor(Color.WHITE);

        textview.setPadding(25, 25, 25, 25);

        textview.setGravity(Gravity.CENTER);

        cardview.addView(textview);

        relativeLayout.addView(cardview);
    }
}