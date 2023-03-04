package kenchang8787.com.Sorting;

/**
 * 堆積排序法 (Heap Sort)
 */
public class HeapSort implements ISortable {
    @Override
    public int[] sort(int... input) {

        int N = input.length;

        // Build heap (rearrange array)
        for (int i = N / 2 - 1; i >= 0; i--) heapify(input, N, i);

        // One by one extract an element from heap
        for (int i = N - 1; i > 0; i--) {
            // Move current root to end
            int temp = input[0];
            input[0] = input[i];
            input[i] = temp;

            // call max heapify on the reduced heap
            heapify(input, i, 0);
        }

        return input;
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int N, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < N && arr[l] > arr[largest]) largest = l;

        // If right child is larger than largest so far
        if (r < N && arr[r] > arr[largest]) largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, N, largest);
        }
    }
}
