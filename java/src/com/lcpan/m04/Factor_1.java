package com.lcpan.m04;

public class Factor_1 {

	static int factorial(int num) {
		int result = 1;
		for (int i = num; i >= 1; i--) {

			result *= i;
			
		}
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
	}

}
