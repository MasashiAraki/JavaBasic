/*
 * PTra18_03.java
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

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
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

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
        for(int i = array.size() - 1; i >= 0; i --) {
        	if(array.get(i).getTeam().equals("レアル・マドリード") || array.get(i).getTeam().equals("バルセロナ")) {
        		array.remove(i);
        	}

        }

		// ★ 削除後のArrayListの中身を全件出力してください
        for(Player player : array) {
        	System.out.println(player.toString());
        }


	}
}
