package codingcontest;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        int rows = 3, columns = 3;
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("Input Array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
        if (isTranspose(a, rows, columns)) {
            System.out.println("Yes, the given matrix is a transpose matrix.");
        } else {
            System.out.println("No, the given matrix is not a transpose matrix.");
        }

    }

    private static boolean isTranspose(int[][] a, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (a[i][j] != a[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
