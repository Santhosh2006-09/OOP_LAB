package string.utils;

import java.util.Arrays;


public class StringOperations {
    
    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
    
    public static int countVowels(String input) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
    
    // Intermediate string operations
    public static boolean isPalindrome(String input) {
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return clean.equals(reverse(clean));
    }
    
    public static String[] splitIntoWords(String input) {
        return input.trim().split("\\s+");
    }
    
    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (result.indexOf(String.valueOf(input.charAt(i))) == -1) {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }
    
    public static String capitalizeWords(String input) {
        String[] words = splitIntoWords(input);
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                words[i] = words[i].substring(0, 1).toUpperCase() + 
                           words[i].substring(1).toLowerCase();
            }
        }
        return String.join(" ", words);
    }
}