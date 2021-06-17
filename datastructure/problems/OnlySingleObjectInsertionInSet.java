package com.csingh.datastructure.problems;

import java.util.HashSet;
import java.util.Set;

public class OnlySingleObjectInsertionInSet {	
	
	
	public static void main(String[] args) {
		Set<Student> studentSet = new HashSet<>();
		Student s1 = new Student();
		Student s2 = new Student();
		studentSet.add(s1);
		studentSet.add(s2);
		System.out.println(studentSet.size());
	}

}

class Student {
	
	public int hashCode() {
		return 0;
	}
	
	public boolean equals(Object obj) {
         return true;
    }
	
	Object ob;
	
	public String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
