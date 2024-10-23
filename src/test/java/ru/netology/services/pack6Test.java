package ru.netology.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class packTest {
    @Test
    public void testpack6() {
        //       Arrange
        pack6 service = new pack6();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        //         Act
        int actual = service.calculate(income, expenses, threshold);
        int expected = 3;
        //       Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testpack60() {
        //       Arrange
        pack6 service = new pack6();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        //         Act
        int actual = service.calculate(income, expenses, threshold);
        int expected = 2;
        //       Assert
        assertEquals(expected, actual);
    }
}