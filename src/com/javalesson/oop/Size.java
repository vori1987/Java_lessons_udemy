package com.javalesson.oop;

public enum Size {
    VERY_BIG("XL"), BIG("L"), AVERAGE("M"), SMALL("S"), VERY_SMALL("XS"), UNDEFINED("");

    Size(String abbreviation){
       this.abbreviation = abbreviation;
    }
    private String abbreviation;

    public String getAbbreviation() {
        return abbreviation;
    }
}
