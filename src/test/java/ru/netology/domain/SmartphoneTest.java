package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    @Test
    void shouldMatchesByManufacturerTrue() {
        Smartphone smartphone = new Smartphone(3, "P20", 30000, "Huawei");
        assertEquals(true, smartphone.matches("huawei"));
    }

    @Test
    void shouldMatchesByManufacturerFalse() {
        Smartphone smartphone = new Smartphone(3, "P20", 30000, "Huawei");
        assertEquals(false, smartphone.matches("samsung"));
    }

    @Test
    void shouldMatchesByNameTrue() {
        Smartphone smartphone = new Smartphone(3, "P20", 30000, "Huawei");
        assertEquals(true, smartphone.matches("p20"));
    }

    @Test
    void shouldMatchesByNameFalse() {
        Smartphone smartphone = new Smartphone(3, "P20", 30000, "Huawei");
        assertEquals(false, smartphone.matches("p30"));
    }

}