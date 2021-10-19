package codingcontest;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = { 20, 20, 20, 4, 5, 20, 1, 20, 4, 20 };
        int eleCount = 0;
        int majorityEle = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > eleCount) {
                majorityEle = arr[i];
                eleCount = count;
            }
        }
        System.out.println("Majority Element: " + majorityEle);
    }
}
