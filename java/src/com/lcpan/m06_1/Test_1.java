package com.lcpan.m06_1;

public class Test_1 {
	public static void main (String[]  args) {
		
		Parent_1 p =new Parent_1(); //要在Parent_1裡創建一個Parent_1 p() 的預設建構子，因為我們有自己創建一個p1的建構子，java不會幫忙再創建
		p.setField1(10); //弄set存值
		p.print();
		
		Parent_1 p1 = new Parent_1(20);
		p1.print();
		
		
		Child_1 c = new Child_1();
		c.setField1(11);
		c.setField2(22); 
		c.print();
		
		
		
	}
	

}
