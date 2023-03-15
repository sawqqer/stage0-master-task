package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Wrong month number");
            return;
        }

        String season;

        if (monthNumber == 12 || monthNumber <= 2) {
            season = "Winter";
        } else if (monthNumber <= 5) {
            season = "Spring";
        } else if (monthNumber <= 8) {
            season = "Summer";
        } else {
            season = "Fall";
        }

        System.out.println(season);
    }

}
