package com.lcpan.m04;

public class Factor {
	
	static void factor (int x ) {
		int i = x ; 
		int j =1 ;
		while (i > 0) {
			
			j *= i --;
			System.out.println("階層值是: " +j);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factor(4);
	}

}
