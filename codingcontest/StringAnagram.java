package codingcontest;

public class StringAnagram {
    public static void main(String[] args) {
        String str1 = "accept";
        String str2 = "expect";
        int strAnagram = getMinimumAnagramDifference(str1, str2);
        System.out.println("strAnagramLength: " + strAnagram);
    }

    public static int getMinimumAnagramDifference(String str1, String str2) {
        // Variable to store the minimum manipulations required to make string anagram.
        int minAnagramDiff = 0;

        int n = str1.length();

        char str1Array[] = str1.toCharArray();
        char str2Array[] = str2.toCharArray();

        // Iterate over the first string.
        for (int i = 0; i < n; i++) {
            int j;

            // Searching into the second string.
            for (j = 0; j < n; j++) {
                // If both the string has equal characters,
                // Then change the character of the second string.
                if (str1Array[i] == str2Array[j]) {
                    str2Array[j] = '#';
                    break;
                }
            }
            // If there is no matching character for the current character in the second
            // string.
            if (j == n) {
                minAnagramDiff++;
            }
        }
        // Return minimum manipulations require to make string anagram.
        return minAnagramDiff;
    }
}
