package com.example.kevin.gettheinformationofsportsbyusingarraysinjava;

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


}
