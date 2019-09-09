package kingdom;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Report{
	JLabel ReportLabel = new JLabel("");
	JPanel ReportPanel = new JPanel();
	JButton NextReportButton = new JButton("より詳しい経過報告へ");
	JLabel NextReportLabel = new JLabel("");
	JLabel NextReportLabelDrop = new JLabel("");
	JPanel NextReportPanel = new JPanel();
	JPanel GoOrBackPanel = new JPanel();
	JButton GoButton = new JButton("引き続き進む");
	JButton BackButton = new JButton("帰還させる");
	JPanel NextReportChildPanel0 = new JPanel();
	JPanel NextReportChildPanel1 = new JPanel();
	JPanel NextReport = new JPanel();
	JLabel Date = new JLabel("");
	
	int expPower = 0;
	int Filter = 0;
	int RPGEnd = 0;
	
	CardLayout card0 = new CardLayout();
	
	//Mainクラスから呼び出された際にコンストラクタでパネルを設定する。
	Report(){
		//勝敗を表示し、次の詳細発表を行うボタンを表示するためのパネル
		ReportPanel.setLayout(new GridLayout(2,1));
		ReportPanel.add(ReportLabel);
		ReportPanel.add(NextReportButton);
		
		//CardLayoutで表示できるように下記の二つのパネルを追加する。
		NextReportPanel.setLayout(new GridLayout(1,2));
		NextReportPanel.add(NextReportChildPanel0);
		NextReportPanel.add(NextReportChildPanel1);
		
		
		//キャラクターが戦った場所、戦った相手を表示するラベルを追加する。
		NextReportChildPanel0.setLayout(new GridLayout(1,1));
		NextReportChildPanel0.add(Date);
		
		//詳細発表に関するパネル。勝ち負け経験値ドロップを表示するラベルを表示する。
		NextReportChildPanel1.setLayout(new GridLayout(2,1));
		NextReportChildPanel1.add(NextReportLabel);
		NextReportChildPanel1.add(NextReportLabelDrop);
		
		//進撃するか、撤退するかを選択するボタンを表示する。
		GoOrBackPanel.setLayout(new GridLayout(1,2));
		GoOrBackPanel.add(BackButton);
		GoOrBackPanel.add(GoButton);
		
		//上記のNextReportPanelとGoOrBackPanelを上に乗っけたパネル。
		NextReport.setLayout(new GridLayout(2,1));
		NextReport.add(NextReportPanel);
		NextReport.add(GoOrBackPanel);
		
		//上記のReportPanelとNextReportをCardLayoutのReportMainPanelに名前を宣言して乗っける。
		Main.ReportMainPanel.setLayout(card0);
		Main.ReportMainPanel.add(NextReport,"Next");
		Main.ReportMainPanel.add(ReportPanel,"More");
		
		//ReportLabelの文を真ん中に配置する
		ReportLabel.setHorizontalAlignment(JLabel.CENTER);
		Date.setHorizontalAlignment(JLabel.CENTER);
		//文字を大きくする。
		ReportLabel.setFont(new Font(Font.DIALOG, Font.PLAIN, 32));
		
		//MextReportButtonが押された時にNextReportLabelらを更新し、ドロップアイテムがある場合はその判定を行う。
		//またReportMainPanelの表示をNextReportに切り替える。
		NextReportButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				NextReportLabel.setText("<html>勝利数："+Main.battle.win+"回<br>敗北数："+Main.battle.lose+"回<br>経験値："+Main.battle.exp+"EXP");
				if(Main.battle.drop == 1){
					Main.drop.DropItem();
				}
				else{
					NextReportLabelDrop.setText("ドロップなし");
				}
				if(Main.battle.win == 1){
					GoButton.setText("引き続き進む");
					Date.setText("<html>"+"王様への報告書<br><br>"
							+"私達は"+Main.battle.point[Main.battle.rank].PointName+"で"+Main.battle.enemy[Main.battle.rank].EnemyName+"に勝利しました。<br>"
							+"このまま"+Main.battle.point[Main.battle.rank+1].PointName+"に住む"+Main.battle.enemy[Main.battle.rank+1].EnemyName
							+"を倒しに行くべきでしょうか。<br>どうか決定してください。");
					if(Main.battle.point[Main.battle.rank].PointName.equals("魔王城")){
						Date.setText("<html>"+"王様への報告書<br><br>"
								+"私達は"+Main.battle.point[Main.battle.rank].PointName+"で"+Main.battle.enemy[Main.battle.rank].EnemyName+"に勝利しました。<br>"
								+"これで私達の戦いは無事に終わりました。<br>帰国までもうしばらくかかりますがお待ち下さい。");
						GoButton.setText("国に帰還する");
					}
					else if(Main.battle.point[Main.battle.rank].PointName.equals("異世界神殿")){
						Date.setText("<html>"+"王様への報告書<br><br>"
								+"私達は"+Main.battle.point[Main.battle.rank].PointName+"で"+Main.battle.enemy[Main.battle.rank].EnemyName+"に勝利しました。<br>"
								+"これで私達の戦いは無事に終わりました。<br>帰国までもうしばらくかかりますがお待ち下さい。");
						GoButton.setText("国に帰還する");
					}
					else if (Main.battle.point[Main.battle.rank].PointName.equals("キングダム王国城内")){
						Date.setText("<html>"+"破かれた王様への報告書<br><br>"
								+"私達は"+Main.battle.point[Main.battle.rank].PointName+"で"+Main.battle.enemy[Main.battle.rank].EnemyName+"に勝利しました。<br>"
								+"これで私達の戦いは全て終わりました。<br>王様もごゆっくりお休みください。");
						GoButton.setText("おわり");
						RPGEnd = 1;
					}
				}
				else if(Main.battle.lose == 3){
					Date.setText("<html>"+"王様への報告書<br><br>"
							+"私達は"+Main.battle.point[Main.battle.rank].PointName+"で"+Main.battle.enemy[Main.battle.rank].EnemyName+"に敗北しました。<br>"
							+"一度帰国して態勢を整えるべきでしょうか。<br>どうか決定してください。");
					GoButton.setText("もう一度挑戦する");
				}
				else if(Main.battle.end == 1){
					Date.setText("<html>"+"うわさ話<br><br>"
							+"旅の一行が"+Main.battle.point[Main.battle.rank].PointName+"で"+Main.battle.enemy[Main.battle.rank].EnemyName+"に全員殺されたらしい。<br>"
							+"おそらく先日出国した"+Main.User0Name+"らのことであろう。<br>次の国民を選定しよう。");
					GoButton.setText("国民を選定する");
					BackButton.setText("国民を選定する");
					Main.battle.rank = 0;
					Main.battle.no =1;
					Main.go.expPower0 = 0;
					Main.go.expPower1 = 0;
					Main.go.expPower2 = 0;
					Main.go.expPower3 = 0;
					
				}
				card0.show(Main.ReportMainPanel,"Next");
				Main.ResetFrame();
			}
		});
		
		//GoButtonが押された時に魔王城まで到達しているかどうかを判定し、魔王城に到達していた場合はEndingへと移動する。
		//通常通り進軍する場合は、Battleで得た経験値をプレイヤーの力に変換してもう一度Battleクラスに値を返却する。
		GoButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//出撃時のエンディングへの分離条件
				if(Main.battle.win == 1){
					if(Main.battle.point[Main.battle.rank].PointName.equals("魔王城")){
						Main.end.End();
						Main.card.show(Main.MainPanel,"End");
					}
					else if(Main.battle.point[Main.battle.rank].PointName.equals("異世界神殿")){
						Main.end.End();
						Main.card.show(Main.MainPanel,"End");
					}
					else if(Main.battle.point[Main.battle.rank].PointName.equals("キングダム王国城内")){
						Main.end.End();
						Main.card.show(Main.MainPanel,"End");
					}
					//通常通り進軍する。
					else{
						Main.go.expPower0 =Main.go.expPower0 + expPower;
						Main.go.expPower1 =Main.go.expPower1 + expPower;
						Main.go.expPower2 =Main.go.expPower2 + expPower;
						Main.go.expPower3 =Main.go.expPower3 + expPower;
						Main.go.AllPower();
						Main.battle.date(Main.go.AllPower0,Main.go.AllPower1,Main.go.AllPower2,Main.go.AllPower3);
						card0.show(Main.ReportMainPanel,"More");
						Main.ResetFrame();
					}
				}
				else if(Main.battle.end == 1){
					Main.card.show(Main.MainPanel,"Select");
					Main.select.RandomSelect();
					Main.select.ResetSelection();
				}
				else{
					Main.go.expPower0 =Main.go.expPower0 + expPower;
					Main.go.expPower1 =Main.go.expPower1 + expPower;
					Main.go.expPower2 =Main.go.expPower2 + expPower;
					Main.go.expPower3 =Main.go.expPower3 + expPower;
					Main.go.AllPower();
					Main.battle.date(Main.go.AllPower0,Main.go.AllPower1,Main.go.AllPower2,Main.go.AllPower3);
					card0.show(Main.ReportMainPanel,"More");
					Main.ResetFrame();
				}
			}
		});
		
		//BackButtonが押された時に先ほどと同じように魔王城への到達の可否を判定し、魔王城に到達していたらEndingへ移動する。
		//それ以外の場合はGoPanelに切り替えてもう一度出撃準備を行う。
		BackButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//Endingへの分岐条件
				if(Main.battle.win == 1){
					if(Main.battle.point[Main.battle.rank].PointName.equals("魔王城")){
						Main.end.End();
						Main.card.show(Main.MainPanel,"End");
					}
					else if(Main.battle.point[Main.battle.rank].PointName.equals("異世界神殿")){
						Main.end.End();
						Main.card.show(Main.MainPanel,"End");
					}
					else if(Main.battle.point[Main.battle.rank].PointName.equals("キングダム王国城内")){
						Main.end.End();
						Main.card.show(Main.MainPanel,"End");
					}
					//通常通り国に帰還する。
					else {
						Main.go.AllReset();
						Main.card.show(Main.MainPanel,"Go");
					}
				}
				else {
					Main.go.AllReset();
					Main.card.show(Main.MainPanel,"Go");
				}
				Main.ResetFrame();
			}
		});
	}
	
	void MainReport(){
		card0.show(Main.ReportMainPanel,"More");
		
		//経験値に対してどの程度プレイヤーを強くするか設定する項目。現在は経験値の４分の１を強さに変換している。
		expPower = Main.battle.exp /4;

		if(Main.battle.win == 1){
			ReportLabel.setText("WIN!");
		}
		else if(Main.battle.lose == 3){
			ReportLabel.setText("LOSE!");
		}
		else if(Main.battle.end == 1){
			ReportLabel.setText("THE END");
		}
	}
}
