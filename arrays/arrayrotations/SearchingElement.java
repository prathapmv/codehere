package arrays.arrayrotations;

public class SearchingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 4, 5, 6, 7, 8, 1, 2 };
		int key = 7;
		int start = 0;
		int end = arr.length - 1;

		int keyFoundAt = search(arr, start, end, key);

		if (keyFoundAt != -1)
			System.out.println("Key found at the index position: " + keyFoundAt);
		else
			System.out.println("Key not found!");
	}

	private static int search(int[] arr, int start, int end, int key) {
		// TODO Auto-generated method stub

		if (start > end)
			return -1;

		int mid = (start + end) / 2;

		// If the mid element is the key to be found then return it.
		if (arr[mid] == key)
			return mid;

		// Take first half of the given array and check if the key is there. If yes then
		// recurse on it and find the key.
		// Else do the same in the second half. Note: Both the halves would be sorted as
		// the given array is
		// sorted and rotated at some unknown pivot point.
		if (start <= mid) {
			if (key >= arr[start] && key <= arr[mid])
				return search(arr, start, mid - 1, key);

			return search(arr, mid + 1, end, key);
		}

		// Take second half of the given array and check if the key is there. If yes
		// then recurse on it and find the key.
		// Else do the same in the second half. Note: Both the halves would be sorted as
		// the given array is
		// sorted and rotated at some unknown pivot point.
		if (key >= arr[mid] && key <= arr[end])
			return search(arr, mid + 1, end, key);

		return search(arr, start, mid - 1, key);
	}
}
