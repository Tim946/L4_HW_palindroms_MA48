package ua.mainacademy.service;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeFinderTest {

    @org.junit.jupiter.api.Test
    void fromMax() {
        int min= 1000;
        int max = 9999;
        int result = PalindromeFinder.fromMax(min,max);
        assertEquals(99000099,result);

    }

    @org.junit.jupiter.api.Test
    void cycle() {
        int min= 1000;
        int max = 9999;
        int result = PalindromeFinder.cycle(min,max);
        assertEquals(99000099,result);

    }
}