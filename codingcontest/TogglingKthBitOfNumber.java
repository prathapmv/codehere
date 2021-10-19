package codingcontest;

public class TogglingKthBitOfNumber {
    public static void main(String[] args) {
        int num = 8;
        int k = 3;
        String binary = "";
        int end = (num / 2);
        for (int i = 0; i < end; i++) {
            binary = (num % 2) + binary;
            num = num / 2;
        }

        char[] charArr = binary.toCharArray();
        if (charArr[k] == '1')
            charArr[k] = '0';
        else
            charArr[k] = '1';

        binary = String.valueOf(charArr);

        System.out.println("Kth bit toggled string is " + Integer.valueOf(binary, 2));

    }
}
