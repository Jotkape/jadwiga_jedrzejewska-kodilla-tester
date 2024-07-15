package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import java.util.stream.Stream;

public class ForumStats {

    public double avgNumberOfPostUnder40(Stream<User> users) {
        return users
                .filter(u -> u.getAge() < 40)
                .mapToInt(u -> u.getNumberOfPost())
                .average()
                .orElse(Double.NaN);
    }

    public double avgNumberOfPostAbove40(Stream<User> users) {
        return users
                .filter(u -> u.getAge() >= 40)
                .mapToInt(u -> u.getNumberOfPost())
                .average()
                .getAsDouble();
    }

    public static void main(String[] args) {


    }
}
