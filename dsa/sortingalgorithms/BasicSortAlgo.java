package codehere.dsa.sortingalgorithms;

public class BasicSortAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 3, 2, 5, 4 };
		sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print("\t");
		}
	}

	private static void sort(int[] a) {
		// TODO Auto-generated method stub
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) { // if "<" then it is ascending order & ">" for descending order
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

}
