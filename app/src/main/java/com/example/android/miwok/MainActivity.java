package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file

        setContentView(R.layout.activity_main);

        //Find view that shows the Number category
        TextView numbers = (TextView) findViewById(R.id.numbers);
        TextView family = (TextView) findViewById(R.id.family);
        TextView colors = (TextView) findViewById(R.id.colors);
        TextView phrases = (TextView) findViewById(R.id.phrases);
        //Set a click listen on that view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create a new intent to open the @link_Numbers_Activity
               Intent numberIntent = new Intent(MainActivity.this,NumbersActivity.class);
               //start the new activity
               startActivity(numberIntent); }
        });
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create a new intent to open the @link_Numbers_Activity
                Intent familyIntent = new Intent(MainActivity.this,FamilyActivity.class);
                //start the new activity
                startActivity(familyIntent); }
        });
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create a new intent to open the @link_Numbers_Activity
                Intent colorsIntent = new Intent(MainActivity.this,ColorsActivity.class);
                //start the new activity
                startActivity(colorsIntent); }
        });
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create a new intent to open the @link_Numbers_Activity
                Intent phrasesIntent = new Intent(MainActivity.this,phrasesActivity.class);
                //start the new activity
                startActivity(phrasesIntent); }
        });






    }

}
