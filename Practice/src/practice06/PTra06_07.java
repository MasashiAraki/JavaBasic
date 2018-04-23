package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */
		for(int i = 0; i < 5; i ++) {
			for(int j = 0; j < i; j ++) {
				System.out.print("■");
			}
			for(int n = i; n < 5; n ++) {
				System.out.print("□");
			}
			System.out.println("");
		}

		for(int i = 5; i > 0; i --) {
			for(int j = 0; j < i; j ++) {
				System.out.print("■");
			}
			for(int n = i; n < 5; n ++) {
				System.out.print("□");
			}
			System.out.println("");
		}


	}
}
