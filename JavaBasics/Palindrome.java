package com.sparta.golam;

public class Palindrome {

    public static boolean palindromeCheck(String word) {
        String wordLower = word.toLowerCase();
        boolean isPalindrome = false;
        if (word.length() < 3) {
            System.err.println("Word must be at least three characters long");
            System.exit(0);
        } else if (word.length() == 3) {
            if (wordLower.charAt(0) == wordLower.charAt(2)) {
                isPalindrome = true;
            }
        } else if (word.length() % 2 == 0) {
            for (int i = 0; i < (word.length() - 2) / 2; i++) {
                if (wordLower.charAt(i) == wordLower.charAt(word.length() - 1 - i)) {
                    isPalindrome = true;
                } else {
                    isPalindrome = false;
                    break;
                }
            }
        } else {
            for (int i = 0; i < (word.length() - 3) / 2; i++) {
                if (wordLower.charAt(i) == wordLower.charAt(word.length() - 1 - i)) {
                    isPalindrome = true;
                } else {
                    isPalindrome = false;
                    break;
                }
            }
        }
        return isPalindrome;
    }


    public static String longestPalindrome(String sentence){
        String[] splitSentence = sentence.split(" ");
        String longestPalWord = "";
        for(String word:splitSentence) {
            if (word.length() < 3) {
                continue;
            } else if (word.length() > longestPalWord.length()) {
                if (palindromeCheck(word)) {
                    longestPalWord = word;
                }
            }
        }
        if (longestPalWord.equals("")) {
            return "This sentence contains no palindromes";
        } else {
            return "The longest palindrome here is::" + longestPalWord;
        }
    }



}
