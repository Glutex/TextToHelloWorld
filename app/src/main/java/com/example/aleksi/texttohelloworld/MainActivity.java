package com.example.aleksi.texttohelloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity
{
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView);
        text.setText("Press button for message");
    }


    public void CreateHelloWorld(View v)
    {
        text.setText("Hello World");
    }
}
