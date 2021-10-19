package codingcontest;

public class NonRepeatingElement {

    public static void main(String[] args) {
        int[] arr = { -1, 2, -1, 3, 2 };
        int n = arr.length;
        int element = 0;

        for (int i = 0; i < n; i++) {
            int nonRepeatingElement = 0;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        nonRepeatingElement = 0;
                        break;
                    } else {
                        nonRepeatingElement = arr[i];
                    }
                }
            }
            if (nonRepeatingElement != 0) {
                element = nonRepeatingElement;
            }
        }
        if (element != 0) {
            System.out.println("Non repeated element is " + element);
        } else {
            System.out.println("There are no non-repeated elements!");
        }
    }
}
