package com.kodilla.collections.adv.immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTestSuite {

    @Test
    void testBookConstructorAndGetters() {
        // Given
        Book book = new Book("John Stewart", "The last chance");

        // When & Then
        assertEquals("John Stewart", book.getAuthor());
        assertEquals("The last chance", book.getTitle());
    }

    @Test
    void testBookRecordConstructorAndGetters() {
        // Given
        BookRecord bookRecord = new BookRecord("test", "testowa pozycja", 2022);

        // When & Then
        assertEquals("test", bookRecord.author());
        assertEquals("testowa pozycja", bookRecord.title());
        assertEquals(2022, bookRecord.year());
    }

    @Test
    void testBookRecordEquality() {
        // Given
        BookRecord bookRecord1 = new BookRecord("test", "testowa pozycja", 2022);
        BookRecord bookRecord2 = new BookRecord("test", "testowa pozycja", 2022);
        BookRecord bookRecord3 = new BookRecord("inny", "inna pozycja", 2023);

        // When & Then
        assertEquals(bookRecord1, bookRecord2); // Sprawdzenie, czy dwa takie same rekordy są równe
        assertNotEquals(bookRecord1, bookRecord3); // Sprawdzenie, czy różne rekordy są nierówne
    }

    @Test
    void testBookRecordToString() {
        // Given
        BookRecord bookRecord = new BookRecord("John Stewart", "The last chance", 2020);

        // When
        String result = bookRecord.toString();

        // Then
        assertEquals("BookRecord[author=John Stewart, title=The last chance, year=2020]", result);
    }

}