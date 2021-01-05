package ua.mainacademy;

import ua.mainacademy.service.PalindromeFinder;

import java.util.logging.Logger;

public class ApplicationPalindrome {

    public static void main(String[] args) {
        final int MIN = 1000;
        final int MAX = 9999;
        final Logger LOGGER=Logger.getLogger(ApplicationPalindrome.class.getName());

        int palindrome = PalindromeFinder.fromMax(MIN,MAX);
        LOGGER.info("MAX palindrome by fromMax method is " + palindrome);

        palindrome = PalindromeFinder.cycle(MIN,MAX);
        LOGGER.info("MAX palindrome by cycle is " + palindrome);
    }
}
