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

		Car[] cars = new Car[3];

		cars[0] = new Car();
		cars[0].color = "Red";
		cars[0].gasoline = 30;

		cars[1] = new Car();
		cars[1].color = "Blue";
		cars[1].gasoline = 60;

		cars[2] = new Car();
		cars[2].color = "Yellow";
		cars[2].gasoline = 45;

		final int distance = 300;

		for(int i = 0; i < cars.length; i++) {
			int sum = 0;
			int n = 0;
			while(true) {
				int path = cars[i].run();
				n++;
				if(path == -1) {
					System.out.println(cars[i].color + "の車は目的地に到達できませんでした。");
					break;
				}else if(sum < distance){
					sum += path;
				}else {
					int x = cars[i].gasoline;
					System.out.println(cars[i].color + "の車は目的地にまで" + n + "時間かかりました。残りのガソリンは、" + x + "リットルです");
					break;
				}
			}
		}

	}
}
