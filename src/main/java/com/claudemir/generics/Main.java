package com.claudemir.generics;

import java.io.Serializable;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even",4);
		Pair<String, Integer> p2 = new OrderedPair<String, Integer>("Even",4);
		
		if(Util.<String, Integer>compare(p1, p2)) {
			System.out.println("iguais");
		}
		
		/*
		 * System.out.println("chave :"+p1.getKey());
		 * System.out.println("valor :"+p1.getValue());
		 */
		
		//inferência
		Serializable a = Util.pick(new String(), new ArrayList<String>());
		java.util.ArrayList<Box<Integer>> listOfIntegerBoxes =
			      new java.util.ArrayList<>();
			    Util.<Integer>addBox(Integer.valueOf(10), listOfIntegerBoxes);
			    Util.addBox(Integer.valueOf(20), listOfIntegerBoxes);
			    Util.addBox(Integer.valueOf(30), listOfIntegerBoxes);
			    Util.outputBoxes(listOfIntegerBoxes);
		
		
		
	}

}
