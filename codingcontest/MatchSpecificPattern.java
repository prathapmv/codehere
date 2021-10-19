package codingcontest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MatchSpecificPattern {
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();
        words.add("cdd");
        words.add("pcm");
        String pattern = "foo";
        List<String> result = patternMatch(words, pattern);

        System.out.println("Valid words matched are " + result);
    }

    public static List<String> patternMatch(List<String> words, String pattern) {

        // Create an array to store all valid strings
        List<String> result = new ArrayList<String>();

        // Iterate over all the words.
        for (String i : words) {
            boolean isValid = matchSpecificPatternHelper(i, pattern);

            // Check if isValid is equal to true
            if (isValid == true) {
                result.add(i);
            }
        }

        // Return the array result
        return result;
    }

    public static boolean matchSpecificPatternHelper(String word, String pattern) {
        // Check if length of word is not equal to length of pattern
        if (word.length() != pattern.length()) {
            return false;
        }

        // Maintain two HashMap
        HashMap<Character, Character> mapPat = new HashMap();
        HashMap<Character, Character> mapWord = new HashMap();

        // Iterate through the string pattern
        for (int i = 0; i < pattern.length(); i++) {
            char chW = word.charAt(i), chP = pattern.charAt(i);

            if (!mapPat.containsKey(chP) && !mapWord.containsKey(chW)) {
                mapPat.put(chP, chW);
                mapWord.put(chW, chP);
            } else if (mapPat.containsKey(chP)) {
                char l = mapPat.get(chP);
                if (l != chW) {
                    return false;
                }
            } else if (mapWord.containsKey(chW)) {
                char x = mapWord.get(chW);
                if (x != chP) {
                    return false;
                }
            }
        }

        return true;
    }
}
