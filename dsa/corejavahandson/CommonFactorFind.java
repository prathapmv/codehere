package corejavahandson;

public class CommonFactorFind {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a = 12;
        int b = 8;
        int count = 0;
        for (int i = 1; i < b + 1; i++) {
            if ((b % i == 0) && (a % i == 0)) {
                // System.out.println("i: " + i);
                count++;
            }
        }
        // System.out.println(count);

        int arr[] = { 17891, 22, 33, 4324, 555 };
        int sum = 0;
        int N = arr.length;

        for (int i = 0; i < N; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of the input array: " + sum);
        int i = 1;
        while (true) {
            int sumCheck = i * N;

            if (sumCheck > sum) {
                System.out.println("sumCheck: " + sumCheck);
                break;
            }
            i++;
        }
        System.out.println("Maximum number that exceeds the sumCheck of the given array: " + i);
    }

}
