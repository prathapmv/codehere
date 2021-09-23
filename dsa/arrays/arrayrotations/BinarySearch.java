package codehere.dsa.arrays.arrayrotations;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 7, 23, 37, 48, 72, 81, 89, 94 };
		int n = arr.length;
		int x = 7;
		int elementFoundAt = binarySearch(arr, n, x);
		if (elementFoundAt != -1)
			System.out.println("Element found at " + elementFoundAt);
		else {
			System.out.println("Element not found!");
		}
	}

	private static int binarySearch(int[] arr, int n, int x) {
		// TODO Auto-generated method stub
		int startIndex = 0;
		int endIndex = arr.length - 1;
		int mid = 0;
		// int element = 0;

		while (startIndex <= endIndex) {
			mid = (startIndex + endIndex) / 2;
			if (x == arr[mid])
				return mid;
			if (x < arr[mid]) {
				endIndex = mid - 1;
			}
			if (x > arr[mid]) {
				startIndex = mid + 1;
			}
		}

		return -1;
	}

}
