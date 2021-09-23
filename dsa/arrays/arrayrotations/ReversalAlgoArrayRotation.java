package codehere.dsa.arrays.arrayrotations;

public class ReversalAlgoArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputArray[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int rotationSpot = 5;
		System.out.println("Input Array:");
		printArray(inputArray);
		System.out.println();
		arrayRotate(inputArray, rotationSpot, inputArray.length);
		System.out.println("\nRotated Array:");
		printArray(inputArray);

	}

	private static void arrayRotate(int[] inputArray, int rotationSpot, int length) {
		// TODO Auto-generated method stub
		reverseArray(inputArray, 0, rotationSpot - 1);
		reverseArray(inputArray, rotationSpot, length - 1);
		reverseArray(inputArray, 0, length - 1);
	}

	private static void reverseArray(int[] inputArray, int startIndex, int endIndex) {
		// TODO Auto-generated method stub

		int temp = 0;
		while (startIndex < endIndex) {
			temp = inputArray[startIndex];
			inputArray[startIndex] = inputArray[endIndex];
			inputArray[endIndex] = temp;
			startIndex++;
			endIndex--;
		}
	}

	private static void printArray(int[] inputArray) {
		// TODO Auto-generated method stub
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i]);
			System.out.print("\t");
		}
	}

}
