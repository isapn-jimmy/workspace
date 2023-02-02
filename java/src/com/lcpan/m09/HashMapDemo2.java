package com.lcpan.m09;

import java.util.*;

public class HashMapDemo2 {
	public static void main(String[] args) {
		Map<String,String> tel = new HashMap<>();//沒有特定順序,不會重複
		tel.put("John", "0939111111");
		tel.put("Mary", "0935222222");
		tel.put("Jean", "0931333333");
		for (String key : tel.keySet())//將所有的key值全部抓進去
			System.out.println(tel.get(key));
		//再用get將值取出來,get(key)是會得到value
		//也就是09111111、0931333333、0935222222

		for (String val : tel.values())//將所有的value值全部抓進去
			System.out.println(val);//再print出來
							        //不可以用get(val)因為會回傳Object值
									//所有的值會變成初始值null
	}
}
