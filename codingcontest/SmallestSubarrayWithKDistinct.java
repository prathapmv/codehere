package codingcontest;

import java.util.HashMap;

public class SmallestSubarrayWithKDistinct {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 2, 2, 3, 4, 4, 3, 5, 6 };
        int k = 3;
        HashMap map = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            if ((i + k - 1) < arr.length) {
                if (contiguousCheck(arr, i, k)) {
                    map.put(i, i + 2);
                }
            }
        }

        System.out.println(map);
    }

    private static boolean contiguousCheck(int[] arr, int start, int k) {
        boolean check = false;
        int end = k + start;
        for (int i = start; i < end - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                check = true;
            } else {
                check = false;
                break;
            }
        }
        return check;
    }
}
