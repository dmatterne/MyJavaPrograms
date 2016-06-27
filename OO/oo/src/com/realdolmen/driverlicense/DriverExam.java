package com.realdolmen.driverlicense;

import java.util.TreeMap;

/**
 * Created by stannisbaratheon on 14/06/16.
 */
public class DriverExam {

    private static TreeMap<Integer, String> corrAnswers;
    private TreeMap<Integer, String> currAnswers;


    public DriverExam() {

        corrAnswers = new TreeMap<Integer, String>();
        corrAnswers.put(1, "B");
        corrAnswers.put(2, "D");
        corrAnswers.put(3, "A");
        corrAnswers.put(4, "A");
        corrAnswers.put(5, "C");
        corrAnswers.put(6, "A");
        corrAnswers.put(7, "B");
        corrAnswers.put(8, "A");
        corrAnswers.put(9, "C");
        corrAnswers.put(10, "D");
        corrAnswers.put(11, "B");
        corrAnswers.put(12, "C");
        corrAnswers.put(13, "D");
        corrAnswers.put(14, "A");
        corrAnswers.put(15, "D");
        corrAnswers.put(16, "C");
        corrAnswers.put(17, "C");
        corrAnswers.put(19, "B");
        corrAnswers.put(19, "D");
        corrAnswers.put(20, "A");

    }


    public boolean passed() {
        if (totalCorrect() > 14) {
            return true;
        } else return false;
    }

    public int totalCorrect() {
        int totalCorr = 0;
        return totalCorr;
    }

    public int totalInCorrect() {
        int totalInCorr = 0;
        return totalInCorr;
    }

    public int totalMissed() {
        int totalMissed = 0;
        return totalMissed;
    }


    public static TreeMap<Integer, String> getCorrAnswers() {
        return corrAnswers;
    }

    public static void setCorrAnswers(TreeMap<Integer, String> corrAnswers) {
        DriverExam.corrAnswers = corrAnswers;
    }

    public TreeMap<Integer, String> getCurrAnswers() {
        return currAnswers;
    }

    public void setCurrAnswers(TreeMap<Integer, String> currAnswers) {
        this.currAnswers = currAnswers;
    }


}
