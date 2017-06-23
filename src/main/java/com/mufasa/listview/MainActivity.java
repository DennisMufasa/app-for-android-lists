package com.mufasa.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.lstList);
        // define an array and store the values to be showed in the listview.
        String[] planets= new  String[]{
                "Mercury","Venus","Earth","Mars","Jupitar","Surtun","Uranus","Neptune"
        };

        // define an adapter
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, planets);
        // assign adapter to listview

        listView.setAdapter(adapter);

        //creating an onitemclick listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int itemPosition =  i;
                String itemValue= (String) listView.getItemAtPosition(i);
                //show a toast notification of the value
                Toast.makeText(MainActivity.this,"Position: "+itemPosition+" is planet : "+itemValue  , Toast.LENGTH_LONG).show();
            }
        });
    }
}
