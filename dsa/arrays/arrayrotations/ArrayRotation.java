package codehere.dsa.arrays.arrayrotations;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rotatedSpot = 4;
		int inputArray[] = { 1, 2, 3, 4, 5, 6, 7 };
		int rotatedArray[] = new int[inputArray.length];

		// Printing the input array for better verification of the output
		System.out.println("Input Array:");
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i]);
			System.out.print("\t");
		}

		// Initializing j as 0 and using it to iterate through the input array till it's
		// limit
		int j = 0;

		// Rotation Logic - Start
		for (int i = rotatedSpot; j < inputArray.length; i++) {
			// Process all the elements next to the rotation spot and store them in the
			// output array firstly
			if (i + 1 >= rotatedSpot) {
				rotatedArray[j] = inputArray[i];
			}

			// When the above process reaches the end of the input array then iterate the
			// input array
			// from the beginning of the input array till the rotation spot reaches and
			// continue to store
			// it in the output array on each iteration.
			else {
				rotatedArray[j] = inputArray[i];
			}

			// Re-initializing i to -1 to iterate from the starting index till the rotation
			// spot
			if (i == inputArray.length - 1) {
				i = -1;
			}

			j++;
		}
		// Rotation logic - End

		// Printing the output array
		System.out.println("\n\nRotated Array:");
		for (int i = 0; i < rotatedArray.length; i++) {
			System.out.print(rotatedArray[i]);
			System.out.print("\t");
		}

	}

}
