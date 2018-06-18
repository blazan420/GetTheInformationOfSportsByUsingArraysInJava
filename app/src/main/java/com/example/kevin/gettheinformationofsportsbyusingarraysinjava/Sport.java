package com.example.kevin.gettheinformationofsportsbyusingarraysinjava;

import android.widget.TextView;

public class Sport {

    //Instance Variables

    private String sportName;
    private int[] scores;

    //Constructor
    public Sport(String sportName, int[] scores) {

        this.sportName = sportName; //extansiation
        this.scores = scores;

    }

    // Setter and Getter
    public void setSportName(String sportName) {
        this.sportName = sportName;
    }
    public  String getSportName() {
        return sportName;
    }
    //access modifier is public, returns an integer.
    public int getTheMinimumValue() {

        int lowestScore = scores[0]; // Now we are assuming that scores[index] is the lowest score
        for (int score : scores) {

            if (score < lowestScore) {
                lowestScore = score;
            }
        }

        return lowestScore;
    }

    public int getTheMaximumValue() {

        int highestScore = scores[0]; // Now we are assuming that the scores[index] is the highest score
        for (int score : scores) {
            if (score > highestScore) {
                highestScore = score;
            }
        }
        return highestScore;
    }
    // Get the average value
    public  double getTheAverage() {

        int total = 0;

        for (int score : scores) {
            total += score;
            // total = total + score;
        }

        return (double) total / scores.length;
    }

    public void letsOutPutTheScores(TextView textView) {

        String oldTextViewValue;

        for (int index = 0; index < scores.length; index++) {

            oldTextViewValue = textView.getText().toString();

            textView.setText(String.format(oldTextViewValue + "Athlete Number: %2d: %3d\n", index, scores[index]));

        }
    }


}
