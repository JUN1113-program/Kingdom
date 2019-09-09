package kingdom;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


//強さ１５未満のキャラクターを生成する。
class Player{
	int player0;
	int player1;
	int player2;
	int player3;
	int player4;
	int player5;
	int player6;
	int player7;
	int player8;
	int player9;
	//プレイヤーステータスを乱数で決定する。
	void RandomPlayer(){
		Random rand = new Random();
		player0 = rand.nextInt(15);
		player1 = rand.nextInt(15);
		player2 = rand.nextInt(15);
		player3 = rand.nextInt(15);
		player4 = rand.nextInt(15);
		player5 = rand.nextInt(15);
		player6 = rand.nextInt(15);
		player7 = rand.nextInt(15);
		player8 = rand.nextInt(15);
		player9 = rand.nextInt(15);
	}
	
}

class PlayerDate{
	Image PlayerIcon;
	String PlayerName;
}

public class Select extends JPanel{
	Player player = new Player();
	JPanel SelectPanel = new JPanel();
	JPanel SelectLabel = new JPanel();
	JLabel selectlabel0 = new JLabel("");
	JLabel selectlabel1 = new JLabel("");
	JLabel selectlabel2 = new JLabel("");
	JLabel selectlabel3 = new JLabel("");
	
	
	
	//選ばれた10人の国民の名前を保存しておく変数
	String player0 = "";
	String player1 = "";
	String player2 = "";
	String player3 = "";
	String player4 = "";
	String player5 = "";
	String player6 = "";
	String player7 = "";
	String player8 = "";
	String player9 = "";
	
	
	//Playerの名前をランダムに決定する。プレイヤーの名前と画像を追加する場合はここに追加する。
	PlayerDate[] PlayerDate = new PlayerDate[100];
	Random rand = new Random();
	void RandomSelect(){
		for(int i=0;i<69;i++){
			PlayerDate[i] = new PlayerDate();
		}
		PlayerDate[0].PlayerName ="鍛冶師";
		PlayerDate[1].PlayerName ="兜屋";
		PlayerDate[2].PlayerName ="武具屋";
		PlayerDate[3].PlayerName ="刀剣屋";
		PlayerDate[4].PlayerName ="刃物屋";
		PlayerDate[5].PlayerName ="針屋";
		PlayerDate[6].PlayerName ="カンヌキ屋";
		PlayerDate[7].PlayerName ="鋳掛け屋";
		PlayerDate[8].PlayerName ="金細工師";
		PlayerDate[9].PlayerName ="革なめし職人";
		PlayerDate[10].PlayerName ="靴職人";
		PlayerDate[11].PlayerName ="帽子職人";
		PlayerDate[12].PlayerName ="鞄職人";
		PlayerDate[13].PlayerName ="蝋燭職人";
		PlayerDate[14].PlayerName ="油商人";
		PlayerDate[15].PlayerName ="菓子屋";
		PlayerDate[16].PlayerName ="ぶどう酒商人";
		PlayerDate[17].PlayerName ="ビール商人";
		PlayerDate[18].PlayerName ="肉屋";
		PlayerDate[19].PlayerName ="米農家";
		PlayerDate[20].PlayerName ="麦農家";
		PlayerDate[21].PlayerName ="酪農家";
		PlayerDate[22].PlayerName ="毛皮職人";
		PlayerDate[23].PlayerName ="女中";
		PlayerDate[24].PlayerName ="仕立屋";
		PlayerDate[25].PlayerName ="理髪師";
		PlayerDate[26].PlayerName ="宝石職人";
		PlayerDate[27].PlayerName ="料理店主";
		PlayerDate[28].PlayerName ="古着屋";
		PlayerDate[29].PlayerName ="石工";
		PlayerDate[30].PlayerName ="大工";
		PlayerDate[31].PlayerName ="職工";
		PlayerDate[32].PlayerName ="織物商";
		PlayerDate[33].PlayerName ="樽職人";
		PlayerDate[34].PlayerName ="パン職人";
		PlayerDate[35].PlayerName ="水運搬入";
		PlayerDate[36].PlayerName ="さや職人";
		PlayerDate[37].PlayerName ="鞍職人";
		PlayerDate[38].PlayerName ="鶏屋";
		PlayerDate[39].PlayerName ="財布職人";
		PlayerDate[40].PlayerName ="洗濯女";
		PlayerDate[41].PlayerName ="魚屋";
		PlayerDate[42].PlayerName ="バックル職人";
		PlayerDate[43].PlayerName ="漆喰職人";
		PlayerDate[44].PlayerName ="香辛料商人";
		PlayerDate[45].PlayerName ="塗装工";
		PlayerDate[46].PlayerName ="医師";	
		PlayerDate[47].PlayerName ="屋根職人";
		PlayerDate[48].PlayerName ="錠前師";
		PlayerDate[49].PlayerName ="風呂屋";
		PlayerDate[50].PlayerName ="紐職人";
		PlayerDate[51].PlayerName ="宿屋主人";
		PlayerDate[52].PlayerName ="筆写人";
		PlayerDate[53].PlayerName ="彫刻師";
		PlayerDate[54].PlayerName ="敷物職人";
		PlayerDate[55].PlayerName ="馬具職人";
		PlayerDate[56].PlayerName ="漂布職人";
		PlayerDate[57].PlayerName ="干し草商人";
		PlayerDate[58].PlayerName ="手袋職人";
		PlayerDate[59].PlayerName ="木材商人";
		PlayerDate[60].PlayerName ="木彫師";
		PlayerDate[61].PlayerName ="飛脚";
		PlayerDate[62].PlayerName ="娼婦";
		PlayerDate[63].PlayerName ="公証人";
		PlayerDate[64].PlayerName ="両替商";
		PlayerDate[65].PlayerName ="ガラス職人";
		PlayerDate[66].PlayerName ="刺繍工";
		PlayerDate[67].PlayerName ="煉瓦積み職人";
		PlayerDate[68].PlayerName ="旅人";
		
		int rand0 = rand.nextInt(68);
		int rand1 = rand.nextInt(68);
		int rand2 = rand.nextInt(68);
		int rand3 = rand.nextInt(68);
		int rand4 = rand.nextInt(68);
		int rand5 = rand.nextInt(68);
		int rand6 = rand.nextInt(68);
		int rand7 = rand.nextInt(68);
		int rand8 = rand.nextInt(68);
		int rand9 = rand.nextInt(68);
		
		
		player0 = PlayerDate[rand0].PlayerName;
		player1 = PlayerDate[rand1].PlayerName;
		player2 = PlayerDate[rand2].PlayerName;
		player3 = PlayerDate[rand3].PlayerName;
		player4 = PlayerDate[rand4].PlayerName;
		player5 = PlayerDate[rand5].PlayerName;
		player6 = PlayerDate[rand6].PlayerName;
		player7 = PlayerDate[rand7].PlayerName;
		player8 = PlayerDate[rand8].PlayerName;
		player9 = PlayerDate[rand9].PlayerName;
		
	}
	
	//選択されたキャラクターのステータスを保存する。
	int User0 = 0;
	int User1 = 0;
	int User2 = 0;
	int User3 = 0;
	
	//選択されたキャラクターの名前を保存する。
	String UserPlayer0 = ""; 
	String UserPlayer1 = ""; 
	String UserPlayer2 = ""; 
	String UserPlayer3 = ""; 
	
	//選択された回数を保存しておく。
	int Selection = 0;
	
	
	//プレイヤー数分のボタンを生成する。（名前＋文＋プレイヤーステータス）
	JButton Button0 = new JButton("<html>"+player0+"<br>強さ："+player.player0);
	JButton Button1 = new JButton("<html>"+player1+"<br>強さ："+player.player1);
	JButton Button2 = new JButton("<html>"+player2+"<br>強さ："+player.player2);
	JButton Button3 = new JButton("<html>"+player3+"<br>強さ："+player.player3);
	JButton Button4 = new JButton("<html>"+player4+"<br>強さ："+player.player4);
	JButton Button5 = new JButton("<html>"+player5+"<br>強さ："+player.player5);
	JButton Button6 = new JButton("<html>"+player6+"<br>強さ："+player.player6);
	JButton Button7 = new JButton("<html>"+player7+"<br>強さ："+player.player7);
	JButton Button8 = new JButton("<html>"+player8+"<br>強さ："+player.player8);
	JButton Button9 = new JButton("<html>"+player9+"<br>強さ："+player.player9);
	
	//決定とリセットを行う特殊ボタンを生成する。
	JButton Reset = new JButton("リセット");
	JButton Enter = new JButton("決定");
	
	
	//ラベルの表記を出し直す
	void ReName(){
		selectlabel0.setText("<html>名前："+UserPlayer0+"<br>強さ："+User0);
		selectlabel1.setText("<html>名前："+UserPlayer1+"<br>強さ："+User1);
		selectlabel2.setText("<html>名前："+UserPlayer2+"<br>強さ："+User2);
		selectlabel3.setText("<html>名前："+UserPlayer3+"<br>強さ："+User3);
	}
	
	//選択をリセットする。
	void ResetSelection(){
		//選択キャラクターの保存ネームの削除
		UserPlayer0 = "名前"; 
		UserPlayer1 = "名前"; 
		UserPlayer2 = "名前"; 
		UserPlayer3 = "名前"; 
		
		//選択キャラの保存ステータスの削除
		User0 = 0;
		User1 = 0;
		User2 = 0;
		User3 = 0;
		
		//ラベルの文の削除
		ReName();

		//選択回数を削除
		Selection = 0;
		
		//すべてのボタンの削除
		Main.select.SelectPanel.remove(Button0);
		Main.select.SelectPanel.remove(Button1);
		Main.select.SelectPanel.remove(Button2);
		Main.select.SelectPanel.remove(Button3);
		Main.select.SelectPanel.remove(Button4);
		Main.select.SelectPanel.remove(Button5);
		Main.select.SelectPanel.remove(Button6);
		Main.select.SelectPanel.remove(Button7);
		Main.select.SelectPanel.remove(Button8);
		Main.select.SelectPanel.remove(Button9);
		
		//削除されたボタンの復活
		SelectPanel.setLayout(new GridLayout(5,2));
		SelectPanel.add(Button0);
		SelectPanel.add(Button1);
		SelectPanel.add(Button2);
		SelectPanel.add(Button3);
		SelectPanel.add(Button4);
		SelectPanel.add(Button5);
		SelectPanel.add(Button6);
		SelectPanel.add(Button7);
		SelectPanel.add(Button8);
		SelectPanel.add(Button9);
		
		//パネルとラベルのリロード
		Main.ResetFrame();
	}

	//コンストラクタ中でアクションリステナーを表記する。
	Select(){
		//プレイヤーステータスをランダム生成するメソッドを起動する。
		player.RandomPlayer();
		RandomSelect();
		//プレイヤー名とステータスを更新する。
		Button0.setText("<html>"+player0+"<br>強さ："+player.player0);
		Button1.setText("<html>"+player1+"<br>強さ："+player.player1);
		Button2.setText("<html>"+player2+"<br>強さ："+player.player2);
		Button3.setText("<html>"+player3+"<br>強さ："+player.player3);
		Button4.setText("<html>"+player4+"<br>強さ："+player.player4);
		Button5.setText("<html>"+player5+"<br>強さ："+player.player5);
		Button6.setText("<html>"+player6+"<br>強さ："+player.player6);
		Button7.setText("<html>"+player7+"<br>強さ："+player.player7);
		Button8.setText("<html>"+player8+"<br>強さ："+player.player8);
		Button9.setText("<html>"+player9+"<br>強さ："+player.player9);
		
		
		//labelを表記する。
		ReName();
		
		//それぞれのボタンにアクションリステナーを登録する。
		Button0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(Selection<4){
					if(Selection == 0){
						User0 = player.player0;
						UserPlayer0 = player0;
					}
					else if(Selection == 1){
						User1 = player.player0;
						UserPlayer1 = player0;
					}
					else if(Selection == 2){
						User2 = player.player0;
						UserPlayer2 = player0;
					}
					else if(Selection == 3){
						User3 = player.player0;
						UserPlayer3 = player0;
					}
					ReName();
					Selection++;
					Main.select.SelectPanel.remove(Button0);
					Main.ResetFrame();
				}
				
			}	
		});
		Button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(Selection<4){
					if(Selection == 0){
						User0 = player.player1;
						UserPlayer0 = player1;
					}
					else if(Selection == 1){
						User1 = player.player1;
						UserPlayer1 = player1;
					}
					else if(Selection == 2){
						User2 = player.player1;
						UserPlayer2 = player1;
					}
					else if(Selection == 3){
						User3 = player.player1;
						UserPlayer3 = player1;
					}
					ReName();
					Selection++;
					Main.select.SelectPanel.remove(Button1);
					Main.ResetFrame();
				}
			}	
		});
		Button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(Selection<4){
					if(Selection == 0){
						User0 = player.player2;
						UserPlayer0 = player2;
					}
					else if(Selection == 1){
						User1 = player.player2;
						UserPlayer1 = player2;
					}
					else if(Selection == 2){
						User2 = player.player2;
						UserPlayer2 = player2;
					}
					else if(Selection == 3){
						User3 = player.player2;
						UserPlayer3 = player2;
					}
					ReName();
					Selection++;
					Main.select.SelectPanel.remove(Button2);
					Main.ResetFrame();
				}
			}	
		});
		Button3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(Selection<4){
					if(Selection == 0){
						User0 = player.player3;
						UserPlayer0 = player3;
					}
					else if(Selection == 1){
						User1 = player.player3;
						UserPlayer1 = player3;
					}
					else if(Selection == 2){
						User2 = player.player3;
						UserPlayer2 = player3;
					}
					else if(Selection == 3){
						User3 = player.player3;
						UserPlayer3 = player3;
					}
					ReName();
					Selection++;
					Main.select.SelectPanel.remove(Button3);
					Main.ResetFrame();
				}
			}	
		});
		Button4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(Selection<4){
					if(Selection == 0){
						User0 = player.player4;
						UserPlayer0 = player4;
					}
					else if(Selection == 1){
						User1 = player.player4;
						UserPlayer1 = player4;
					}
					else if(Selection == 2){
						User2 = player.player4;
						UserPlayer2 = player4;
					}
					else if(Selection == 3){
						User3 = player.player4;
						UserPlayer3 = player4;
					}
					ReName();
					Selection++;
					Main.select.SelectPanel.remove(Button4);
					Main.ResetFrame();
				}
			}	
		});
		Button5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(Selection<4){
					if(Selection == 0){
						User0 = player.player5;
						UserPlayer0 = player5;
					}
					else if(Selection == 1){
						User1 = player.player5;
						UserPlayer1 = player5;
					}
					else if(Selection == 2){
						User2 = player.player5;
						UserPlayer2 = player5;
					}
					else if(Selection == 3){
						User3 = player.player5;
						UserPlayer3 = player5;
					}
					ReName();
					Selection++;
					Main.select.SelectPanel.remove(Button5);
					Main.ResetFrame();
				}
			}	
		});
		Button6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(Selection<4){
					if(Selection == 0){
						User0 = player.player6;
						UserPlayer0 = player6;
					}
					else if(Selection == 1){
						User1 = player.player6;
						UserPlayer1 = player6;
					}
					else if(Selection == 2){
						User2 = player.player6;
						UserPlayer2 = player6;
					}
					else if(Selection == 3){
						User3 = player.player6;
						UserPlayer3 = player6;
					}
					ReName();
					Selection++;
					Main.select.SelectPanel.remove(Button6);
					Main.ResetFrame();
				}
			}	
		});
		Button7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(Selection<4){
					if(Selection == 0){
						User0 = player.player7;
						UserPlayer0 = player7;
					}
					else if(Selection == 1){
						User1 = player.player7;
						UserPlayer1 = player7;
					}
					else if(Selection == 2){
						User2 = player.player7;
						UserPlayer2 = player7;
					}
					else if(Selection == 3){
						User3 = player.player7;
						UserPlayer3 = player7;
					}
					ReName();
					Selection++;
					Main.select.SelectPanel.remove(Button7);
					Main.ResetFrame();
				}
			}	
		});
		Button8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(Selection<4){
					if(Selection == 0){
						User0 = player.player8;
						UserPlayer0 = player8;
					}
					else if(Selection == 1){
						User1 = player.player8;
						UserPlayer1 = player8;
					}
					else if(Selection == 2){
						User2 = player.player8;
						UserPlayer2 = player8;
					}
					else if(Selection == 3){
						User3 = player.player8;
						UserPlayer3 = player8;
					}
					ReName();
					Selection++;
					Main.select.SelectPanel.remove(Button8);
					Main.ResetFrame();
				}
			}	
		});
		Button9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(Selection<4){
					if(Selection == 0){
						User0 = player.player9;
						UserPlayer0 = player9;
					}
					else if(Selection == 1){
						User1 = player.player9;
						UserPlayer1 = player9;
					}
					else if(Selection == 2){
						User2 = player.player9;
						UserPlayer2 = player9;
					}
					else if(Selection == 3){
						User3 = player.player9;
						UserPlayer3 = player9;
					}
					ReName();
					Selection++;
					Main.select.SelectPanel.remove(Button9);
					Main.ResetFrame();
				}
			}	
		});

		//リセットボタン、ラベルに保存された文章をすべてデリートする。
		Reset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				ResetSelection();
			}	
		});
		
		//決定ボタン、入力された値をMainクラスに返却し、次のクラスへと移動する。
		Enter.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(Selection==4){
					Main.card.show(Main.MainPanel,"Go");
					Main.go.Gone();
					Main.ResetFrame();
				}
			}	
		});
		
		SelectPanel.setLayout(new GridLayout(5,2));
		SelectPanel.add(Button0);
		SelectPanel.add(Button1);
		SelectPanel.add(Button2);
		SelectPanel.add(Button3);
		SelectPanel.add(Button4);
		SelectPanel.add(Button5);
		SelectPanel.add(Button6);
		SelectPanel.add(Button7);
		SelectPanel.add(Button8);
		SelectPanel.add(Button9);
		SelectLabel.setLayout(new GridLayout(6,1));
		SelectLabel.add(selectlabel0);
		SelectLabel.add(selectlabel1);
		SelectLabel.add(selectlabel2);
		SelectLabel.add(selectlabel3);
		SelectLabel.add(Enter);
		SelectLabel.add(Reset);

	}
}
