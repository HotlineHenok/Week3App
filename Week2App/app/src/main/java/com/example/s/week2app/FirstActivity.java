package com.example.s.week2app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    // new TextView, Button and ImageView widgets are created
    private Button startButton;
    private TextView titleText;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        // TextView, Button and ImageView widgets are initialized
        titleText = (TextView) findViewById(R.id.textView);
        startButton = (Button) findViewById(R.id.startbutton);
        ImageView img = (ImageView) findViewById(R.id.titleView);
    }

    public void onSTART(View view) {

        // when user presses START button, next Activity is started
        Intent start = new Intent(this, SecondActivity.class);
        startActivity(start);
    }
}
