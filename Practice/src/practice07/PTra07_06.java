package practice07;
/*
 * PTra07_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_06 {
	public static void main(String[] args) {

		// ★ ※2次元配列を用いています
		int[][] array = {
				{500,40,6},
				{70,8,90,1000}
		};
		int sum = 0;
		int num = 0;

		// ★ 配列arrayに格納されている全ての数字の平均を出力してください

		for(int i = 0; i < array.length ; i++) {
			for(int j = 0; j < array[i].length ; j++) {
				sum += array[i][j];
			}
			num += array[i].length;
		}

		double ave = (double) sum / (double) num;
		System.out.println(ave);

	}
}
