package com.lcpan.m07;

public class Employee {
	private int empno;
	private String name;
	private static int count;

	public Employee(int empno, String name) {
		this.empno = empno;
		this.name = name;
		count++; // 老師今天只是要記錄有多少人才會把static值放進Employee這個一般的建構子方法
	}

	public void printData() {
		System.out.print("Empno = " + empno);//放一般的實例變數
		System.out.println(", Name = " + name);//放一般的實例變數
	}

	public static int getCount() {
		return count; //只放static的count
	}
	
	public static void main(String[] args) {
		Employee[] emps = new Employee[3];
		emps[0] = new Employee(111, "Tom");
		emps[1] = new Employee(222, "Mary");
		emps[2] = new Employee(333, "David");
		for (Employee emp : emps)
			emp.printData();
		System.out.println("employee count = " + Employee.getCount()); // 3
	}
}
