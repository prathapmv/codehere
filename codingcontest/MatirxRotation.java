package codingcontest;

import java.security.Principal;

public class MatirxRotation {
    public static void main(String[] args) {
        int rows = 4, columns = 4;
        int a[][] = new int[rows][columns];
        int k = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = j + 1;
            }
        }

        printMatrix(a, rows, columns);

        for (int r = 0; r < a.length; r++) {
            rotateMatrix(a, r, k);
        }
        System.out.println("Rotated Matrix:");
        printMatrix(a, rows, columns);
    }

    private static void rotateMatrix(int[][] a, int r, int k) {

        int matrixSize = a.length;
        for (int m = 0; m < k; m++) {
            int temp = a[r][0];
            for (int l = 0; l < matrixSize - 1; l++) {
                a[r][l] = a[r][l + 1];
            }
            a[r][matrixSize - 1] = temp;
        }
    }

    static void printMatrix(int[][] a, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
