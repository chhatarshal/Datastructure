package com.csingh.datastructure.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class howSumTabular {

	public static List<Integer> howSum(int target, int arr[]) {
		List<List<Integer>> holder = new ArrayList<>();

		holder.add(new ArrayList<Integer>());
		for (int i = 1; i <= target; i++) {
			holder.add(null);
		}
		for (int i = 0; i < target; i++) {
			if (holder.get(i) != null) {
				for (Integer val : arr) {
					int newloc = i + val;
					try {
						List<Integer> v = holder.get(newloc);
						if (v == null) {
							v = new ArrayList<>();
						}
						v.add(val);
						holder.set(newloc, v);
					} catch (Exception e) {

					}
				}
			}
		}
		return holder.get(target);
	}

	public static void main(String[] args) {

		int target = 35;
		int arr[] = new int[] { 20, 10, 5 };

		System.out.println(howSum(target, arr));

	}

}
