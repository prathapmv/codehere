package codingcontest;

import java.util.Arrays;

public class SumPair {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 1, 7, 2, 4 };
        int sum = 6;
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;

        System.out.println("Pairs formed are ");
        while (i != j) {
            if (arr[i] + arr[j] == sum) {
                System.out.println(arr[i] + " , " + arr[j]);
            }
            if (arr[i] + arr[j] > sum)
                j--;
            else
                i++;
        }
    }
}
