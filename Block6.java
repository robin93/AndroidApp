package com.example.robin.block06;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView imageView_Large = (ImageView) findViewById(R.id.imageview_large);
        imageView_Large.setImageResource(R.drawable.codeathon1);

        SeekBar tuner = (SeekBar) findViewById(R.id.seekBar_tuner);
        tuner.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int lastprogress;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                lastprogress = progress;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                imageView_Large.setColorFilter(Color.argb(255,0,lastprogress,255-lastprogress));

            }
        });
    }
}


========================================
#XML code
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="com.example.robin.block06.MainActivity">
    
    <ImageView
        android:layout_width="wrap_content"
        android:layout_height="0dp"
        android:layout_weight="2"
        android:src="@drawable/codeathon1"/>
    
    <SeekBar
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:max="255"
        android:id="@+id/seekBar_tuner"/>

    <ImageView
        android:layout_width="wrap_content"
        android:layout_height="0dp"
        android:layout_weight="8"
        android:id="@+id/imageview_large"/>

</LinearLayout>
