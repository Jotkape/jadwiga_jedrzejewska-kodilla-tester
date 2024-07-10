package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager2 {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);

        List<User> usersOlderThan45 = filterUsersOlderThan(45);
        usersOlderThan45.forEach(user -> System.out.println(user.getUsername()));

        List<User> usersNumberOfPost = filterUsersNumberOfPost(100);
        usersNumberOfPost.forEach(user -> System.out.println(user.getNumberOfPost()));
    }

    public static List<String> filterChemistGroupUsernames() {
        /*List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager2::getUserName)
                .collect(Collectors.toList());

        return usernames;*/
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager2::getUserName)
                .collect(Collectors.toList());
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }

    public static List<User> filterUsersOlderThan(int age) {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
    }

    public static List<User> filterUsersNumberOfPost(int numberOfPost) {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() > numberOfPost)
                .collect(Collectors.toList());
    }
}