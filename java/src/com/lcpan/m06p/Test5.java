package com.lcpan.m06p;

public class Test5 {

	public static void main(String[] args) {
		Point1 p1 = new Point1(10, 10);
		System.out.println(p1);
		System.out.println(p1.toString()); 

		
		Point2 p2 = new Point2(10, 10);//老爸Object繼承而來的，Point2兒子不滿意，要覆寫，在Point2 overriding
		System.out.println(p2);
	}

}
