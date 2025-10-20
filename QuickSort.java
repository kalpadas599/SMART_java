public class QuickSort {

 
    public void sort(int[] arr, int low, int high) {
        if (low < high) {
           
            int pi = partition(arr, low, high);

            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    // This method takes the last element as pivot, places the pivot element at its correct position
    // in sorted array, and places all smaller (than pivot) to left of pivot and all greater elements
    // to right of pivot
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as pivot
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partitioning index
    }

    // Driver method to test the QuickSort
    public static void main(String[] args) {
        int[] data = {10, 7, 8, 9, 1, 5};
        int n = data.length;

        QuickSort qs = new QuickSort();
        qs.sort(data, 0, n - 1);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; ++i) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
} 

