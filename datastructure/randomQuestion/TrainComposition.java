package com.csingh.datastructure.randomQuestion;

import java.util.LinkedList;
// https://www.testdome.com/d/java-interview-questions/4

/*A TrainComposition is built by attaching and detaching wagons from the left and the right sides, efficiently with respect to time used.

For example, if we start by attaching wagon 7 from the left followed by attaching wagon 13, again from the left, we get a composition of two wagons (13 and 7 from left to right). Now the first wagon that can be detached from the right is 7 and the first that can be detached from the left is 13.

Implement a TrainComposition that models this problem.*/

public class TrainComposition {
	
	private LinkedList<Integer> train = new LinkedList<>();
    public void attachWagonFromLeft(int wagonId) {
    	train.add(0, wagonId);
    	System.out.println(train);
    }

    public void attachWagonFromRight(int wagonId) {
    	train.add(wagonId);
    	System.out.println(train);
    }

    public int detachWagonFromLeft() {
     return train.remove(0);
    }

    public int detachWagonFromRight() {
    	 return train.remove(train.size() - 1);
    }

    public static void main(String[] args) {
        TrainComposition train = new TrainComposition();
        train.attachWagonFromLeft(7);
        train.attachWagonFromLeft(13);
        System.out.println(train.detachWagonFromRight()); // 7 
        System.out.println(train.detachWagonFromLeft()); // 13
    }
}