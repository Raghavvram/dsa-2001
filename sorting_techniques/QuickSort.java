import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int partitionIndex = partition(arr, low, high);
			quickSort(arr, low, partitionIndex);
			quickSort(arr, partitionIndex + 1, high);
		}
	}

	// Hoare partition scheme
	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[low]; // Pivot is the first element
		int left = low - 1;
		int right = high + 1;

		while (true) {
			// Find the leftmost element greater than or equal to pivot
			do {
				left++;
			} while (arr[left] < pivot);

			// Find the rightmost element smaller than or equal to pivot
			do {
				right--;
			} while (arr[right] > pivot);

			// If pointers cross, return the partition index
			if (left >= right) {
				return right;
			}

			// Swap elements
			swap(arr, left, right);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		// int[] arr = {8, 4, 7, 3, 9, 2, 5, 1, 6}; 9

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Original Array: " + Arrays.toString(arr));

		quickSort(arr, 0, arr.length - 1);

		System.out.println("Sorted Array: " + Arrays.toString(arr));
	}
}