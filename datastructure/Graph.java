package com.csingh.datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
	
	private Integer graphLength;
	private Map<Integer, List<Integer>> graphStructure;
	public Graph() {
		this.graphLength = 0;
		this.graphStructure =  new HashMap<>();
	}
	
	public String addVertix(Integer vertix) {
		List<Integer> vertixVal= new ArrayList<Integer>();		 
		this.graphStructure.put(vertix, vertixVal);
		this.graphLength = graphLength + 1;
		return "Success";
	}
	
	public String addEdge(Integer vertix1, Integer vertix2) {
		if ((this.graphLength) < 1) {
			System.out.println("Not a Graph");
			return "Not a Graph";
		}
		this.graphStructure.get(vertix1).add(vertix2);
		this.graphStructure.get(vertix2).add(vertix1);
		return "Success";
	}
	
	public String printGraph() {
		StringBuilder stringBuilder = new StringBuilder();
		for (Map.Entry<Integer, List<Integer>> connections : graphStructure.entrySet()) {
			stringBuilder.append(connections.getKey()).append("======>")
			.append(connections.getValue()).append("\n");
		}
		System.out.println(stringBuilder.toString());
		return "Success";
	}

}
