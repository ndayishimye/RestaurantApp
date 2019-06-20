package com.example.androidquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.security.acl.Group;
import java.util.ArrayList;

public class Dishes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dishes);
        ArrayList<String> words = new ArrayList<String>();

        words.add("josue");
        words.add("moise");
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        TextView wordsView = new TextView(this);
        wordsView.setText(words.get(0));
        rootView.addView(wordsView);
    }
}
