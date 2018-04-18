/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

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
		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
        Collections.shuffle(array);

        int GK = 0, DF = 0, MF = 0, FW = 0;
        for(Player player : array) {
        	if(player.getPostion().equals("GK")) {
        		if(GK < 1) {
        			System.out.println(player.toString());
            		GK ++;
        		}
        	}

        	if(player.getPostion().equals("DF")) {
        		if(DF < 4) {
        			System.out.println(player.toString());
            		DF ++;
        		}
        	}

        	if(player.getPostion().equals("MF")) {
        		if(MF < 4) {
        			System.out.println(player.toString());
            		MF ++;
        		}
        	}

        	if(player.getPostion().equals("FW")) {
        		if(FW < 2) {
        			System.out.println(player.toString());
            		FW ++;
        		}
        	}
        }


	}
}
