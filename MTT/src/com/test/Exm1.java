package com.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exm1 {
	public static HashMap<String,String> getConvert(String[] s,int n){
		HashMap<String,String> lh=new HashMap<String,String>();
		for(int i=0;i<n;i++){
			String temp=s[i].substring(0, 3).toUpperCase();
			lh.put(temp, s[i]);
		}
		return lh;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of string array: ");
		int n=sc.nextInt(),i;
		String[] str=new String[n];
		System.out.println("Enter array of strings");
		for(i=0;i<n;i++){
			str[i]=sc.next();
		}
		Map<String,String> lh=getConvert(str,n);
		Iterator<Entry<String,String>> i1=lh.entrySet().iterator();
		while(i1.hasNext()){
			Entry<String,String> e=i1.next();
			System.out.printf("{%s,%s}",e.getKey(),e.getValue());
		}

	}

}
