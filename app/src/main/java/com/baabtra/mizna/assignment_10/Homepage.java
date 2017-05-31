package com.baabtra.mizna.assignment_10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        Bundle b=getIntent().getExtras();

        TextView myview=(TextView)findViewById(R.id.mytext);
        myview.setText("Have fun learning "+b.getString("lgg")+":)");
    }
}
