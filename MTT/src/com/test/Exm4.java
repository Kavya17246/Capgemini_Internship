package com.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Exm4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> a1=new ArrayList<String>();
		ArrayList<String> a2=new ArrayList<String>();
		ArrayList<String> a=new ArrayList<String>();
		System.out.println("enter length of arrayList");
		int n=sc.nextInt(),i;
		System.out.println("enter strings for list1");
		for(i=0;i<n;i++){
			a1.add(sc.next());
		}
		System.out.println("enter strings for list2");
		for(i=0;i<n;i++){
			a2.add(sc.next());
		}
		String s,s1;
		for(i=0;i<a1.size();i++){
			s=a1.get(i);
			if(s.charAt(0)=='a' || s.charAt(0)=='g'){
				a1.remove(i);
				i--;
			}
		}
		for(i=0;i<a2.size();i++){
			s1=a2.get(i);
			if(s1.charAt(s1.length()-1)=='n'|| s1.charAt(s1.length()-1)=='e'){
				a2.remove(i);
				i--;
			}
		}
		a.addAll(a1);
		a.addAll(a2);
		System.out.println(a);
	}

}
