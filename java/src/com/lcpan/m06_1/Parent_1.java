package com.lcpan.m06_1;

public class Parent_1 {
		
	private int field1;
	
	public Parent_1(){ //預設建構子
		
	}
	
	public Parent_1(int field1){//建構子有傳參數值
		
		this.field1 = field1;
		
	}
	

	public int getField1() {
		return field1;
	}

	public void setField1(int field1) {
		this.field1 = field1;
	}
	
	public void print() {
		
		System.out.println(field1);
	}
	
}
