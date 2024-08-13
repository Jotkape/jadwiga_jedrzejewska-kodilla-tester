import java.util.Random;

public class RandomNumbers {
        private int[] numbers;  // Tablica przechowująca wylosowane liczby
        private int count;      // Liczba wylosowanych liczb
        private Random random;  // Obiekt do generowania liczb losowych

        // Konstruktor inicjalizujący tablicę i obiekt Random
        public RandomNumbers() {
            numbers = new int[10000]; // Tablica o dużym rozmiarze, aby pomieścić wiele liczb
            count = 0;
            random = new Random();
        }

        // Metoda losująca liczby z zakresu 0-30, aż suma przekroczy 5000
        public void generateNumbers() {
            int sum = 0;
            while (sum <= 5000) {
                int number = random.nextInt(31); // Losuje liczbę z zakresu 0-30 (włącznie)
                numbers[count] = number;
                count++;
                sum += number;
            }
        }

        // Metoda zwracająca największą wylosowaną wartość
        public int getMaxValue() {
            if (count == 0) {
                throw new IllegalStateException("Tablica liczb jest pusta. Najpierw wygeneruj liczby.");
            }

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < count; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
            return max;
        }

        // Metoda zwracająca najmniejszą wylosowaną wartość
        public int getMinValue() {
            if (count == 0) {
                throw new IllegalStateException("Tablica liczb jest pusta. Najpierw wygeneruj liczby.");
            }

            int min = Integer.MAX_VALUE;
            for (int i = 0; i < count; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
            return min;
        }

        // Przykładowe użycie klasy
        public static void main(String[] args) {
            RandomNumbers randomNumbers = new RandomNumbers();

            // Generowanie liczb
            randomNumbers.generateNumbers();

            // Wyświetlanie największej i najmniejszej wylosowanej wartości
            System.out.println("Największa wylosowana wartość: " + randomNumbers.getMaxValue());
            System.out.println("Najmniejsza wylosowana wartość: " + randomNumbers.getMinValue());
        }
    }
/* jak wywołać sprawdzenie wyświetlania liczb w public void generateNumbers()
czy nie moge używać tych samych zmiennych w róznych klasach? bo na czerwono się podświetlaja?
dlaczego w konstruktorze musz uzywać nazwy klasy? I przy generowaniu obiektu również?
 */