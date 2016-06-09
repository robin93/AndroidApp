package com.example.robin.block5;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences preferences = getSharedPreferences("COLOR_PREP", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = preferences.edit();

        final RelativeLayout layout = (RelativeLayout)findViewById(R.id.Layout);

            if (preferences.contains(("colorId")))
                layout.setBackgroundColor(preferences.getInt("colorId",0));

        RadioGroup radioGroup_colors = (RadioGroup) findViewById(R.id.radiogroup_colors);
        radioGroup_colors.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int colorcode = 0;
                switch (checkedId) {
                    case R.id.radioButton_blue:
                        colorcode = Color.BLUE;
                        break;
                    case R.id.radioButton_magenta:
                        colorcode = Color.MAGENTA;
                        break;
                    case R.id.radioButton_yellow:
                        colorcode = Color.YELLOW;
                        break;
                }
                layout.setBackgroundColor(colorcode);
                editor.putInt("colorID",colorcode);
                editor.commit();

            }
        });
    }
}

====================================
#XML code
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingBottom="@dimen/activity_vertical_margin"
    android:paddingLeft="@dimen/activity_horizontal_margin"
    android:paddingRight="@dimen/activity_horizontal_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
    tools:context="com.example.robin.block5.MainActivity"
    android:id="@+id/Layout">

    <RadioGroup
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_alignParentTop="true"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true"
        android:id="@+id/radiogroup_colors">

        <RadioButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="blue"
            android:id="@+id/radioButton_blue"
            android:checked="false" />

        <RadioButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="magenta"
            android:id="@+id/radioButton_magenta"
            android:checked="false" />

        <RadioButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="yellow"
            android:id="@+id/radioButton_yellow"
            android:checked="false" />
    </RadioGroup>
</RelativeLayout>
