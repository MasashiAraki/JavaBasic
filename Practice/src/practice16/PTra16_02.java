/*
 * PTra16_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;

public class PTra16_02 {
	public static void main(String[] args) {

		boolean b = true;
		byte by = 100;
		short s = 300;
		char c = '日';
		int i = 1000;
		long l = 2000L;
		float f = 3.14F;
		double d = 453.592;

		// ★ 上記基本型を、それぞれのラッパークラスに代入してください

		Boolean b2 = b;
		Byte by2 = by;
		Short s2 = s;
		Character c2 = c;
		Integer i2 = i;
		Long l2 = l;
		Float f2 = f;
		Double d2 = d;

//		出力
		System.out.println(b2);
		System.out.println(by2);
		System.out.println(s2);
		System.out.println(c2);
		System.out.println(i2);
		System.out.println(l2);
		System.out.println(f2);
		System.out.println(d2);

	}
}
