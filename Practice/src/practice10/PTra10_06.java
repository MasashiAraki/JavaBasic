package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

//		sum 戻り値の合計
//		count runメソッドの繰り返し数

		// 目的地までの距離
		final int distance = 300;


		Car car1 = new Car();
		car1.color = "Red";
		car1.gasoline = 50;


		Car car2 = new Car();
		car2.color = "blue";
		car2.gasoline = 60;

		Car car3 = new Car();
		car3.color = "Green";
		car3.gasoline = 70;


		Car[] cars = new Car[3];

		// 配列に代入
		cars[0] = car1;
		cars[1] = car2;
		cars[2] = car3;

		for(Car car : cars) {

			int sum = 0, count = 0;

			while(true) {
				int run = car.run();

				if(run == -1) {
					break;
				}

				sum += run;
				count ++;

				if(sum >= distance) {
					break;
				}
			}

			if(car.gasoline != -1) {
				System.out.println("目的地まで" + count + "時間かかりました。残りのガソリンは、"
						+ car.gasoline + "リットルです" );
			}
		}
	}
}
