package com.example.robin.block1;

import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonBlue, buttonPink;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonBlue = new Button(getApplicationContext());
        buttonBlue.setOnClickListener(this);
        buttonPink = new Button(getApplicationContext());
        buttonPink.setTextColor(Color.BLACK);
        buttonPink.setBackgroundColor(Color.parseColor("#FD9BF3"));
        buttonPink.setText("the pink panther's to do list");
        RelativeLayout rl_mainScreen = (RelativeLayout) findViewById(R.id.relativeLayout_mainScreen);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.BELOW, buttonBlue.getId());
        rl_mainScreen.addView(buttonPink, params);
        buttonPink.setOnClickListener(this);
    }



    public void toDo(View v) {
        if (v.equals(buttonBlue))
            //invisible
            v.setVisibility(View.INVISIBLE);
        if (v.equals(buttonPink))
            //pop-up message
            Toast.makeText(getApplicationContext(),
                    "to do to do to do ....", Toast.LENGTH_SHORT).show();
        ;


    }

    @Override
    public void onClick(View v) {
        toDo(v);
    }
}




===============================================
//XML File
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingBottom="@dimen/activity_vertical_margin"
    android:paddingLeft="@dimen/activity_horizontal_margin"
    android:paddingRight="@dimen/activity_horizontal_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
    android:id="@+id/relativeLayout_mainScreen"
    tools:context="com.example.robin.block1.MainActivity">


</RelativeLayout>









