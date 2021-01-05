package ua.mainacademy.service;

import java.util.ArrayList;
import java.util.Collections;

public class PalindromeFinder {

    public static int fromMax(int min, int max) {

        int palindrome = 0;
        int maxNumber=max*max;
        int minNumber=min*min;

        for (int i=maxNumber; i>=minNumber; i--){
            StringBuilder one = new StringBuilder(String.valueOf(i));
            StringBuilder two = new StringBuilder (one);
            two.reverse();
            if(one.toString().equals(two.toString())){
                for(int j=min; j<=max; j++) {
                    if (i%j==0){
                        if (i/j<=max) {
                            palindrome = i;
                        }
                    }
                    if (palindrome!=0) {break;}
                }
            }
            if (palindrome!=0) {break;}
        }
        return palindrome;
    }



    public static int cycle(int min, int max) {

        ArrayList<Integer> palindromes = new ArrayList<>();

        for (int i=max; i>=min; i--) {
            for (int j = i; j >= min; j--) {
                int z = i * j;
                StringBuilder one = new StringBuilder(String.valueOf(z));
                StringBuilder two = new StringBuilder(one);
                two.reverse();
                if (one.toString().equals(two.toString())) {
                    palindromes.add(z);
                }
            }
        }
        Collections.sort(palindromes);

        return palindromes.get(palindromes.size()-1);
    }
}
