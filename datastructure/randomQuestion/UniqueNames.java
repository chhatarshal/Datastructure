package com.csingh.datastructure.randomQuestion;

public class UniqueNames {

	
	public static void main(String[] args) {
		 String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
	        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
	        System.out.println(String.join(", ", UniqueNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
	   
	}
	
	public static String[] uniqueNames(String[] names1, String[] names2) {
        StringBuilder sb = new StringBuilder();
        for (String name : names1) {
            sb.append(name).append(",");
        }
        for (String name : names2) {
            if (sb.indexOf(name) < 0) {
                sb.append(name).append(",");
            }
        }
        String finalAnswer = sb.toString();
        return finalAnswer.split("\\,");
        
       // throw new UnsupportedOperationException("Waiting to be implemented.");
    }
}
