package com.example.robin.block07;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {

    NumberPicker possibilities;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        possibilities = (NumberPicker) findViewById(R.id.numberPicker);
        webView = (WebView) findViewById(R.id.webView);
        String[] possibilitiesString = {
                "Google",
                "facebook",
                "Coursera",
                "Euro-cup"
        };
        possibilities.setDisplayedValues(possibilitiesString);
        possibilities.setMinValue(0);
        possibilities.setMaxValue(possibilitiesString.length - 1);
    }

    public void navigate(View v){
        int choice = possibilities.getValue();
        if (choice == 0)
            webView.loadUrl("http://www.google.com");
        else if (choice == 1)
            webView.loadUrl("http://facebook.com");
        else if (choice == 2)
            webView.loadUrl("http://coursera.org");
        else {
            if (choice == 3) {
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("http://www.uefa.com/uefaeuro/");
            }
        }

    }
}

======================================
#XML view
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingBottom="@dimen/activity_vertical_margin"
    android:paddingLeft="@dimen/activity_horizontal_margin"
    android:paddingRight="@dimen/activity_horizontal_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
    tools:context="com.example.robin.block07.MainActivity">

    <NumberPicker
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/numberPicker"
        android:layout_alignParentTop="true"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="OK"
        android:id="@+id/button"
        android:layout_centerVertical="true"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true"
        android:onClick="navigate" />

    <WebView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/webView"
        android:layout_below="@+id/button"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true"
        android:layout_marginTop="40dp" />
</RelativeLayout>

=============================
#android manifests
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.robin.block07">

    <uses-permission android:name="android.permission.INTERNET"/>
    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>