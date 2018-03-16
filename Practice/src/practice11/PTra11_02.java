package practice11;
/*
 * PTra11_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra11_02 {
	public static void main(String[] args) {

		// ★ ReadFileClassのクラスメソッドreadBookDataFile()を使い、本情報を取得します

		Book[] bookInfo = FileReaderClass.readBookDataFile();

		System.out.println("探したい本のタイトル（又はその一部）を入力してください");

		// ★ ユーザが入力した文字列が、本情報のタイトル一部に含まれていた場合は、その本情報を出力してください

		String title = new java.util.Scanner(System.in).next();
		int n = 0;

		for(int i = 0; i < bookInfo.length; i++) {
			if(bookInfo[i].title.indexOf(title) != -1) {
				System.out.println(bookInfo[i].dispBookInfo());
				n++;
			}
		}

		if(n == 0) {
			System.out.println("お探しの本は見つかりませんでした");
		}
	}
}
