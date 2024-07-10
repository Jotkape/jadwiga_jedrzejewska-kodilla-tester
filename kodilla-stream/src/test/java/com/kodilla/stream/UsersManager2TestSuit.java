package com.kodilla.stream;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UsersManager2TestSuit {
    @Test
    public void testFilterChemistGroupUsernames() {
        List<String> chemistGroupUsernames = UsersManager2.filterChemistGroupUsernames();
        assertEquals(2, chemistGroupUsernames.size());
        assertEquals("Walter White", chemistGroupUsernames.get(0));
        assertEquals("Gale Boetticher", chemistGroupUsernames.get(1));
    }

    @Test
    public void testFilterUsersOlderThan() {
        List<User> usersOlderThan = UsersManager2.filterUsersOlderThan(45);
        assertEquals(3, usersOlderThan.size());
        for (User user : usersOlderThan) {
            assertTrue(user.getAge() > 45);
        }
    }

    @Test
    public void testFilterUsersNumberOfPost() {
        List<User> usersNumberOfPost = UsersManager2.filterUsersNumberOfPost(100);
        assertEquals(2, usersNumberOfPost.size());
        for (User user : usersNumberOfPost) {
            assertTrue(user.getNumberOfPost() > 100);
        }
    }
}