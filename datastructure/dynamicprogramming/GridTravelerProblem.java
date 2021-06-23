package com.csingh.datastructure.dynamicprogramming;

public class GridTravelerProblem {

	
	public static int gridTravelProblemSolution(int m, int n) {
		if (m == 1 && n ==1) {
			return 1;
		}
		if (m < 1 || n < 1) {
			return 0;
		}
		
		return gridTravelProblemSolution(m, n - 1) + gridTravelProblemSolution(m - 1, n);
	}
	
	
	public static void main(String[] args) {
		int count = gridTravelProblemSolution(3, 3);
		System.out.println("Total ways : " + count);
	}
}
