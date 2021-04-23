package com.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Exm7 {

	public static void main(String[] args) {
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		hm.put(1,60);
		hm.put(4, 30);
		hm.put(6,55);
		hm.put(89, 40);
		hm.put(2,75);
		float avg=0;
		int count=0;
		Iterator<Entry<Integer, Integer>> i=hm.entrySet().iterator();
		while(i.hasNext()){
			Entry<Integer, Integer> e=i.next();
			if(e.getKey()%2!=0){
				avg+=e.getValue();
				count++;
			}
		}avg=avg/count;
		System.out.println(avg);
	}

}
