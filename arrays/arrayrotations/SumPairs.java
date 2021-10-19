package arrays.arrayrotations;

/*
Given an array that is sorted and then rotated around an unknown point. 
Find if the array has a pair with a given sum ‘x’. 
It may be assumed that all elements in the array are distinct.
Examples : 
Input: arr[] = {11, 15, 6, 8, 9, 10}, x = 16
Output: true
There is a pair (6, 10) with sum 16
 */

public class SumPairs {
    public static void main(String args[]) {
        int a[] = { 11, 15, 8, 9, 10, 7 };
        int x = 15;

        boolean checkSum = sumCheck(a, x);
        if (checkSum)
            System.out.println("Yes, there are two elements in the given array which sums given x.");
        else
            System.out.println("No, there are no two elements in the given array which sums given x.");
    }

    private static boolean sumCheck(int[] a, int x) {

        int i;
        int n = a.length;

        for (i = 0; i < n; i++) {
            if (a[i] > a[i + 1])
                break;
        }

        int l = (i + 1) % n;
        int r = i;

        while (l != r) {
            if (a[l] + a[r] == x) {
                System.out.println("Elements that sums up the given x: " + a[l] + " , " + a[r]);
                return true;
            }

            if (a[l] + a[r] < x) {
                l = (l + 1) % n;
            } else {
                r = (n + r - 1) % n;
            }
        }

        return false;
    }

    // static boolean sumCheck(int[] a, int x) {
    // int n = a.length;
    // boolean sumCheck = false;

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n; j++) {
    // if (a[i] + a[j] == x && i != j) {
    // sumCheck = true;
    // }
    // }
    // }
    // return sumCheck;
    // }

}
