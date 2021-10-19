package codingcontest;

public class StringRotation {
    public static void main(String[] args) {
        String str = "codingninjas";
        int rotatingCount = 3;
        System.out.println("Input String: " + str);

        char[] charArr = str.toCharArray();
        reverseString(charArr, 0, rotatingCount - 1);
        reverseString(charArr, rotatingCount, str.length() - 1);
        reverseString(charArr, 0, str.length() - 1);

        System.out.println("Rotated String: " + String.valueOf(charArr));
    }

    private static void reverseString(char[] charArr, int start, int end) {
        while (start < end) {
            char temp = charArr[start];
            charArr[start] = charArr[end];
            charArr[end] = temp;
            start++;
            end--;
        }
    }
}
