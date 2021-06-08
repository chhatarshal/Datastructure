package com.csingh.datastructure.sort;

public class BubbleSort {
	
	public static int[] sort(int array[]) {
		for (int i = 0; i < array.length; i ++) {
			for (int j = i; j < array.length; j ++) {
				if (array[i] > array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		return array;
	}

}
