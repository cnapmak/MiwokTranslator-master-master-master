package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an ArrayList of numbers
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going", "minto wukus"));
        words.add(new Word("Whats your name", "tinne oyoaasene"));
        words.add(new Word("My name is", "oyaaset"));
        words.add(new Word("How are you feeeling?", "michekses"));
        words.add(new Word("Im feeling good.", "kucho achit"));
        words.add(new Word("Are you coming", "eenes'aa"));
        words.add(new Word("Yes, I'm coming","hee'eenem"));
        words.add(new Word("I'm coming.", "eenem"));
        words.add(new Word("Le'ts go", "yoowutis"));
        words.add(new Word("Come here.", "enninem"));



        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
