package com.example.textcounter2022.utils;

public class TextUtils {
    public static int getCharsCount(String givenString) {
        return givenString.length();
    }

    public static int getWordsCount(String givenString) {
        String words = givenString.trim();
        return words.split("\\s+").length;
    }
}
