package codingcontest;

import java.util.HashSet;

public class LargestSubString {
    public static void main(String[] args) {
        String inputStr = "xyxyz";
        int longestSubString = lengthOfLongestSubstring(inputStr);
        System.out.println("longestSubString: " + longestSubString);
    }

    public static int lengthOfLongestSubstring(String s) {

        // Declaring maxlen which will store the length of the longest substring without
        // repeating characters.
        int maxLen = 0, len = s.length();

        // Running a nested loop to check for each substring of the string.
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (isAllUnique(s, i, j)) {
                    // Updating maxLen and it gets updated if current substring length is greater
                    // than maxLen.
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        // Return maxlen which is storing the length of the longest substring without
        // repeating characters.
        return maxLen;
    }

    // This UDF returns true if each characters in the string are unique.
    public static boolean isAllUnique(String s, int start, int end) {

        // Declaring an HashSet of char for checking,
        // If the given input substring has all unique characters or not.
        HashSet<Character> set = new HashSet<>();

        // Iterating for each character index in the string.
        for (int i = start; i <= end; i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                return false;
            }

            set.add(c);
        }
        return true;
    }

}
