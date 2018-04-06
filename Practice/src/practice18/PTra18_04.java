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
import java.util.Random;
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

		ArrayList<Player> player = new ArrayList<Player>();

        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
                String[] line = scanner.nextLine().split(",");
                Player temp = new Player();
                temp.setPostion(line[0]);
                temp.setName(line[1]);
                temp.setCountry(line[2]);
                temp.setTeam(line[3]);
                player.add(temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

        ArrayList<Player> gk = new ArrayList<Player>();
        ArrayList<Player> df = new ArrayList<Player>();
        ArrayList<Player> mf = new ArrayList<Player>();
        ArrayList<Player> fw = new ArrayList<Player>();

        for(Player players : player) {
        	if(players.getPostion().contains("GK")) {
        		gk.add(players);
        	}else if(players.getPostion().contains("DF")){
        		df.add(players);
        	}else if(players.getPostion().contains("MF")){
        		mf.add(players);
        	}else if(players.getPostion().contains("FW")){
        		fw.add(players);
        	}
        }

        ArrayList<Player> team = new ArrayList<Player>();
        Random random = new Random();

        for(int i = 0; i < 1; i++) {
        	int j = random.nextInt(gk.size());
        	team.add(gk.get(j));
        	gk.remove(j);
        }
        for(int i = 0; i < 4; i++) {
        	int j = random.nextInt(df.size());
        	team.add(df.get(j));
        	df.remove(j);
        }
        for(int i = 0; i < 4; i++) {
        	int j = random.nextInt(mf.size());
        	team.add(mf.get(j));
        	mf.remove(j);
        }
        for(int i = 0; i < 2; i++) {
        	int j = random.nextInt(fw.size());
        	team.add(fw.get(j));
        	fw.remove(j);
        }

        for(Player teamMember : team) {
        	System.out.println(teamMember.toString());
        }

	}
}
