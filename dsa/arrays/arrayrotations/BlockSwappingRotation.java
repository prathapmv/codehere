package arrays.arrayrotations;

import java.util.Arrays;

public class BlockSwappingRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 3; // Rotation spot
		int n = arr.length; // Length of an array
		blockSwap(arr, d, n);
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print("\t");
		}
	}

	private static void blockSwap(int[] arr, int d, int n) {
		// TODO Auto-generated method stub
		// Splitting the given array into two sub-arrays with starting to rotation spot
		// as one block and rest as another block
		int A = d;
		int B = n - d;

		while (A != B) {
			if (A < B) {
				swap(arr, d - A, d + B - A, A); // starting index -> (d-A) for 'A' array and starting index -> (d+B-A)
												// for'B' array are formula derivation to determine the respective index
												// position to make the right swapping and do it size of 'A' array times
												// in this case it's 3.
				B = B - A; // Here 'B' array is bigger and so recursion happens in 'B' array. So, reduce
							// 'B' array's size as we'll consider 'B' array for the next step. In this case,
							// initial 'B' size is 4 (4,5,6,7) and if you consider only this part then
							// (4,5,6) becomes 'A' array and (7) becomes 'B' array. Hence, we need to reduce
							// the original initialized 'B' size.
			} else {
				swap(arr, d - A, d, B); // starting index -> (d-A) for 'A' array and starting index -> (d) for'B' array
										// are formula derivation to determine the respective index position to make the
										// right swapping and do it size of 'B' array times in this case it's 1.
				A = A - B; // Here 'A' array is bigger and so recursion happens in 'A' array. So, reduce
							// 'A' array's size as we'll consider 'A' array for the next step. In this case,
							// initial 'A' size is 3 (5,6,7,4) and if you consider only this part then
							// (5,6,7) becomes 'A' array and (4) becomes 'B' array. Hence, we need to reduce
							// the original initialized 'A' size.
			}
			System.out.println(Arrays.toString(arr));
		}
		swap(arr, d - A, d, A);
		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[] arr, int firstStart, int secondStart, int swapLimit) {
		// TODO Auto-generated method stub
		int temp = 0;
		for (int i = 0; i < swapLimit; i++) {
			temp = arr[firstStart + i];
			arr[firstStart + i] = arr[secondStart + i];
			arr[secondStart + i] = temp;
		}
	}

}
