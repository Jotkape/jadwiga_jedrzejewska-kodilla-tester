package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ForumStatsTestSuit {

    public static List<User> getUsersList() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        return users;
    }

    @Test
    void avgNumberOfPostUnder40() {
        ForumStats tested = new ForumStats();
        double avgNumberOfPostUnder40 = tested.avgNumberOfPostUnder40(getUsersList().stream());
        assertEquals(2382, avgNumberOfPostUnder40);
    }

    @Test
    void avgNumberOfPostAbove40() {
        ForumStats tested = new ForumStats();
        double avgNumberOfPostAbove40 = tested.avgNumberOfPostAbove40(getUsersList().stream());
        assertEquals(2.25, avgNumberOfPostAbove40);
    }

    @Test
    void avgNumberOfPostOneUser() {
        ForumStats tested = new ForumStats();
        double avgNumberOfPostOneUser = tested.avgNumberOfPostUnder40(List.of(new User("sasf", 35, 5, "sdf")).stream());
        assertEquals(5, avgNumberOfPostOneUser);
    }

    @Test
    void avgNumberOfPostNoneUser() {
        ForumStats tested = new ForumStats();
        double avgNumberOfPostNoneUser = tested.avgNumberOfPostUnder40(List.of(new User("sasf", 55, 5, "sdf")).stream());
        assertEquals(Double.NaN, avgNumberOfPostNoneUser);
    }

    @Test
    void avgNumberOfPostEmptyUserList() {
        ForumStats tested = new ForumStats();
        double avgNumberOfPostEmptyUserList = tested.avgNumberOfPostUnder40(Stream.empty());
        assertEquals(Double.NaN, avgNumberOfPostEmptyUserList);
    }


}