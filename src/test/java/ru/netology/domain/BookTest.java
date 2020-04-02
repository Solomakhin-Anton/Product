package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void shouldMatchesByAuthorTrue() {
        Book book = new Book(2, "I heard you paint houses", 500, "Charles Brandt");
        assertEquals(true, book.matches("charles brandt"));
    }

    @Test
    void shouldMatchesByAuthorFalse() {
        Book book = new Book(2, "I heard you paint houses", 500, "Charles Brandt");
        assertEquals(false, book.matches("edgar allen poe"));
    }

    @Test
    void shouldMatchesByNameTrue() {
        Book book = new Book(2, "I heard you paint houses", 500, "Charles Brandt");
        assertEquals(true, book.matches("i heard you paint houses"));
    }

    @Test
    void shouldMatchesByNameFalse() {
        Book book = new Book(2, "I heard you paint houses", 500, "Charles Brandt");
        assertEquals(false, book.matches("Death is a lonely business"));
    }

}