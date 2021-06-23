package com.csingh.datastructure.dynamicprogramming;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class GridTravelerProblem {

	
	public static BigInteger gridTravelProblemSolution(int m, int n) {
		Map<String, BigInteger> memo = new HashMap<>();
		return helper(m, n, memo);
	}
	
	public static BigInteger helper(int m, int n, Map<String, BigInteger> memo) {
		BigInteger memoResult = memo.get(m + "#" + n);
		if (memoResult != null) {
			return memoResult;
		}
		if (m == 1 && n ==1) {
			memo.put(m + "#" + n, BigInteger.ONE);
			return BigInteger.ONE;
		}
		if (m < 1 || n < 1) {
			memo.put(m + "#" + n, BigInteger.ZERO);
			return BigInteger.ZERO;
		}		
		BigInteger result = helper(m, n - 1, memo).add(helper(m - 1, n, memo));
		memo.put(m + "#" + n, result);
		return result;
	}
	
	
	public static void main(String[] args) {
		BigInteger count = gridTravelProblemSolution(31, 31);
		System.out.println("Total ways : " + count);
	}
}
