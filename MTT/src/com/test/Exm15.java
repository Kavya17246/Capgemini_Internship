package com.test;

import java.util.Scanner;

public class Exm15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int sum=0;
		while(n!=0){
			sum+=(n%10)*(n%10);
			n=n/10;
		}
		System.out.println(sum);
	}

}
