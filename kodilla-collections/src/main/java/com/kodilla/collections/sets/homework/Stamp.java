package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private String stampDimensions;
    private String stampStamped;

    public Stamp(String stampName, String stampDimensions, String stampStamped) {
        this.stampName = stampName;
        this.stampDimensions = stampDimensions;
        this.stampStamped = stampStamped;
    }

    public String getStampName() {
        return stampName;
    }

    public String getStampDimensions() {
        return stampDimensions;
    }

    public String getStampStamped() {
        return stampStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Objects.equals(stampName, stamp.stampName) && Objects.equals(stampDimensions, stamp.stampDimensions) && Objects.equals(stampStamped, stamp.stampStamped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampDimensions, stampStamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampDimensions='" + stampDimensions + '\'' +
                ", stampStamped='" + stampStamped + '\'' +
                '}';
    }
}
