package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exm9 {
	public static void getIthElement(ArrayList<String> a,int n){
		Collections.reverse(a);
		Collections.sort(a);
		System.out.println(a.get(n-1));
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> a1=new ArrayList<String>();
		System.out.println("enter length of arrayList");
		int n=sc.nextInt(),i;
		System.out.println("enter colours name");
		for(i=0;i<n;i++){
			a1.add(sc.next());
		}
		System.out.println("enter index number to get value in list");
		int choice=sc.nextInt();
		getIthElement(a1,choice);
	}

}
