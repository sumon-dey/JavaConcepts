package com.javaconcepts.collection;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ComparatorDemo2 {

	public static void main(String[] args) {
		TreeMap<String, Double> myTreeMap = new TreeMap<String, Double>(new TComp());
		myTreeMap.put("John Doe", 3224.22);
		myTreeMap.put("Tom Smith", 533.74);
		myTreeMap.put("Jane Baker", 6343.12);
		myTreeMap.put("Tod Hall", 53.2);
		myTreeMap.put("Ralph Smith", -32.3);
		Set<Map.Entry<String, Double>> myTreeMapAsSet=myTreeMap.entrySet();
		for(Map.Entry<String, Double> element:myTreeMapAsSet) {
			System.out.print(element.getKey()+": ");
			System.out.println(element.getValue());
		}
		System.out.println();
	}

}

class TComp implements Comparator<String> {

	@Override
	public int compare(String aStr, String bStr) {
		int i, j, k;
		i = aStr.lastIndexOf(' ');
		j = bStr.lastIndexOf(' ');
		k = aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
		if (k == 0) {
			return aStr.compareToIgnoreCase(bStr);
		} else {
			return k;
		}
	}

}