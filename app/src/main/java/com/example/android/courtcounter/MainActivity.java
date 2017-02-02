package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scorePlayer1 = 0;
    int scorePlayer2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void displayForPlayer1(int score){
        TextView scoreView = (TextView) findViewById(R.id.player_1);
        scoreView.setText(String.valueOf(score));
    }
    // ** Increase score of player1 by 3 points ** //
    public void inc3(View view){
        scorePlayer1  += 3;
        displayForPlayer1(scorePlayer1);
    }
    // ** Increase score of player1 by 5 points ** //
    public void inc5(View view){
        scorePlayer1  += 5;
        displayForPlayer1(scorePlayer1);
    }
    // ** Increase score of player1 by 1 points ** //
    public void inc1(View view){
        scorePlayer1  += 1;
        displayForPlayer1(scorePlayer1);
    }

    /*
    * Functions for player2 here.
    */
    private void displayForPlayer2(int score){
        TextView scoreView = (TextView)findViewById(R.id.player_2);
        scoreView.setText(String.valueOf(score));
    }
    public void inc3b(View view){
        scorePlayer2  += 3;
        displayForPlayer2(scorePlayer2);
    }
    // ** Increase score of player2 by 5 points ** //
    public void inc5b(View view){
        scorePlayer2  += 5;
        displayForPlayer2(scorePlayer2);
    }
    // ** Increase score of player2 by 1 points ** //
    public void inc1b(View view){
        scorePlayer2  += 1;
        displayForPlayer2(scorePlayer2);
    }

    public void reset(View view){
        scorePlayer1 = 0;
        scorePlayer2 = 0;
        displayForPlayer1(scorePlayer1);
        displayForPlayer2(scorePlayer2);
    }
}
