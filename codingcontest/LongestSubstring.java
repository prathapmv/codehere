package codingcontest;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "xyxyz";

        char[] charArr = str.toCharArray();
        int maxCount = 0;
        for (int i = 0; i < charArr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < charArr.length; j++) {
                count = check(charArr, i, j);
                if (count > maxCount) {
                    maxCount = count;
                }
            }
        }
        System.out.println("Longest substring without repeating characters lenght is " + maxCount);
    }

    private static int check(char[] charArr, int start, int end) {
        int count = 0;
        while (start < end) {
            if (charArr[start] != charArr[start + 1]) {
                count++;
            } else {
                count = 0;
            }
            start++;
        }
        return count;
    }
}
