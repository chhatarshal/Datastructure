package com.dsa.questions.Questions.array;

import java.util.Arrays;

public class ReversArrayInPlace {
	
	public static void main(String[] args) {
		int ar[] = new int[] {1};
		int bg = 0;
		int ed = ar.length - 1;
		while (bg < ed) {
			swap(bg, ed, ar);
			bg = bg + 1;
			ed = ed - 1;
		}
		Arrays.stream(ar).forEach(System.out::print);
	}
	
	public static void swap(int x, int y, int arr[]) {
		int tmp = arr[x];
		arr[x] = arr[y];
		arr[y] = tmp;
	}

}
 