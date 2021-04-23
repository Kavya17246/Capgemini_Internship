package com.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Exm10 {
	public static void getCommonSum(ArrayList<Integer> a1,ArrayList<Integer> a2){
		a1.retainAll(a2);
		int i,sum=0;
		for(i=0;i<a1.size();i++){
			sum+=a1.get(i);
		}
		System.out.println(sum);
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
		getCommonSum(a1,a2);

	}

}
