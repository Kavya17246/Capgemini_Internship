package com.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Exm3 {
	public static void getlist(ArrayList<Integer> l1,ArrayList<Integer> l2){
		int i,a;
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(i=0;i<l1.size();i++){
			a=l1.get(i);
			//System.out.println(a);
			if(l2.contains(a)){
				//System.out.println(a);
				l1.remove(l1.indexOf(a));
				l2.remove(l2.indexOf(a));
				i--;
			}
		}
		l.addAll(l1);
		l.addAll(l2);
		System.out.println(l);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> a1=new ArrayList<Integer>();
		ArrayList<Integer> a2=new ArrayList<Integer>();
		System.out.println("enter length of array");
		int n=sc.nextInt(),i;
		System.out.println("enter array numbers for list1");
		for(i=0;i<n;i++){
			a1.add(sc.nextInt());
		}
		System.out.println("enter array numbers for list2");
		for(i=0;i<n;i++){
			a2.add(sc.nextInt());
		}
		getlist(a1,a2);

	}

}
