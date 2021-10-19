package codingcontest;

public class TripletsSumZero {
    public static void main(String[] args) {
        int arr[] = { -10, 5, 5, -1, 2 };
        int k = 3; // considering k as 3 because we need to find the triplets
        int arrSize = arr.length;
        for (int i = 0; i < arrSize; i++) {
            if ((i + k - 1) < arrSize)
                findTriplets(arr, i, k);
        }
    }

    private static void findTriplets(int[] arr, int start, int k) {
        int end = start + k;
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += arr[i];
        }
        if (sum == 0) {
            System.out.print("Triplets are ");
            for (int i = start; i < end; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
