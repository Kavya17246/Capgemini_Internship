package com.test;

import java.util.Scanner;

public class Exm5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String[] words=s.split("\\*");
		if(words.length<2){
			System.out.println(false);
		}else{
			if(words[0].equals(words[1])){
				System.out.println("Equal");
			}else{
				System.out.println("Not Equal");
			}
		}

	}

}
