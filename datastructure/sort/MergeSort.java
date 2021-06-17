package com.csingh.datastructure.sort;

// this code is inspired from https://www.geeksforgeeks.org/merge-sort/
public class MergeSort {
	
	
	public static int[] mergeSortA(int arr[], int beg, int end)
	{
		if (beg < end) {
			// Find the middle element
			int middle =beg+ (end-beg)/2;

			// repeat sort process for first half and second half
			mergeSortA(arr, beg, middle);
			mergeSortA(arr, middle + 1, end);

			// Merge the sorted halves
			return mergeAllSortedSubArray(arr, beg, middle, end);
		}
		return new int [] {};
	}
	
	private static int[] mergeAllSortedSubArray(int[] arr, int beg, int middle, int end) {
				// we will get size of both subarray
				int size1 = middle - beg + 1;
				int size2 = end - middle;
				// create temp subarray 
				int TempLSubArray[] = new int[size1];
				int TempRSubArray[] = new int[size2];
				
				// put data from original array into temp sub arrays
				for (int i = 0; i < size1; ++i) {
					TempLSubArray[i] = arr[beg + i];
				}
				for (int j = 0; j < size2; ++j) {
					TempRSubArray[j] = arr[middle + 1 + j];
				}
				
				// Now we will start merging both two sub array in sorted order
				
				int i = 0, j = 0;

				// Initial index of merged subarry array
				int k = beg;
				while (i < size1 && j < size2) {
					if (TempLSubArray[i] <= TempRSubArray[j]) {
						arr[k] = TempLSubArray[i];
						i++;
					}
					else {
						arr[k] = TempRSubArray[j];
						j++;
					}
					k++;
				}
				
				//Copy remaining elements of both temp Sub array
				while (i < size1) {
					arr[k] = TempLSubArray[i];
					i++;
					k++;
				}
				while (j < size2) {
					arr[k] = TempRSubArray[j];
					j++;
					k++;
				}
			return arr;
	}	
	
	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		printArray(arr);

		MergeSort.mergeSortA(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);
	}
	
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
