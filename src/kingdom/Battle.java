package kingdom;
import java.awt.Image;
import java.util.Random;

import javax.swing.JPanel;

//敵の情報の変数をここで宣言する。敵の情報を追加したい場合はここに変数を追加する。（例：敵固有のドロップアイテム、新しい仲間など）
class EnemyDate{
	//敵の能力値
	int EnemyPow = 0;
	//敵のランク
	int EnemyRank = 0;
	//敵の名前
	String EnemyName = "";
	//敵のイメージ画像（使用するかどうか）
	Image EnemyImage = null;
}

//敵と戦った場所に関する変数をここで宣言する。場所の情報を追加したい場合はここに変数を追加する（例：魔王城等、特別なエンディングへの導入を行う場合）
class BattlePointName{
	//場所の名前
	String PointName = "";
}

public class Battle extends JPanel {
	int win = 0;
	int lose = 0;
	int end = 0;
	int drop = 0;
	int exp = 0;
	int Ourpow = 0;
	int no=1;
	int rank=0;
	int EnemyPower = 0;
	
	
	//敵の情報を保存する配列を作成する。
	EnemyDate[] enemy = new EnemyDate[100];
	//敵の情報を宣言するメソッド。
	void Enemy(){
			for(int i = 0;i<100;i++){
				enemy[i]=new EnemyDate();
			}
			enemy[0].EnemyName = "スライム";
			enemy[0].EnemyPow = 60;
			enemy[0].EnemyRank = 0;
			enemy[0].EnemyImage = getToolkit().getImage("date/");
			
			enemy[1].EnemyName = "盗人";
			enemy[1].EnemyPow = 120;
			enemy[1].EnemyRank = 1;
			enemy[1].EnemyImage = getToolkit().getImage("date/");
			
			enemy[2].EnemyName = "熊";
			enemy[2].EnemyPow =180;
			enemy[2].EnemyRank = 2;
			enemy[2].EnemyImage = getToolkit().getImage("date/");
			
			enemy[3].EnemyName = "ゾンビ犬の群れ";
			enemy[3].EnemyPow =240;
			enemy[3].EnemyRank = 3;
			enemy[3].EnemyImage = getToolkit().getImage("date/");
			
			enemy[4].EnemyName = "禍々しい何か";
			enemy[4].EnemyPow =300;
			enemy[4].EnemyRank = 4;
			enemy[4].EnemyImage = getToolkit().getImage("date/");
			
			enemy[5].EnemyName = "魔王";
			enemy[5].EnemyPow =600;
			enemy[5].EnemyRank = 5;
			enemy[5].EnemyImage = getToolkit().getImage("date/");
			
			enemy[6].EnemyName = "異次元スライム";
			enemy[6].EnemyPow =1200;
			enemy[6].EnemyRank = 6;
			enemy[6].EnemyImage = getToolkit().getImage("date/");
			
			enemy[7].EnemyName = "異世界からの使徒";
			enemy[7].EnemyPow =3500;
			enemy[7].EnemyRank = 7;
			enemy[7].EnemyImage = getToolkit().getImage("date/");
			
			enemy[8].EnemyName = "異世界の案内人";
			enemy[8].EnemyPow =5400;
			enemy[8].EnemyRank = 8;
			enemy[8].EnemyImage = getToolkit().getImage("date/");
			
			enemy[9].EnemyName = "異世界神の使い";
			enemy[9].EnemyPow =9600;
			enemy[9].EnemyRank = 9;
			enemy[9].EnemyImage = getToolkit().getImage("date/");
			
			enemy[10].EnemyName = "神殿の門番";
			enemy[10].EnemyPow =16660;
			enemy[10].EnemyRank = 10;
			enemy[10].EnemyImage = getToolkit().getImage("date/");
			
			enemy[11].EnemyName = "異世界神";
			enemy[11].EnemyPow =72000;
			enemy[11].EnemyRank = 11;
			enemy[11].EnemyImage = getToolkit().getImage("date/");
			
			enemy[12].EnemyName = "傷ついた兵士";
			enemy[12].EnemyPow =20;
			enemy[12].EnemyRank = 0;
			enemy[12].EnemyImage = getToolkit().getImage("date/");
			
			enemy[13].EnemyName = "王様";
			enemy[13].EnemyPow =10;
			enemy[13].EnemyRank = 13;
			enemy[13].EnemyImage = getToolkit().getImage("date/");
		}

	//場所の情報を保存する配列を作成する。
	BattlePointName[] point = new BattlePointName[100];
	//戦闘場所の名前を入力する場所
	void Point(){
		for(int i = 0;i<100;i++){
			point[i] = new BattlePointName();
		}
		point[0].PointName = "近隣の村";
		point[1].PointName = "少し遠くの村";
		point[2].PointName = "人里離れた村";
		point[3].PointName = "魔王軍に統治された村";
		point[4].PointName = "魔王城城下町";
		point[5].PointName = "魔王城";
		point[6].PointName = "異世界への入り口";
		point[7].PointName = "異世界への通り道";
		point[8].PointName = "異世界人の住む村";
		point[9].PointName = "異世界神眼下の街";
		point[10].PointName = "異世界神殿への門";
		point[11].PointName = "異世界神殿";
		point[12].PointName = "キングダム王国城";
		point[13].PointName = "キングダム王国城内";
	}
	
	void reset(){
		win = 0;
		lose = 0;
		end = 0;
		drop = 0;
		exp = 0;
	}
	
	Battle(){
		Enemy();
		Point();
	}
	
	
	//バトルメインメソッド、ここで自軍の力を計算し、敵軍との差を求める。また、ドロップアイテム、経験値の算出を行う。
	void date(int lv1,int lv2,int lv3,int lv4){
		Random rand = new Random();
		
		//敵に勝利していた場合は敵のランクを引き上げる。
		if(win==1){
			rank++;
			}
		
		//敵の強さを設定する。現在はランクごとに設定された敵のステータスと出撃関数に依存する。
		EnemyPower = enemy[rank].EnemyPow + no*10*enemy[rank].EnemyRank + enemy[rank].EnemyRank*rand.nextInt(no*10) - enemy[rank].EnemyRank*rand.nextInt(no*10);
		System.out.println("敵："+EnemyPower);
		//勝敗情報、ドロップ、経験値をリセットする。
		reset();
		//自軍の能力値を合算する。
		Ourpow = lv1 + lv2 + lv3 + lv4;
		System.out.println("味方："+Ourpow);
		//勝利するか、大敗するか、３敗するまで戦闘を行う。戦うごとに今戦っている敵は弱体化して行くが、次の敵はだんだん強くなる。
		for(;win == 0 && lose <3 && end == 0;EnemyPower -= rand.nextInt(3),no++){
			if(Ourpow >= EnemyPower){
				win ++;
				}
			else if(EnemyPower/3 > Ourpow){
				end++;
				}
			else if (EnemyPower > Ourpow){
				lose ++;
				}
			}
		//経験値の算出を行う。現在は敵の強さと勝利数、敗北数に依存する。
		exp = EnemyPower/5 * win + EnemyPower/5 * lose/3;
		
		//勝利時には確定でアイテムをドロップする。
		//敗北時には乱数によりアイテムドロップを判定する。今回はとりあえず４０％に設定。
		if(win == 1){
			drop = 1;
			}
		else if (lose == 3){
			int chance = rand.nextInt(10);
			if(chance>5){
				drop = 1;
				}
		}
		
		System.out.println(point[rank].PointName);
		Main.SunMoonPanel.i=0;
		Main.report.MainReport();
		Main.card.show(Main.MainPanel,"SunMoon");
		Main.ResetFrame();
		}
	}