package com.example.android.quidditchcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayGriff(1);
    }
    //these are methods that can display things on the application
    public void displayGriff(int score){
        TextView scoreView = (TextView) findViewById(R.id.gryff_score);
        scoreView.setText(String.valueOf(score));
    }
}
