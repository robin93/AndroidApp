package com.example.robin.block3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}


===============================================
#XML code
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:weightSum="100"
    tools:context="com.example.robin.block3.MainActivity">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="0px"
        android:layout_weight="30"
        android:weightSum="10"
        android:background="@android:color/holo_blue_light">

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="small"
            android:id="@+id/button_small" />

        <Button
            android:layout_width="wrap_content"
            android:layout_height="match_parent"
            android:text="BIG"
            android:layout_weight="5"
            android:id="@+id/button_big" />
    </LinearLayout>
    
    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="0px"
        android:layout_weight="70"
        android:background="@drawable/codeathon1">

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="North"
            android:id="@+id/button_north"
            android:layout_alignParentTop="true"
            android:layout_centerHorizontal="true"
            android:background="#979797" />

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="EAST"
            android:id="@+id/button_east"
            android:layout_centerVertical="true"
            android:layout_alignParentRight="true"
            android:layout_alignParentEnd="true"
            android:background="#979797" />

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="SOUTH"
            android:id="@+id/button_south"
            android:layout_alignParentBottom="true"
            android:layout_centerHorizontal="true"
            android:background="#979797" />

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="WEST"
            android:id="@+id/west"
            android:layout_alignBottom="@+id/button_east"
            android:layout_alignParentLeft="true"
            android:layout_alignParentStart="true"
            android:background="#979797" />

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="CENTRE"
            android:id="@+id/button_centre"
            android:layout_centerVertical="true"
            android:layout_toLeftOf="@+id/button_east"
            android:layout_toStartOf="@+id/button_east"
            android:background="@drawable/codeathon1"/>

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="NORTHEAST"
            android:id="@+id/button_ne"
            android:layout_below="@id/button_north"
            android:layout_above="@id/button_east"
            android:layout_toRightOf="@id/button_north"
            android:layout_toLeftOf="@id/button_east"/>

    </RelativeLayout>

</LinearLayout>
