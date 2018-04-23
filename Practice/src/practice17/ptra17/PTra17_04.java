/*
 * PTra17_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice17.ptra17;

public class PTra17_04 {
	public static void main(String[] args) {

		String str = "スッキリわかるJava入門";

		/*
		 * ★ strに入っている文字列を1文字ずつゆっくり表示させるプログラムを完成させてください
//		 * ※ Thread.sleep を使用すること
		 */

		char[] array = str.toCharArray();

		for(char ch : array) {
			System.out.print(ch);
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// エラー発生時に出力
				System.out.println("エラーです");

			}
		}
	}
}
