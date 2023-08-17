package com.beyonnex;

import java.util.Arrays;
import java.util.Scanner;


public class AnagramCheckerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string to compare Anagram: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string to compare Anagram: ");
        String secondString = scanner.nextLine();

        scanner.close();

        if (checkAnagrams(firstString, secondString)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    public static boolean checkAnagrams(String firstString, String secondString) {
        // Check 1: Remove spaces and convert to lowercase to make comparison case-insensitive
        firstString = firstString.replaceAll("\\s", "").toLowerCase();
        secondString = secondString.replaceAll("\\s", "").toLowerCase();

        // Check2: If the lengths of the two texts are not equal, they cannot be anagrams
        if (firstString.length() != secondString.length()) {
            return false;
        }

        // Convert the strings to char arrays and sort them
        char[] charArray1 = firstString.toCharArray();
        char[] charArray2 = secondString.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }
}