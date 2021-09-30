package arrays.arrayrotations;

/*
Given an array, only rotation operation is allowed on array. 
We can rotate the array as many times as we want. Return the maximum possible summation of i*arr[i].
Input: arr[] = {1, 20, 2, 10}
Output: 72
We can get 72 by rotating array twice.
{2, 10, 1, 20}
20*3 + 1*2 + 10*1 + 2*0 = 72
*/

public class MaxSum {
    public static void main(String args[]) {
        int arr[] = { 1, 20, 2, 10 };
        int sumArr[] = new int[arr.length];

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            ReversalAlgoArrayRotation.arrayRotate(arr, i + 1, n);
            sumArr[i] = sumArray(arr);
        }
        findLargestSum(sumArr);
    }

    private static void findLargestSum(int[] sumArr) {
        int largestSum = 0;
        int rotationCount = 0;
        for (int i = 0; i < sumArr.length - 1; i++) {
            if (sumArr[i] >= sumArr[i + 1]) {
                largestSum = sumArr[i];
                rotationCount = i;
            } else {
                largestSum = sumArr[i + 1];
                rotationCount = i;
            }
        }
        System.out.println(
                "Largest summation from the given array is " + largestSum + " with " + rotationCount + " rotations.");
    }

    private static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += i * arr[i];
        return sum;
    }
}
