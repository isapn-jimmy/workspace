package com.lcpan.m02;

public class Literal {
	public static void main(String[] args) {
		int x = 100;
		System.out.println(x);

		x = 0100;
		System.out.println(x); // 100要8近位

		x = 0x1AF8;
		System.out.println(x); // 16->2
		
	}
}