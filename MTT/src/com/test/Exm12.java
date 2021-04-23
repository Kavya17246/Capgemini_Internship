package com.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Exm12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> a1=new ArrayList<String>();
		System.out.println("enter length of arrayList");
		int n=sc.nextInt(),i;
		System.out.println("enter strings for list1");
		for(i=0;i<n;i++){
			a1.add(sc.next());
		}
		 int sum=0,max=-1;
		String s[],name="";
		for(i=0;i<n;i++){
			sum=0;
			s=a1.get(i).split("\\#");
			for(int j=1;j<3;j++){
				sum+=Integer.parseInt(s[j]);
			}
			if(max<sum){
				max=sum;
				name=s[i];
			}
		}
		System.out.println(name);
	}

}
