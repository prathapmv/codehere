package sortingalgorithms;

public class BubbleSorting {

	static void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print("\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 3, 1, 5, 6, 4, 2, 7 };
		print(a);
		bubbleSort(a, a.length);
		print(a);
	}

	private static void bubbleSort(int[] a, int length) {
		// TODO Auto-generated method stub
		// sorting bottom to top i.e., from n-1 to 0 by comparing the largest element
		// and placing it at the end of the array.
		int i = 0;
		while (i < length) {
			bubble(a, length);
			i++;
		}
	}

	private static void bubble(int[] a, int length) {
		// TODO Auto-generated method stub
		int i = length - 1;
		int j = 0;
		while (i > 0) {
			// System.out.println("i: " + i + " j: " + j);
			j = i - 1;
			if (a[i] < a[j]) {
				swap(a, i, j);
			}
			i--;
		}
	}

}
