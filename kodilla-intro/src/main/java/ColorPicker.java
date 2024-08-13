import java.util.Scanner;

public class ColorPicker {

    // Metoda główna
    public static void main(String[] args) {
        char firstLetter = askUserForFirstLetter();
        String colorName = getColorName(firstLetter);

        if (colorName != null) {
            System.out.println("Wybrany kolor: " + colorName);
        } else {
            System.out.println("Nieznana litera koloru.");
        }
    }

    // Metoda statyczna do zadawania pytania użytkownikowi
    public static char askUserForFirstLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą literę koloru: ");
        String input = scanner.nextLine().trim().toLowerCase();

        if (input.length() == 1) {
            return input.charAt(0);
        } else {
            System.out.println("Podano nieprawidłowy znak.");
            return askUserForFirstLetter(); // Ponowne pytanie w przypadku nieprawidłowego wejścia
        }
    }

    // Metoda zwracająca nazwę koloru na podstawie pierwszej litery
    public static String getColorName(char firstLetter) {
        switch (firstLetter) {
            case 'c':
                return "Czerwony lub czarny";
            case 'z':
                return "Zielony";
            case 'n':
                return "Niebieski";
            case 'p':
                return "Pomarańczowy";
            case 'f':
                return "Fioletowy";
            case 'b':
                return "Biały";
            default:
                return null; // Zwraca null dla nieznanej litery
        }
    }
}
