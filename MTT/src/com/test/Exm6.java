package com.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Exm6 {

	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("abc",60);
		hm.put("xyz", 30);
		hm.put("uvw",55);
		hm.put("xyz1", 40);
		hm.put("uvw2",75);
		HashMap<String,String> hm1=new HashMap<String,String>();
		Iterator<Entry<String,Integer>> i=hm.entrySet().iterator();
		while(i.hasNext()){
			Entry<String,Integer> e=i.next();
			if(e.getValue() >=60){
				hm1.put(e.getKey(), "Pass");
			}else{
				hm1.put(e.getKey(), "Fail");
			}
		}
		System.out.println(hm1);
	}

}
