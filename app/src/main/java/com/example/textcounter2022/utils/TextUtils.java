package com.example.textcounter2022.utils;

public class TextUtils {
    public static int getCharsCount(String input) {
        return input.length();
    }

    public static int getWordsCount(String input) {
        String words = input.trim();
        if (words.isEmpty())
            return 0;
        return words.split("\\s+").length;
    }
}
