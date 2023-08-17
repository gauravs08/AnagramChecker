package com.beyonnex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramCheckerTest {

    @Test
    public void testAnagramStrings() {
        testAnagram("evil", "vile", true);
        testAnagram("hello", "world", false);
    }

    @Test
    public void testAnagramStringsWithSpaces() {
        testAnagram("this is string with spaces", "spaces with string is this ", true);
        testAnagram("this is string with spaces", "spaceswithstringisthis ", true);
        testAnagram("this is string with spaces", "string ", false);
    }

    @Test
    public void testAnagramStringsWithCase() {
        testAnagram("thisIsCaseSensitiveString", "THISISCASESENSITIVESTRING ", true);
        testAnagram("this Is Case Sensitive String", "THIS IS CASE SENSITIVE STRING", true);
    }

    @Test
    public void testAnagramStringFromWiki() {
        testAnagram("New York Times", "monkeys write", true);
        testAnagram("Church of Scientology", "rich chosen goofy cult", true);
        testAnagram("McDonald's restaurants", "Uncle Sam's standard rot", true);
        testAnagram("coronavirus", "carnivorous", true);
    }

    public void testAnagram(String text1, String text2, boolean expectedResult) {
        boolean result = AnagramCheckerMain.checkAnagrams(text1, text2);
        assertEquals(expectedResult, result, String.format("Given strings are not Anagram: %s,%s", text1, text2));
    }
}
