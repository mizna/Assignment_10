package com.baabtra.mizna.assignment_10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] myitems={"Java","PHP","Python","Ruby on Rails"};
        ListView listview=(ListView)findViewById(R.id.mylist);
        ListAdapter myadapater=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myitems);
        listview.setAdapter(myadapater);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(MainActivity.this,Homepage.class);
                //Toast.makeText(MainActivity.this,myitems[ (int) id],Toast.LENGTH_SHORT).show();
                i.putExtra("lgg",myitems[ (int) id]);
                startActivity(i);


            }
        });


    }

}
