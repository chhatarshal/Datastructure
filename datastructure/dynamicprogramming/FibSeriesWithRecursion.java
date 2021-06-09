package com.csingh.datastructure.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class FibSeriesWithRecursion {
	
	
	public static long getNthFibNumber(long n) {
		Map<Long, Long> map = new HashMap<>();
		return getNthFibNumberWithMemo(n, map);		
	}
	
	public static long getNthFibNumberWithMemo(long n, Map<Long,  Long> map) {
		if (map.containsKey(n)) {
			return map.get(n);
		}
		if (n < 2) {
			map.put(n, n);
			return n;
		}		
		long val = getNthFibNumberWithMemo(n - 1, map) + getNthFibNumberWithMemo(n - 2, map);
		map.put(n, val);
		return val;
	}
	
	public static void main(String[] args) {
		long x = FibSeriesWithRecursion.getNthFibNumber(100);
		System.out.println(x);
	}

}
