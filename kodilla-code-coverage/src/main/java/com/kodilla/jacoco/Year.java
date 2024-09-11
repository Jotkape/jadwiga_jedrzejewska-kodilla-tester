package com.kodilla.jacoco;

public class Year {
    private final int givenYear;

    public Year(int year) {
        this.givenYear = year;
    }

    public boolean isLeap() {
        return (givenYear % 4 == 0 && (givenYear % 100 != 0 || givenYear % 400 == 0));
    }
}
