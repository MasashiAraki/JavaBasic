/*
 * PTra18_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_02 {

	/*
	 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
	 *
	 * フィールド
	 * 		position	：	String
	 * 		name		：	String
	 * 		country		：	String
	 * 		team		：	String
	 * メソッド
	 * 		各アクセサ
	 *
	 * 		toString()	：	Objectクラスのオーバーライド
	 * 		各フィールドの値を、カンマ区切りの文字列で取得する
	 */

	public static void main(String[] args) {

		/*
		 * entity.Playerの作成後に行ってください
		 *
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

//		ArrayList作成
        ArrayList<Player> array = new ArrayList<>();
//      BestElevenCandidate.csvをスキャン
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
//        	hasNextで次にデータがあるか確認
            while (scanner.hasNext()) {
//            	nextLineで次の要素へ移動し、変数lineに代入
                String line = scanner.nextLine();
                // ★ 1行ごとにArrayListに格納してください
//              カンマで区切る
                String[] str = line.split(",");
                Player player = new Player();
                player.setPostion(str[0]);
                player.setName(str[1]);
                player.setCountry(str[2]);
                player.setTeam(str[3]);
//				arrayListに代入
                array.add(player);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

		// ★ ArrayListに格納されているインスタンス全てのtoStringメソッドを実行し、出力してください
		// ※ できれば拡張for文を使いましょう
        for(Player player : array) {
        	System.out.println(player.toString());
        }
	}
}
