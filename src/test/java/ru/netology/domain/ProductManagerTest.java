package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    @Test
    void shouldSearchByAuthor() {
        Repository repository = new Repository();
        ProductManager manager = new ProductManager(repository);
        Product[] expected = {new Book(3, "Autobiography", 400, "Helmut Newton")};
        Product[] actual = manager.searchBy("Helmut Newton");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByNameBook() {
        Repository repository = new Repository();
        ProductManager manager = new ProductManager(repository);
        Product[] expected = {new Book(1, "Death is a lonely business", 300, "Ray Bradbury")};
        Product[] actual = manager.searchBy("death is a lonely business");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByNameSmartphone() {
        Repository repository = new Repository();
        ProductManager manager = new ProductManager(repository);
        Product[] expected = {new Smartphone(1, "11 Pro", 90000, "iPhone")};
        Product[] actual = manager.searchBy("11 pro");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByManufacturer() {
        Repository repository = new Repository();
        ProductManager manager = new ProductManager(repository);
        Product[] expected = {new Smartphone(2, "Galaxy A50", 10000, "Samsung")};
        Product[] actual = manager.searchBy("samsung");
        assertArrayEquals(expected, actual);
    }


}