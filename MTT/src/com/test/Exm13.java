package com.test;

import java.util.Scanner;

public class Exm13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt(),i,sum=0;
		for(i=n1;i<=n2;i++){
			String s=Integer.toString(i);
			StringBuffer sb=new StringBuffer(s);
			sb.reverse();
			if(s.equals(sb.toString())){
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
