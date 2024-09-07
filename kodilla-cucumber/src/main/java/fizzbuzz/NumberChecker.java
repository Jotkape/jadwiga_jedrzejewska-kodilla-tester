package fizzbuzz;

import java.time.MonthDay;

public class NumberChecker {
    public static String checkFizzBuzz(int number) {
        return isFizzBuzz(number) ? "FizzBuzz" :
                isFizz(number) ? "Fizz" :
                        isBuzz(number) ? "Buzz" : "None";
    }

    private static boolean isFizzBuzz(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    private static boolean isFizz(int number) {
        return number % 3 == 0;
    }

    private static boolean isBuzz(int number) {
        return number % 5 == 0;
    }
}
