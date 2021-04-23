package com.test;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Map.Entry;

public class Exm2 {
	public static void getKeys(LinkedHashMap<String,String> h,String s){
		Iterator<Entry<String,String>> i1=h.entrySet().iterator();
		while(i1.hasNext()){
			Entry<String,String> e=i1.next();
			if(e.getValue().equals(s)){
				System.out.printf("{%s}",e.getKey());
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string length");
		int n=sc.nextInt(),i;
		String[] keys=new String[n];
		String[] va=new String[n];
		System.out.println("Enter keys to store in hashmap");
		for(i=0;i<n;i++){
			keys[i]=sc.next();
		}
		System.out.println("Enter values to store in hashmap");
		for(i=0;i<n;i++){
			va[i]=sc.next();
		}
		LinkedHashMap<String,String> hm=new LinkedHashMap<String,String>();
		for(i=0;i<n;i++){
			hm.put(keys[i], va[i]);
		}
		System.out.println("Enter value to find theirs keys");
		String in=sc.next();
		getKeys(hm,in);

	}

}
