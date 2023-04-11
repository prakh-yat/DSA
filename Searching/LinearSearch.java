public class LinearSearch {
    
    public static int linearSearch(int[] arr, int x, int index) {
        if (index >= arr.length) {
            return -1;
        } else if (arr[index] == x) {
            return index; 
        } else {
            return linearSearch(arr, x, index + 1); 
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int x = 15;
        int index = linearSearch(arr, x, 0);
        if (index == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index " + index + ".");
        }
    }
}
