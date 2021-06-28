package com.csingh.datastructure.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class canSumTabulation {

	
	public static void main(String[] args) {
		
		System.out.println(canSum(11, new int[] {3, 5, 6}));
	}

	private static Boolean canSum(int target, int[] js) {
		List<Boolean> tableList = new ArrayList<>();
		tableList.add(true);
		for (int i = 0; i < target; i ++) {
			tableList.add(false);
		}
		
		for (int i =0; i < target; i++) {
			for (int val : js) {
				if (tableList.get(i) && tableList.size() > i + val) {
					tableList.set(i + val, true);
				}
			}
		}
		return tableList.get(tableList.size() - 1);
	}
}
