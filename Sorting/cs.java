public class cs{

    public static void sort(int[] arr) {
        int n = arr.length;

        // Find the maximum element in the array
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Create a count array to store the count of each element
        int[] count = new int[max + 1];

        // Store the count of each element in count array
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Modify the count array such that each element stores the
        // sum of previous counts
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Create a temporary array to store the sorted elements
        int[] output = new int[n];

        // Build the output array by traversing the input array from right to left
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy the sorted elements from output array to input array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // A utility function to print array of size n
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = { 4, 2, 2, 8, 3, 3, 1 };
        int n = arr.length;

        CountSort.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }
}