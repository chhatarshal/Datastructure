package com.csingh.datastructure.problems;

public class ArrayOfProduct {

	public static int[] productOfMatrix(int arr[]) {
		int temp = 1;
		if (arr.length < 1)
			return arr;
		int outarr[] = new int[arr.length];
		for (int i =0; i < arr.length; i++) {
			for (int k =0; k < arr.length; k ++) {
				if (i == k) {
					continue;
				}
				temp = temp * arr[k];
			}
			outarr[i] = temp;
			temp = 1;
		}
		return outarr;
	}
	
	public static void main(String[] args) {
			 int arin[] =  new int[]{};
			for (int i : arin) 
			System.out.print("," + i);
			System.out.println("\n");
			int output[] = ArrayOfProduct.productOfMatrix(arin);
			for (int i : output) 
			System.out.print("," + i);
	}
}
