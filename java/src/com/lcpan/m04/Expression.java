package com.lcpan.m04;

public class Expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1平方一路加到50平方 的值是?
		int sum = 1;
		int a = 1;
		for (int j = 1; j <= 50; j++) {
			for (int i = 1; i <= 50; i++) {
				sum = j * i;
				a=sum*sum;
			}
			
		}
		System.out.println(a);
	}
}
