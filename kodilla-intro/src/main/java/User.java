public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
        User user1 = new User("Adam", 800);
        User user2 = new User("Bartek", 45);
        User user3 = new User("Cezary", 25);

        User[] users = {user1, user2, user3};

        int sumAge = 0;
        for (int i = 0; i < users.length; i++) {
            sumAge = sumAge + users[i].getAge();
        }
        int avrAge = sumAge / users.length;

        for (int i = 0; i <users.length; i++){
            if (users[i].getAge() < avrAge) {
                System.out.println(users[i].getName());
            }
        }
    }
}