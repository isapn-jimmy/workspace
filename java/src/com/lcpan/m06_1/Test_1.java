package com.lcpan.m06_1;

public class Test_1 {
	public static void main (String[]  args) {
		
		Parent_1 p =new Parent_1(); //要在Parent_1裡創建一個Parent_1 p() 的預設建構子，因為我們有自己創建一個p1的建構子，java不會幫忙再創建
		p.setField1(10); //弄set存值
		p.print();
		
		Parent_1 p1 = new Parent_1(20); //用建構子給值
		p1.print();
		
		
		Child_1 c = new Child_1();
		c.setField1(11); //2個11，因為第一個是用get的方法，另一個是用super的方法
		c.setField2(22); 
		c.print();
		
		
		
		Child_1 c1 = new Child_1(100 , 200);
		c1.print();
		
		
		
	}
	

}
