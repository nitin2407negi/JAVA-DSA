public class Sumsimilar {
    public static void main(String args[]) {
        int arr[] = {6, 6, 1, 1, 6, 6, 6};
        int matched = 0;  // Initialize matched to 0
        int value = 0;
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {  // Only process non-zero elements
                matched = 1;  // Reset matched for each new element
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        matched++;
                        arr[j] = 0;  // Mark this element as processed
                    }
                }
                value = arr[i];
                total += (matched * value);  // Update total correctly
            }
        }
        
        System.out.println("Total: " + total);
    }
}
