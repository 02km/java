public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 3, 1, 24, 12 };

        // Bubble sort algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            for (int k = 0; k < arr.length - i - 1; k++) {
                if (arr[k] > arr[k + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.print("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
