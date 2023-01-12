package com.lcpan.m04;

public class ThreeDimArray {
	public static void main(String[] args) {
		int sum = 0;
		int[][][] arr ={ { { 2, 6, 1 }, { 4, 3, 5 } },
							    { { 2, 6, 1 }, { 4, 3, 5 } },
							    { { 2, 6, 1 }, { 4, 3, 5 } }
		};
		for (int i = 0; i < arr.length; i++)    //layer
			for (int j = 0; j < arr[i].length; j++)  //row 
				for (int z = 0; z < arr[i][j].length; z++)  // column , z < 3 , 
					sum += arr[i][j][z];
		System.out.println("sum = " + sum);
	}
}
