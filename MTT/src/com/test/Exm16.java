package com.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exm16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String vowels= "aeiouAEIOU";
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		Set ss=new HashSet();
		int i;
		for(i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(vowels.indexOf(c)!=-1){
				ss.add(c);
			}
		}
		if(s.equals(sb.toString()) && ss.size()>=2){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
	}

}
