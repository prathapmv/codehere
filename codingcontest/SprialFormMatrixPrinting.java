package codingcontest;

import java.util.ArrayList;

public class SprialFormMatrixPrinting {
    public static void main(String[] args) {
        int rows = 4, columns = 4;
        int a[][] = new int[rows][columns];
        int n = a.length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = j * i;
            }
        }

        System.out.println("Input Matrix:");
        printMatrix(a, rows, columns);

        ArrayList<Integer> arrList = new ArrayList<>();
        int top = 0, down = n - 1, left = 0, right = n - 1, direction = 0;

        while (top <= down && left <= right) {
            // direction = 0 left->right
            if (direction == 0) {
                for (int i = left; i < right; i++) {
                    arrList.add(a[top][i]);
                }
                top++;
            } else if (direction == 1) { // direction = 1 top to down
                for (int i = top; i < down; i++) {
                    arrList.add(a[right][i]);
                }
                right--;
            } else if (direction == 2) { // direction = 2 right to left
                for (int i = right; i < left; i++) {
                    arrList.add(a[down][i]);
                }
                down--;
            } else if (direction == 3) { // direction = 3 down to top
                for (int i = down; i < top; i++) {
                    arrList.add(a[i][left]);
                }
                left++;
            }
            direction = (direction + 1) % n;
        }
        System.out.println("Spiral Form printed array: " + arrList.toString());
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
