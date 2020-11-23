package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		
		
		double sum = 0;
		double ever;
		
		double[] group = {n1, n2, n3, n4, n5};
			
		
		for(int i=0; i<group.length; i++) {
			sum = sum + group[i];	
		}
		
		ever = sum/5;
		System.out.println("평균은 " + ever + " 입니다.");
		
		//double group = (n1+n2+n3+n4+n5)/5;
		
		sc.close();

	}

}
