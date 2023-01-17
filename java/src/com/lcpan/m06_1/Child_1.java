package com.lcpan.m06_1;

public class Child_1 extends Parent_1{ //有2個屬性，爸爸的field1和自己的field2
	private int field2;
	
	
	public Child_1() {
		
	}
	public Child_1(int field1 , int field2) {
		
		//this.field1 = field1;
		this.field2 = field2;
	}
	
	

	public int getField2() {
		return field2;
	}

	public void setField2(int field2) {
		this.field2 = field2;
	}
	
	public void print() {
		System.out.println(getField1());   // 因為Parent_1 的 field1是private，故可用getField1()取得field1的值
		super.print(); //但是如果Parent_1 中的private 屬性有10個，那就要getfField1、getField2、..getField10，故可用super來解決
		System.out.println(field2);
	}

}
