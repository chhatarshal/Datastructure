package com.csingh.datastructure.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class GridTravelerProblem {

	
	public static int gridTravelProblemSolution(int m, int n) {
		Map<String, Integer> memo = new HashMap<>();
		return helper(m, n, memo);
	}
	
	public static int helper(int m, int n, Map<String, Integer> memo) {
		Integer memoResult = memo.get(m + "#" + n);
		if (memoResult != null) {
			return memoResult;
		}
		if (m == 1 && n ==1) {
			memo.put(m + "#" + n, 1);
			return 1;
		}
		if (m < 1 || n < 1) {
			memo.put(m + "#" + n, 0);
			return 0;
		}		
		int result = helper(m, n - 1, memo) + helper(m - 1, n, memo);
		memo.put(m + "#" + n, result);
		return result;
	}
	
	
	public static void main(String[] args) {
		int count = gridTravelProblemSolution(31, 31);
		System.out.println("Total ways : " + count);
	}
}
