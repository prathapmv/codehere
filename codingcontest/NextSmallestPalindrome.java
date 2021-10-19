package codingcontest;

public class NextSmallestPalindrome {
    public static void main(String[] args) {
        String inputStr = "1201";
        char[] charArr = inputStr.toCharArray();
        String nextPalindrome = nextSmallerPalindrome(inputStr);
        System.out.println("nextPalindrome: " + nextPalindrome);
    }

    public static String nextSmallerPalindrome(String s) {
        if (s.charAt(0) == '1' && s.length() == 1) {
            return "0";
        }

        int n = s.length();

        // From mid position, move left and right, till you encounter 's[i]' != '0'.
        char arr[] = s.toCharArray();

        int mid = n / 2;

        for (int i = mid; i < n; i++) {
            int digit = arr[i] - '0';

            // If the digit is not 0, reduce it by 1.
            if (digit != 0) {
                arr[i] = (char) ((digit - 1) + '0');
                arr[n - 1 - i] = (char) ((digit - 1) + '0');
                break;
            }

            // Else change digit 0 to 9.
            else {
                arr[i] = '9';
                arr[n - 1 - i] = '9';
            }

        }

        /*
         * Handling 100001 types cases -> after doing above steps -> 099990 gets
         * converted to 99999.
         */

        if (arr[0] == '0') {
            arr[0] = '9';

            // Converting character array to string.
            s = String.valueOf(arr);
            return s.substring(0, n - 1);

        }

        else {
            s = String.valueOf(arr);
            return s;
        }
    }

}
