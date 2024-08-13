public class Book {
    // Prywatne pola dla autora i tytułu
    private String author;
    private String title;

    // Statyczna metoda of do tworzenia obiektów klasy Book
    public static Book of(String author, String title) {
        Book book = new Book();
        book.title = title;
        book.author = author;

        return book;
    }

    // Metody dostępowe do pól author i title
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    // Przykładowe użycie klasy
    public static void main(String[] args) {
        // Tworzenie obiektu Book za pomocą metody of
        Book book = Book.of("Isaac Asimov", "The Galaxy");

        // Wyświetlanie autora i tytułu książki
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
    }

}