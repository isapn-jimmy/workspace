package com.lcpan.m04;

public class Star_1 {
	public static void main(String[] args) {

		int i=0;
		for (int j = 1; j <=5 ; j++) {

			for ( i = 5; i >= j ; i--) {
				System.out.print("*");
			}
			System.out.print(" \n");
		}

	}
}