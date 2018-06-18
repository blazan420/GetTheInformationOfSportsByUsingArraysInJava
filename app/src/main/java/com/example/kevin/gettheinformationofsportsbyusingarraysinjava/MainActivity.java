package com.example.kevin.gettheinformationofsportsbyusingarraysinjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create the objects

        TextView txtSportName = (TextView) findViewById(R.id.txtSportName);
        TextView txtScores = (TextView) findViewById(R.id.txtScores);
        TextView txtScoresAverage = (TextView) findViewById(R.id.txtScoresAverage);
        TextView txtHighestScore = (TextView) findViewById(R.id.txtHighestScore);
        TextView txtLowestScore = (TextView) findViewById(R.id.txtLowestScore);

        int[] scoreArray = {87, 34, 56, 23, 65, 98, 35, 21, 48, 56, 45, 86, 37};

        Sport mySport = new Sport("Boxing", scoreArray);
        txtSportName.setText(mySport.getSportName());
        mySport.letsOutPutTheScores(txtScores);
        txtScoresAverage.setText(mySport.getTheAverage() + "");
        txtHighestScore.setText(mySport.getTheMaximumValue() + "");
        txtLowestScore.setText(mySport.getTheMinimumValue() + "");




    }
}
