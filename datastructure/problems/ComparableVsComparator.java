package com.csingh.datastructure.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableVsComparator {
	
	static class Student implements Comparable<Student> {
		Integer rollNo;
		String name;
		
		Student() {
			
		}		
		Student(Integer rollNo, String name) {
			this.rollNo = rollNo;
			this.name = name;
		}
		public Integer getRollNo() {
			return rollNo;
		}
		public void setRollNo(Integer rollNo) {
			this.rollNo = rollNo;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public int compareTo(Student o) {
			if (this.rollNo > o.rollNo) {
				return 1;
			} else if (this.rollNo < o.rollNo) {
				return -1;
			}
			return 0;
		}		
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(1002, "C");
		Student s2 = new Student(1000, "A");
		Student s3 = new Student(1003, "D");
		Student s4 = new Student(1001, "B");
		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.stream().map(student -> student.name).forEach(System.out::println);
		Collections.sort(students);
		System.out.println("After sorting.....");
		students.stream().map(student -> student.name).forEach(System.out::println);
		System.out.println("Comparator Example Now: ");
		Item itm1 = new Item(1, 1, 1);
		Item itm2 = new Item(1, 2, 1);
		Item itm3 = new Item(2, 1, 2);
		
		List<Item> itms = new ArrayList<>();
		itms.add(itm1);
		itms.add(itm2);
		itms.add(itm3);
		itms.stream().map(itm -> itm.length).forEach(System.out::println);
		ItemSortingHelper itemSortingHelper = new ItemSortingHelper();
		Collections.sort(itms, itemSortingHelper);
		System.out.println("After sorting.....");
		itms.stream().map(itm -> itm.length).forEach(System.out::println);
	}
	
	
	static class Item {		
		Integer length;
		Integer height;
		Integer count;		
		Item(){			
		}
		
		Item(Integer length, Integer height, Integer count) {
			this.length = length;
			this.height = height;
			this.count = count;
		}		
	}
	
	static class ItemSortingHelper implements Comparator<Item> {

		@Override
		public int compare(Item o1, Item o2) {
			if (o1.height > o2.height && o1.count > o2.count) {
				return 1;
			}
			if (o1.height > o2.height && o1.length > o2.length) {
				return 1;
			}
			if (o1.height == o2.height && o1.length == o2.length) {
				return 0;
			}
			return -1;
		}
		
	}
	

}
