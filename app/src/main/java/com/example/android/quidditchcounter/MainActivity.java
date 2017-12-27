package com.example.android.quidditchcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Integer griffScore = 0;
    Integer slythScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // reset scores
    public void resetScores(View view){
        griffScore = 0;
        slythScore = 0;
        displayGriff(griffScore);
        displaySlyth(slythScore);
    }
    //Button Snitch
    public void griffAddOneHundrednFifty(View view){
        griffScore += 150;
        displayGriff(griffScore);
    }

    public void slythAddOneHundrednFifty(View view){
        slythScore += 150;
        displaySlyth(slythScore);
    }

    // Button Quaffle
    public void griffAddTen(View view){
        griffScore += 10;
        displayGriff(griffScore);
    }
    public void slythAddTen(View view){
        slythScore += 10;
        displaySlyth(slythScore);
    }
    //these are methods that can display things on the application
    public void displayGriff(int score){
        TextView scoreView = (TextView) findViewById(R.id.gryff_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displaySlyth(int score){
        TextView scoreView = (TextView) findViewById(R.id.slyth_score);
        scoreView.setText(String.valueOf(score));
    }
}
