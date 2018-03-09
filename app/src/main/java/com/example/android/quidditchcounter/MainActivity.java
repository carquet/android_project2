package com.example.android.quidditchcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String SCORE_VIEW_GRYFF = "View Score Gryffindor";
    public static final String SCORE_VIEW_SLYTH = "View Score Slytherin";
    public static final String SLYTH_SCORE = "Slythering score data";
    public static final String GRYFFINDOR_SCORE = "Gryffindor Score data";
    public static final String END_GAME_STATE = "end game state";
    Integer griffScore = 0;
    Integer slythScore = 0;
    boolean snitchDone = false;
    TextView scoreViewSlyth;
    TextView scoreViewGryff;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreViewSlyth = (TextView) findViewById(R.id.slyth_score);
        scoreViewGryff = (TextView) findViewById(R.id.gryff_score);

        if(savedInstanceState != null){
            //RETRIEVING SCORE DATA
            griffScore = savedInstanceState.getInt(GRYFFINDOR_SCORE, griffScore);
            slythScore = savedInstanceState.getInt(SLYTH_SCORE, slythScore);

            //RETRIEVING STRINGS FOR VIEWS
            String score1 = savedInstanceState.getString(SCORE_VIEW_GRYFF);
            String score2 = savedInstanceState.getString(SCORE_VIEW_SLYTH);

            //DISPLAYING THE SAVED DATA
            scoreViewGryff.setText(score1);
            scoreViewSlyth.setText(score2);

            //RESTATING ENDGAME
            snitchDone = savedInstanceState.getBoolean(END_GAME_STATE);


        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        //Saving gryffindor's score as data and view
        outState.putString(SCORE_VIEW_GRYFF, griffScore.toString());
        outState.putInt(GRYFFINDOR_SCORE, griffScore);

        //Saving SLYTHERIN's score as data and view
        outState.putString(SCORE_VIEW_SLYTH, slythScore.toString());
        outState.putInt(SLYTH_SCORE, slythScore);

        //saving gameover
        outState.putBoolean(END_GAME_STATE, snitchDone);
        super.onSaveInstanceState(outState);
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

    //these are methods that can display scores on in their respective views
    public void displayGriff(int score){
        scoreViewGryff.setText(String.valueOf(score));
    }

    public void displaySlyth(int score){
        scoreViewSlyth.setText(String.valueOf(score));
    }
}
