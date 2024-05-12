import java.util.Arrays;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 3, 4, 5, 2, 3, 4, 2, 3, 2, 2};

        // Sort the array
        Arrays.sort(arr);

        int n = arr.length;
        int frequency = 1;

        // Iterate through the sorted array
        for (int i = 1; i < n; i++) {
            // If the current element is equal to the previous element
            if (arr[i] == arr[i - 1]) {
                frequency++;
            } else {
                // If the current element is different from the previous element
                System.out.println("Element " + arr[i - 1] + " occurs " + frequency + " times");
                frequency = 1; // Reset frequency for the new element
            }
        }

        // Print frequency for the last element
        System.out.println("Element " + arr[n - 1] + " occurs " + frequency + " times");
    }
}
