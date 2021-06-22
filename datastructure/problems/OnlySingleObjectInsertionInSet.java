package com.csingh.datastructure.problems;

import java.util.HashSet;
import java.util.Set;

public class OnlySingleObjectInsertionInSet {	
	
	
	public static void main(String[] args) {
		Set<Student> studentSet = new HashSet<>();
		Student s1 = new Student("11");
		Student s2 = new Student("232");
		Student s3 = new Student("323");
		studentSet.add(s1);
		studentSet.add(s2);
		studentSet.add(s3);
		System.out.println(studentSet.size());
	}

}

class Student {
	
	Student() {
		
	}
	
Student(String id) {
		this.id = id;
	}
	
	public int hashCode() {
		return 0;
	}
	
	public boolean equals(Object obj) {
         return true;
    }
	
	public String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
