package com.realdolmen.weatherforecast;

import com.realdolmen.savingsaccount.*;

/**
 * Created by stannisbaratheon on 08/06/16.
 */
public class WeatherForecastSelector {
    public static void main(String[] args) {
        boolean isOk = false;

        while (!isOk) {

            try {
                String season = UsefullMethods.readString("Please enter the season :");
                Season selectedSeason2 = Season.valueOf(season.toUpperCase());
                System.out.println(selectedSeason2 + " Rain: " + selectedSeason2.percRain + " Snow: "
                        + selectedSeason2.percSnow + " Sunshine: "
                        + selectedSeason2.percSunsh
                );
                isOk = true;
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                System.out.println("Réne: You STUUUUPID WOMAN!");
            } catch (NullPointerException e) {
                e.printStackTrace();
                System.out.println("MAYDAY MAYDAY, THIS FIELD IS MANDATORY");
            }


        }

        //Season selectedSeason = null;



        /* switch (season.toUpperCase()) {
            case "FALL":
                selectedSeason = Season.FALL;
                break;
            case "SPRING":
                selectedSeason = Season.SPRING;
                break;
            case "SUMMER":
                selectedSeason = Season.SUMMER;
                break;
            case "WINTER":
                selectedSeason = Season.WINTER;
                break;
        }

        System.out.println(selectedSeason.toString() + " Rain: " +selectedSeason.percRain + " Snow: "
                + selectedSeason.percSnow + " Sunshine: "
                + selectedSeason.percSunsh
        );

        */


    }

    public static void doSomethingIllegal(int i) {
        if (i == 1507) {
            throw new IllegalArgumentException("Dit is niet goed");

        } else if (i == 2000) {
            throw new SomethingIsNotRightException("You know what I'm talking about");
        }

    }
}

