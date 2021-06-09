package com.csingh.datastructure.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class FibSeriesWithOutRecursion {
	
	
	public static long getNthFibNumber(long n) {
		Map<Long, Long> map = new HashMap<>();
		map.put(0l, 0l);
		map.put(1l, 1l);
		map.put(2l, 2l);
		for (long i = 0; i <= n; i++) {
			map.put(i, map.get(i - 1) + map.get(i - 2));
		}
		return map.get(n);
	}
	
	public static void main(String[] args) {
		long x = FibSeriesWithRecursion.getNthFibNumber(100);
		System.out.println(x);
	}

}
