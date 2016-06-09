package com.example.robin.block4;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    MediaPlayer gotyemusic ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gotyemusic = MediaPlayer.create(this,R.raw.somebody_i_used_to_know_gotye_feat_kimbra);
        Switch switch_looping = (Switch) findViewById(R.id.switch_looping);
        switch_looping.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                gotyemusic.setLooping(isChecked);
            }
        });
    }

    public void playmusic (View v){
        gotyemusic.start();
    }

    public void pausemusic (View v){
        if (gotyemusic.isPlaying())
            gotyemusic.pause();
    }
}

=======================================
#XML
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingBottom="@dimen/activity_vertical_margin"
    android:paddingLeft="@dimen/activity_horizontal_margin"
    android:paddingRight="@dimen/activity_horizontal_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
    tools:context="com.example.robin.block4.MainActivity">

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="play"
        android:id="@+id/button"
        android:layout_alignParentTop="true"
        android:layout_centerHorizontal="true"
        android:onClick="playmusic" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="pause"
        android:id="@+id/button2"
        android:layout_below="@+id/button"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="43dp"
        android:onClick="pausemusic" />

    <Switch
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="looping"
        android:id="@+id/switch_looping"
        android:layout_centerVertical="true"
        android:layout_alignLeft="@+id/button2"
        android:layout_alignStart="@+id/button2"
        android:checked="false" />
</RelativeLayout>
