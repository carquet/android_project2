package com.example.android.quidditchcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Integer griffScore = 0;
    Integer slythScore = 0;
    boolean snitchDone = false;

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
        snitchDone = false;

    }
    //SNITCH and END GAME
    public void griffAddOneHundrednFifty(View view){
        if(!snitchDone) {
            snitchDone = true;
            griffScore += 150;
            displayGriff(griffScore);
        }
    }
    public void slythAddOneHundrednFifty(View view){
        if(!snitchDone){
            snitchDone = true;
            slythScore += 150;
            displaySlyth(slythScore);
        }
    }

    // QUAFFLE ADDS 10 POINTS AND STOPS AFTER THE SNITCH
    public void griffAddTen(View view){
        if(!snitchDone){
            griffScore += 10;
            displayGriff(griffScore);
        }

    }
    public void slythAddTen(View view){
        if(!snitchDone){
            slythScore += 10;
            displaySlyth(slythScore);
        }
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
