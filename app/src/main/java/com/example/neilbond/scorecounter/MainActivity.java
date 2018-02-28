package com.example.neilbond.scorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    int threePoints = 3;
    int twoPoints= 2;
    int freeThrows= 4;


    public void addThree(View view) {
        displayForTeamA(threePoints);
    }


    public void addTwo(View view) {
        displayForTeamA(twoPoints);

    }

    public void addFour(View view) {
        displayForTeamA(freeThrows);

    }




    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }



}
