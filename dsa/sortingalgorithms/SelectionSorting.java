package sortingalgorithms;

public class SelectionSorting {

	static void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	static void selectionSort(int[] a, int n) {
		int i = 0;
		while (i < n) {
			int j = smallestEleLoc(a, i, n - 1);
			System.out.println("Smallest Element's Index: " + j);
			swap(a, i, j);
			i++;
		}
	}

	private static int smallestEleLoc(int[] a, int startIndex, int endIndex) {
		// TODO Auto-generated method stub
		int j = startIndex;
		while (startIndex < endIndex) {
			if (a[startIndex] < a[j]) {
				j = startIndex;
			}
			startIndex++;
		}
		return j;
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
		int a[] = { 3, 1, 5, 2, 4, 6 };
		print(a);
		selectionSort(a, a.length); // sorting top to bottom i.e., from 0 to n-1 by comparing the smallest element
									// and placing it at the beginning of the array.
		print(a);
	}

}
