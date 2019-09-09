package kingdom;
import java.util.Random;

class EquipInformation{
	String name;
	int power;
}

public class Drop {
	EquipInformation[][] eq = new EquipInformation[100][100];
	Random rand = new Random();
	int randInt = 0;
	
	//dropアイテムの名前とステータスを書き込む、要素を追加する場合はランダムで生成する数字の範囲を広げる。
	void EquipDate(){
		//要素数を増やす場合は、ここのランダムの生成範囲と、for文の条件を拡張すること。
		randInt = rand.nextInt(8);
		//二次元配列の要素を初期化する
		for(int i=0;i<100;i++){
			for(int j =0;j<100;j++){
				eq[i][j] = new EquipInformation();
				}
			}
		//rank0のドロップアイテムに関する宣言
		eq[0][0].name ="スライムの塊";
		eq[0][0].power = 15;
		eq[0][1].name ="濃縮還元スライム";
		eq[0][1].power = 12;
		eq[0][2].name ="スライムの粉末";
		eq[0][2].power = 13;
		eq[0][3].name ="ブーメラン";
		eq[0][3].power = 14;
		eq[0][4].name ="固形スライム";
		eq[0][4].power = 10;
		eq[0][5].name ="スライムコア";
		eq[0][5].power = 12;
		eq[0][6].name ="スライムペット";
		eq[0][6].power = 21;
		eq[0][7].name ="皮の帽子";
		eq[0][7].power = 8;
		
		//rank1のドロップアイテムに関する宣言
		eq[1][0].name ="盗賊の小刀";
		eq[1][0].power = 30;
		eq[1][1].name ="盗賊の七つ道具";
		eq[1][1].power = 24;
		eq[1][2].name ="爆弾";
		eq[1][2].power = 33;
		eq[1][3].name ="はがねのブーメラン";
		eq[1][3].power = 28;
		eq[1][4].name ="なめし革の鎧";
		eq[1][4].power = 20;
		eq[1][5].name ="鉄の小手";
		eq[1][5].power = 24;
		eq[1][6].name ="粉塵ゴーグル";
		eq[1][6].power = 16;
		eq[1][7].name ="盗賊の滋養強壮薬";
		eq[1][7].power = 16;
		
		//rank2のドロップアイテムに関する宣言
		eq[2][0].name ="熊毛の鎧";
		eq[2][0].power = 45;
		eq[2][1].name ="熊の蹄";
		eq[2][1].power = 46;
		eq[2][2].name ="熊毛の帽子";
		eq[2][2].power = 41;
		eq[2][3].name ="熊のキバ";
		eq[2][3].power = 52;
		eq[2][4].name ="子熊ペット";
		eq[2][4].power = 62;
		eq[2][5].name ="熊ペット";
		eq[2][5].power = 71;
		eq[2][6].name ="熊毛の手袋";
		eq[2][6].power = 43;
		eq[2][7].name ="熊骨の刀";
		eq[2][7].power = 62;
		
		//rank3のドロップアイテムに関する宣言
		eq[3][0].name ="犬ぞり";
		eq[3][0].power = 85;
		eq[3][1].name ="濃縮還元ゾンビ肉";
		eq[3][1].power = 81;
		eq[3][2].name ="ゾンビ犬ペット";
		eq[3][2].power = 95;
		eq[3][3].name ="汚染された鉄甲";
		eq[3][3].power = 85;
		eq[3][4].name ="汚染された鋼の剣";
		eq[3][4].power = 91;
		eq[3][5].name ="汚染された鋼兜";
		eq[3][5].power = 83;
		eq[3][6].name ="臭い毛皮服";
		eq[3][6].power = 78;
		eq[3][7].name ="ヘドロ";
		eq[3][7].power = 82;
		
		//rank4のドロップアイテムに関する宣言
		eq[4][0].name ="禍々しい何かの手？";
		eq[4][0].power = 106;
		eq[4][1].name ="禍々しい何かの足？";
		eq[4][1].power = 114;
		eq[4][2].name ="禍々しい何かの頭？";
		eq[4][2].power = 122;
		eq[4][3].name ="禍々しい何かの体？";
		eq[4][3].power = 117;
		eq[4][4].name ="禍々しい何かの何か";
		eq[4][4].power = 92;
		eq[4][5].name ="禍々しい何かの目";
		eq[4][5].power = 126;
		eq[4][6].name ="禍々しい何かの耳";
		eq[4][6].power = 113;
		eq[4][7].name ="禍々しい何かペット";
		eq[4][7].power = 134;
		
		//rank5のドロップアイテムに関する宣言
		eq[5][0].name ="魔王の剣";
		eq[5][0].power = 248;
		eq[5][1].name ="魔王の杖";
		eq[5][1].power = 267;
		eq[5][2].name ="魔王の地位";
		eq[5][2].power = 952;
		eq[5][3].name ="魔王の椅子";
		eq[5][3].power = 334;
		eq[5][4].name ="魔王城";
		eq[5][4].power = 644;
		eq[5][5].name ="魔王の血";
		eq[5][5].power = 364;
		eq[5][6].name ="魔王の魂";
		eq[5][6].power = 324;
		eq[5][7].name ="魔王ペット";
		eq[5][7].power = 363;
		
		//rank6のドロップアイテムに関する宣言
		eq[6][0].name ="異次元の欠片";
		eq[6][0].power = 500;
		eq[6][1].name ="異次元スライムペット";
		eq[6][1].power = 500;
		eq[6][2].name ="異次元ゲル";
		eq[6][2].power = 500;
		eq[6][3].name ="異次元濃縮還元スライム";
		eq[6][3].power = 500;
		eq[6][4].name ="異次元スライムのコア";
		eq[6][4].power = 500;
		eq[6][5].name ="異次元ポケット";
		eq[6][5].power = 500;
		eq[6][6].name ="異次元ベクトル";
		eq[6][6].power = 500;
		eq[6][7].name ="異次元チケット";
		eq[6][7].power = 500;
		
		//rank7のドロップアイテムに関する宣言
		eq[7][0].name ="使徒の刀";
		eq[7][0].power = 800;
		eq[7][1].name ="異次元の鉱石";
		eq[7][1].power = 800;
		eq[7][2].name ="使徒ペット";
		eq[7][2].power = 800;
		eq[7][3].name ="使徒の欠片";
		eq[7][3].power = 800;
		eq[7][4].name ="使徒の右腕";
		eq[7][4].power = 800;
		eq[7][5].name ="使徒のお面";
		eq[7][5].power = 800;
		eq[7][6].name ="異次元の壁盾";
		eq[7][6].power = 800;
		eq[7][7].name ="異次元の案内状";
		eq[7][7].power = 800;
		
		//rank8のドロップアイテムに関する宣言
		eq[8][0].name ="異世界の鍵";
		eq[8][0].power = 1200;
		eq[8][1].name ="異世界マップ";
		eq[8][1].power = 1200;
		eq[8][2].name ="異世界の飲み薬";
		eq[8][2].power = 1200;
		eq[8][3].name ="異世界の案内人";
		eq[8][3].power = 1200;
		eq[8][4].name ="異世界の見取り図";
		eq[8][4].power = 1200;
		eq[8][5].name ="異世界のお酒";
		eq[8][5].power = 1200;
		eq[8][6].name ="異世界の指南書";
		eq[8][6].power = 1200;
		eq[8][7].name ="観光パンフレット";
		eq[8][7].power = 1200;
		
		//rank9のドロップアイテムに関する宣言
		eq[9][0].name ="異世界神の手紙";
		eq[9][0].power = 2000;
		eq[9][1].name ="寝返った使い";
		eq[9][1].power = 2000;
		eq[9][2].name ="異世界神殿の見取り図";
		eq[9][2].power = 2000;
		eq[9][3].name ="異世界の馬車";
		eq[9][3].power = 2000;
		eq[9][4].name ="異世界神殿への通行証";
		eq[9][4].power = 2000;
		eq[9][5].name ="異世界ゲートの進み方";
		eq[9][5].power = 2000;
		eq[9][6].name ="使いの弁当";
		eq[9][6].power = 2000;
		eq[9][7].name ="異世界ハーブ";
		eq[9][7].power = 2000;
		
		//rank10のドロップアイテムに関する宣言
		eq[10][0].name ="異世界神殿の鍵";
		eq[10][0].power = 3000;
		eq[10][1].name ="異世界神殿の見取り図";
		eq[10][1].power = 3000;
		eq[10][2].name ="門番の長槍";
		eq[10][2].power = 3000;
		eq[10][3].name ="門番の強鎧";
		eq[10][3].power = 3000;
		eq[10][4].name ="門番の強壮薬";
		eq[10][4].power = 3000;
		eq[10][5].name ="門番ペット";
		eq[10][5].power = 3000;
		eq[10][6].name ="門番のブーツ";
		eq[10][6].power = 3000;
		eq[10][7].name ="門番のマスケット銃";
		eq[10][7].power = 3000;
		
		//rank11のドロップアイテムに関する宣言
		eq[11][0].name ="神の裁き";
		eq[11][0].power = 8000;
		eq[11][1].name ="異世界神の魂";
		eq[11][1].power = 5000;
		eq[11][2].name ="異世界神殿";
		eq[11][2].power = 5000;
		eq[11][3].name ="異世界神ペット";
		eq[11][3].power = 5000;
		eq[11][4].name ="神の杖";
		eq[11][4].power = 5000;
		eq[11][5].name ="筋斗雲";
		eq[11][5].power = 5000;
		eq[11][6].name ="天候の杖";
		eq[11][6].power = 5000;
		eq[11][7].name ="瞬身の杖";
		eq[11][7].power = 5000;
		
		//rank12のドロップアイテムに関する宣言
		eq[12][0].name ="ひのきのぼう";
		eq[12][0].power = 5;
		eq[12][1].name ="こんぼう";
		eq[12][1].power = 6;
		eq[12][2].name ="くわ";
		eq[12][2].power = 7;
		eq[12][3].name ="たけざお";
		eq[12][3].power = 8;
		eq[12][4].name ="ぬののふく";
		eq[12][4].power = 3;
		eq[12][5].name ="のうみんのふく";
		eq[12][5].power = 2;
		eq[12][6].name ="おうさまのふく";
		eq[12][6].power = 5;
		eq[12][7].name ="おうかん";
		eq[12][7].power = 5;
		
		//rank13のドロップアイテムに関する宣言
		eq[13][0].name ="国王の首";
		eq[13][0].power = 0;
		eq[13][1].name ="国王の首";
		eq[13][1].power = 0;
		eq[13][2].name ="国王の首";
		eq[13][2].power = 0;
		eq[13][3].name ="国王の首";
		eq[13][3].power = 0;
		eq[13][4].name ="キングダム王国";
		eq[13][4].power = 0;
		eq[13][5].name ="キングダム王国";
		eq[13][5].power = 0;
		eq[13][6].name ="キングダム王国";
		eq[13][6].power = 0;
		eq[13][7].name ="キングダム王国";
		eq[13][7].power = 0;
	}
	
	
	//GOクラスの装備一覧をドロップアイテムに書き換えるためのメソッド。ゲームバランス調整時にいじる必要なし。
	int EqNo = 0;
	void DropItem(){
		EquipDate();
		if(Main.battle.drop == 1){
			if(EqNo == 0){
				Main.go.equipName0 = eq[Main.battle.rank][randInt].name;
				Main.go.equipPower0 = eq[Main.battle.rank][randInt].power;
				Main.report.NextReportLabelDrop.setText("<html>ドロップ<br>"+Main.go.equipName0+"<br>強さ："+Main.go.equipPower0);
				EqNo++;
			}
			else if (EqNo == 1){
				Main.go.equipName1 = eq[Main.battle.rank][randInt].name;
				Main.go.equipPower1 = eq[Main.battle.rank][randInt].power;
				Main.report.NextReportLabelDrop.setText("<html>ドロップ<br>"+Main.go.equipName1+"<br>強さ："+Main.go.equipPower1);
				EqNo++;
			}
			else if (EqNo == 2){
				Main.go.equipName2 = eq[Main.battle.rank][randInt].name;
				Main.go.equipPower2 = eq[Main.battle.rank][randInt].power;
				Main.report.NextReportLabelDrop.setText("<html>ドロップ<br>"+Main.go.equipName2+"<br>強さ："+Main.go.equipPower2);
				EqNo++;
			}
			else if (EqNo == 3){
				Main.go.equipName3 = eq[Main.battle.rank][randInt].name;
				Main.go.equipPower3 = eq[Main.battle.rank][randInt].power;
				Main.report.NextReportLabelDrop.setText("<html>ドロップ<br>"+Main.go.equipName3+"<br>強さ："+Main.go.equipPower3);
				EqNo++;
			}
			else if (EqNo == 4){
				Main.go.equipName4 = eq[Main.battle.rank][randInt].name;
				Main.go.equipPower4 = eq[Main.battle.rank][randInt].power;
				Main.report.NextReportLabelDrop.setText("<html>ドロップ<br>"+Main.go.equipName4+"<br>強さ："+Main.go.equipPower4);
				EqNo++;
			}
			else if (EqNo == 5){
				Main.go.equipName5 = eq[Main.battle.rank][randInt].name;
				Main.go.equipPower5 = eq[Main.battle.rank][randInt].power;
				Main.report.NextReportLabelDrop.setText("<html>ドロップ<br>"+Main.go.equipName5+"<br>強さ："+Main.go.equipPower5);
				EqNo++;
			}
			else if (EqNo == 6){
				Main.go.equipName6 = eq[Main.battle.rank][randInt].name;
				Main.go.equipPower6 = eq[Main.battle.rank][randInt].power;
				Main.report.NextReportLabelDrop.setText("<html>ドロップ<br>"+Main.go.equipName6+"<br>強さ："+Main.go.equipPower6);
				EqNo++;
			}
			else if (EqNo == 7){
				Main.go.equipName7 = eq[Main.battle.rank][randInt].name;
				Main.go.equipPower7 = eq[Main.battle.rank][randInt].power;
				Main.report.NextReportLabelDrop.setText("<html>ドロップ<br>"+Main.go.equipName7+"<br>強さ："+Main.go.equipPower7);
				EqNo=0;
			}
			
		}
	}
}