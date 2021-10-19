package codingcontest;

public class NintyDegreeRotation {
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
        // Transpose the given matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        System.out.println("Transpose Matrix:");
        printMatrix(a, rows, columns);

        // Flipping the columns
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n / 2); j++) {
                int temp = a[i][j];
                a[i][j] = a[i][n - 1 - j];
                a[i][n - 1 - j] = temp;
            }
        }
        System.out.println("90 degree rotated Matrix:");
        printMatrix(a, rows, columns);
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
