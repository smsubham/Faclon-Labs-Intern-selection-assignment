package listview.com.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> items;
    String[] source; //source array
    int no;
    int size=20; //change this to change no of items added per load more click
    int sourceSize=150;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       items=new ArrayList<String>();
        source=new String[sourceSize];
        Button show_more=(Button)findViewById(R.id.button);
        ListView listView=(ListView)findViewById(R.id.listView);
        FrameLayout footerLayout = (FrameLayout) getLayoutInflater().inflate(R.layout.footerview, null);
        listView.addFooterView(footerLayout);
         setSource();
       dynamicallyAddItems();
        listView.addFooterView(show_more);
    }
    public void dynamicallyAddItems(){
        int i;
        for(i=0;i<20;i++)//no=20
                items.add(source[i]);
        no=i;

       ListView listView=(ListView)findViewById(R.id.listView);
        arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,items);
        listView.setAdapter(arrayAdapter);
    }
    public void onClick(View view){
        int id=view.getId();
        int i;
       if(id==R.id.button){
          for(i=no;i<size+no&&i<sourceSize;i++)//adds 20 items each time load more is clicked
               items.add(source[i]);
           no=i; //keeps track of how many items are added , so as start from appropriate position next time
           arrayAdapter.notifyDataSetChanged();
       }
    }
    public void setSource(){ //used to store elements to array
        for(int i=0;i<sourceSize;i++) //no=150
            source[i]="sample list data "+i;
    }
}