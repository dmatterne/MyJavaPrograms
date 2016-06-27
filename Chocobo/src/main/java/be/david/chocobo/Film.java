package be.david.chocobo;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Created by stannisbaratheon on 22/06/16.
 */
public class Film {
    private int film_id;
    private String title;
    private String description;
    private int year;
    private int languageId;
    private int originalLanguage;
    private int rentalDuration;
    private long rentalRate;
    private int length;
    private long replacementCost;
    private Rating rating;
    private ArrayList<String> specialFeatures;
    private LocalDateTime lastUpdate;

    public Film(String title, int languageId, int rentalDuration, long rentalRate, long replacementCost) {
        this.title = title;
        this.languageId = languageId;
        this.rentalDuration = rentalDuration;
        this.rentalRate = rentalRate;
        this.replacementCost = replacementCost;
    }

    public Film(String title, String description, int year, int languageId, int originalLanguage,
                int rentalDuration, long rentalRate, int length, long replacementCost, Rating rating,
                ArrayList<String> specialFeatures) {

        this(title,languageId,rentalDuration,rentalRate,replacementCost);
        this.description = description;
        this.year = year;
        this.originalLanguage = originalLanguage;
        this.length = length;
        this.rating = rating;
        this.specialFeatures = specialFeatures;
    }



}
