package codingcontest;

public class LinesMaxArea {
    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 1, 4 }; // heights of your lines which is y-axis
        int maxValue = 0;
        System.out.println(arr[0]);
        for (int i = 0; i < arr.length; i++) { // consider 'i' as your x-axis
            int max = 0;
            for (int j = i + 1; j < arr.length; j++) {
                max = ((j + 1) - (i + 1)) * Math.min(arr[j], arr[i]);
                // calculating the area - width * height. Here, 'j-i' denotes width and
                // Math.min(j,i) denotes height
                if (max > maxValue) {
                    maxValue = max;
                }
            }
        }
        System.out.println("Maximum area between the two lines is " + maxValue);
    }
}
