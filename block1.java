package com.example.robin.block1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonBlue,buttonPink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonBlue = new Button(getApplicationContext());
        buttonBlue.setOnClickListener(this);
        buttonPink = new Button(getApplicationContext());
        buttonPink.setOnClickListener(this);
    }

    public void toDo(View v){
        if (v.equals(buttonBlue))
            //invisible
            v.setVisibility(View.INVISIBLE);
        if (v.equals(buttonPink))
            //pop-up message
            Toast.makeText(getApplicationContext(),
                "to do to do to do ....", Toast.LENGTH_SHORT).show();;


    }

    @Override
    public void onClick(View v) {
        toDo(v);
    }
}