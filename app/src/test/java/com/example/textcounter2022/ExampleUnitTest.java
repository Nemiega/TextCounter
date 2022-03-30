package com.example.textcounter2022;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.textcounter2022.utils.TextUtils;

public class ExampleUnitTest {
    @Test
    public void getCharsCount_Given_emptyString_Result_Zero() {
        String givenString = "";
        int expectedValue = 0;
        int actualValue =  TextUtils.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getCharsCount_Given_SpacesString_Result_Four() {
        String givenString = "    ";
        int expectedValue = 4;
        int actualValue = TextUtils.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getCharsCount_Given_NormalString_Result_eight() {
        String givenString = "Test job";
        int expectedValue = 8;
        int actualValue = TextUtils.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getCharsCount_Given_TenCharsString_Result_Ten() {
        String givenString = "0123456789";
        int expectedValue = 10;
        int actualValue = TextUtils.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getCharsCount_Given_SymbolString_Result_Five() {
        String givenString = "/<->.";
        int expectedValue = 5;
        int actualValue = TextUtils.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }
    @Test(expected = NullPointerException.class)
    public void getCharsCount_Given_NullString_Result_Exception() {
        String givenString = null;
        int actualValue = TextUtils.getCharsCount(givenString);
    }
    @Test
    public void getWordsCount_Given_EmptyString_Result_Zero() {
        String givenString = "";
        int expectedValue = 0;
        int actualValue = TextUtils.getWordsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getWordsCount_Given_NormalString_Result_Eight() {
        String givenString = "Test job";
        int expectedValue = 2;
        int actualValue = TextUtils.getWordsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getWordsCount_Given_NumberString_Result_One() {
        String givenString = "0123456789";
        int expectedValue = 1;
        int actualValue = TextUtils.getWordsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getWordsCount_Given_SymbolString_Result_One() {
        String givenString = "/<->.";
        int expectedValue = 1;
        int actualValue = TextUtils.getWordsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }
    @Test (expected = NullPointerException.class)
    public void getWordsCount_Given_NullString_Result_Exception() {
        String givenString = null;
        int actualValue = TextUtils.getWordsCount(givenString);
    }
}