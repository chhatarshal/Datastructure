package com.csingh.datastructure.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class CanSumProblem {

	public static boolean canSum(List<Integer> inputList, Integer target) {
		boolean cansum = false;
		if (target == 0) {
			return true;
		}
		if (target < 0) {
			return false;
		}
		for (Integer c:inputList) {
			if (canSum(inputList, target - c)) {
				return true;
			}
		}
		return cansum;
	}
	
	public static void main(String[] args) {
		List<Integer> inputValues = new ArrayList<>();
		inputValues.add(4);
		inputValues.add(7);
		Integer target =10;
		System.out.println(canSum(inputValues, target));
	}
	
}
