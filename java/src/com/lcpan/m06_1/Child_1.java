package com.lcpan.m06_1;

public class Child_1 extends Parent_1{ //Child_1有2個屬性，爸爸的field1和自己的field2
	private int field2;
	
		
	public Child_1() {
		
	}
	public Child_1(int field1 , int field2) {
		
		super(field1); //從Parent_1 找 field1，注意!!一定要放在第一個 
		//this.field1 = field1; //無法使用，因為Parfent_1把field1設為private, 就算用getField1還是會出現問題，所以用super.print()
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
		super.print(); //但是如果Parent_1 中的private 屬性有10個，那就要getfField1、getField2、..getField10，故可用super來解決，super可以說是overriding Parent_1的field1
		System.out.println(field2);
	}

}
