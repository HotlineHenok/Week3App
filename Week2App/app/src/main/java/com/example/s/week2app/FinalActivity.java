package com.example.s.week2app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by S on 22-2-2016.
 */
public class FinalActivity extends AppCompatActivity {

    // new TextView field and Button are created
    public TextView story;
    public Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // TextView 'story' and Button 'backButton' are initialized
        story = (TextView) findViewById(R.id.storyView);
        backButton = (Button) findViewById(R.id.backButton);

        // Bundle containing String information from previous Activity is retrieved
        // and new String variables are created
        Bundle extras_words = getIntent().getExtras();
        String word = extras_words.getString("word1");
        String word2 = extras_words.getString("word2");
        String word3 = extras_words.getString("word3");
        String word4 = extras_words.getString("word4");
        String word5 = extras_words.getString("word5");
        String word6 = extras_words.getString("word6");
        String word7 = extras_words.getString("word7");
        String word8 = extras_words.getString("word8");
        String word9 = extras_words.getString("word9");
        String word10 = extras_words.getString("word10");
        String word11 = extras_words.getString("word11");
        String word12 = extras_words.getString("word12");
        String word13 = extras_words.getString("word13");

        // Strings created in onCreate method are inserted in new String 'fullstory'
        String fullstory = String.format(getResources().getString(R.story.story), word, word2, word3, word4, word5, word6, word7, word8, word9, word9, word10, word11, word12, word13);

        // 'fullstory' String is put into TextView 'story'
        story.setText(fullstory);
    }

    public void onBACK(View view) {
        Intent start = new Intent(this, SecondActivity.class);
        startActivity(start);
    }
}
