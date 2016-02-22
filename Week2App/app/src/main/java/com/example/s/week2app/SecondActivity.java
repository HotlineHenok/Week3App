package com.example.s.week2app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.madlibs.Story;

/**
 * Created by S on 17-2-2016.
 */
public class SecondActivity extends AppCompatActivity{

    //create private widgets
    private Button submitButton;
    private SharedPreferences info;
    private EditText wordsText, wordsText2, wordsText3, wordsText4, wordsText5,
            wordsText6, wordsText7, wordsText8, wordsText9, wordsText10, wordsText11, wordsText12, wordsText13;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // initialize the widgets
        submitButton = (Button) findViewById(R.id.submitbutton);
        wordsText = (EditText) findViewById(R.id.word1);
        wordsText2 = (EditText) findViewById(R.id.word2);
        wordsText3 = (EditText) findViewById(R.id.word3);
        wordsText4 = (EditText) findViewById(R.id.word4);
        wordsText5 = (EditText) findViewById(R.id.word5);
        wordsText6 = (EditText) findViewById(R.id.word6);
        wordsText7 = (EditText) findViewById(R.id.word7);
        wordsText8 = (EditText) findViewById(R.id.word8);
        wordsText9 = (EditText) findViewById(R.id.word9);
        wordsText10 = (EditText) findViewById(R.id.word10);
        wordsText11 = (EditText) findViewById(R.id.word11);
        wordsText12 = (EditText) findViewById(R.id.word12);
        wordsText13 = (EditText) findViewById(R.id.word13);

        // use SharedPreferences to retrieve data from previous use of app
        SharedPreferences info = this.getSharedPreferences("data", this.MODE_PRIVATE);

        // create new strings from old input data
        String oldword = info.getString("newword", "");
        String oldword2 = info.getString("newword2", "");
        String oldword3 = info.getString("newword3", "");
        String oldword4 = info.getString("newword4", "");
        String oldword5 = info.getString("newword5", "");
        String oldword6 = info.getString("newword6", "");
        String oldword7 = info.getString("newword7", "");
        String oldword8 = info.getString("newword8", "");
        String oldword9 = info.getString("newword9", "");
        String oldword10 = info.getString("newword10", "");
        String oldword11 = info.getString("newword11", "");
        String oldword12 = info.getString("newword12", "");
        String oldword13 = info.getString("newword13", "");

        // the data retrieved from Shared Preferences is filled in the corresponding EditText widget
        wordsText.setText(oldword);
        wordsText2.setText(oldword2);
        wordsText3.setText(oldword3);
        wordsText4.setText(oldword4);
        wordsText5.setText(oldword5);
        wordsText6.setText(oldword6);
        wordsText7.setText(oldword7);
        wordsText8.setText(oldword8);
        wordsText9.setText(oldword9);
        wordsText10.setText(oldword10);
        wordsText11.setText(oldword11);
        wordsText12.setText(oldword12);
        wordsText13.setText(oldword13);
    }

    public void onSUBMIT(View view) {

        // when the user presses the SUBMIT button, the user input data from the EditText fields is stored as new Strings
        // for further use
        String newword = String.valueOf(wordsText.getText());
        String newword2 = String.valueOf(wordsText2.getText());
        String newword3 = String.valueOf(wordsText3.getText());
        String newword4 = String.valueOf(wordsText4.getText());
        String newword5 = String.valueOf(wordsText5.getText());
        String newword6 = String.valueOf(wordsText6.getText());
        String newword7 = String.valueOf(wordsText7.getText());
        String newword8 = String.valueOf(wordsText8.getText());
        String newword9 = String.valueOf(wordsText9.getText());
        String newword10 = String.valueOf(wordsText10.getText());
        String newword11 = String.valueOf(wordsText11.getText());
        String newword12 = String.valueOf(wordsText12.getText());
        String newword13 = String.valueOf(wordsText13.getText());

        // the Strings created are saved in a new Intent to pass the data to the next Activity
        Intent words = new Intent(this, FinalActivity.class);
        words.putExtra("word1", newword);
        words.putExtra("word2", newword2);
        words.putExtra("word3", newword3);
        words.putExtra("word4", newword4);
        words.putExtra("word5", newword5);
        words.putExtra("word6", newword6);
        words.putExtra("word7", newword7);
        words.putExtra("word8", newword8);
        words.putExtra("word9", newword9);
        words.putExtra("word10", newword10);
        words.putExtra("word11", newword11);
        words.putExtra("word12", newword12);
        words.putExtra("word13", newword13);

        // the next Activity is started
        startActivity(words);
    }

    @Override
    public void onBackPressed() {
        // when the user presses Back to exit the Actvity or App, this method is used
        super.onBackPressed();

        // the data from the EditTexts is again stored in new Strings
        String newword = String.valueOf(wordsText.getText());
        String newword2 = String.valueOf(wordsText2.getText());
        String newword3 = String.valueOf(wordsText3.getText());
        String newword4 = String.valueOf(wordsText4.getText());
        String newword5 = String.valueOf(wordsText5.getText());
        String newword6 = String.valueOf(wordsText6.getText());
        String newword7 = String.valueOf(wordsText7.getText());
        String newword8 = String.valueOf(wordsText8.getText());
        String newword9 = String.valueOf(wordsText9.getText());
        String newword10 = String.valueOf(wordsText10.getText());
        String newword11 = String.valueOf(wordsText11.getText());
        String newword12 = String.valueOf(wordsText12.getText());
        String newword13 = String.valueOf(wordsText13.getText());

        // a new SharedPreferences "info" is created and value of previously created Strings
        // is saved in "info"
        SharedPreferences info = this.getSharedPreferences("data", this.MODE_PRIVATE);
        SharedPreferences.Editor editor = info.edit();
        editor.putString("word1", newword);
        editor.putString("word2", newword2);
        editor.putString("word3", newword3);
        editor.putString("word4", newword4);
        editor.putString("word5", newword5);
        editor.putString("word6", newword6);
        editor.putString("word7", newword7);
        editor.putString("word8", newword8);
        editor.putString("word9", newword9);
        editor.putString("word10", newword10);
        editor.putString("word11", newword11);
        editor.putString("word12", newword12);
        editor.putString("word13", newword13);
        editor.commit();
    }
}
