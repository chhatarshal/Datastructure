package com.csingh.datastructure.dynamicprogramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class CanSumProblem {
	
	public static List<Integer> output = new LinkedList<>();

	public static boolean canSum(List<Integer> inputList, Integer target) {
		Map<Integer, Boolean> memo = new HashMap<>();
		return canSumHelper(inputList, target, memo);
	}
	
	public static boolean canSumHelper(List<Integer> inputList, Integer target, Map<Integer, Boolean> memo ) {
		boolean memoValue = Optional.ofNullable(memo.get(target)).orElse(false);
		if (memoValue) {
			return memoValue;
		}
		if (target == 0) {
			memo.put(target, true);
			return true;
		}
		if (target < 0) {
			memo.put(target, false);
			return false;
		}
		for (Integer c:inputList) {			
			if (canSumHelper(inputList, target - c, memo)) {
				memo.put(target, true);
				output.add(c);
				return true;
			} else {
				memo.put(target, false);
			}
		}
     return	Optional.of(memo.get(target)).orElse(false);
	}
	
	public static void main(String[] args) {
		output.clear();
		List<Integer> inputValues = new ArrayList<>();
		inputValues.add(2);
		inputValues.add(3);
		Integer target = 6;
		System.out.println(canSum(inputValues, target));
		System.out.println(output);
	}
	
}
