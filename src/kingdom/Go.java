package kingdom;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Go{
	JButton SelectUser0 = new JButton();
	JButton SelectUser1 = new JButton();
	JButton SelectUser2 = new JButton();
	JButton SelectUser3 = new JButton();
	JButton AllRefl = new JButton("装備を外す");
	JButton FinalEnter = new JButton("出発させる");
	
	//フィールド上におけるパネルの宣言
	JPanel GoPanel = new JPanel();
	JPanel EquipPanel = new JPanel();
	JPanel PlayerPanel = new JPanel();
	
	//装備名を設定する。ドロップ品等はあとから代入出来るようにする。以下は初期設定。
	String equipName0 = "ひのきのぼう";
	String equipName1 = "こんぼう";
	String equipName2 = "くわ";
	String equipName3 = "たけざお";
	String equipName4 = "ぬののふく";
	String equipName5 = "のうみんのふく";
	String equipName6 = "おうさまのふく";
	String equipName7 = "おうかん";
	
	//装備の能力値を設定する。ドロップ品等を得た場合は更新出来るようにする。以下初期設定。
	int equipPower0=5;
	int equipPower1=6;
	int equipPower2=7;
	int equipPower3=8;
	int equipPower4=3;
	int equipPower5=2;
	int equipPower6=5;
	int equipPower7=5;
	
	//装備用のボタン、ここにアクションリステナーを登録し、押されたボタンによって装備の変更を行う。
	JButton EquipButton0 = new JButton(equipName0+":"+equipPower0);
	JButton EquipButton1 = new JButton(equipName1+":"+equipPower1);
	JButton EquipButton2 = new JButton(equipName2+":"+equipPower2);
	JButton EquipButton3 = new JButton(equipName3+":"+equipPower3);
	JButton EquipButton4 = new JButton(equipName4+":"+equipPower4);
	JButton EquipButton5 = new JButton(equipName5+":"+equipPower5);
	JButton EquipButton6 = new JButton(equipName6+":"+equipPower6);
	JButton EquipButton7 = new JButton(equipName7+":"+equipPower7);
	
	//GUI上にプレイヤー名、プレイヤーの装備、プレイヤーの強さを表記するためのラベル及び変数の宣言
	//Player0に関する変数の宣言
	String SelectPlayer0 = "";
	String SelectEquip0 = "";
	int Power0 = 0;
	int PlusPower0=0;
	int Selected0 = 0;
	int AllPower0 = 0;
	int expPower0 = 0;
	//Player1に関する変数の宣言
	String SelectPlayer1 = "";
	String SelectEquip1 = "";
	int Power1 = 0;
	int PlusPower1=0;
	int Selected1 = 0;
	int AllPower1 = 0;
	int expPower1 = 0;
	//Player2に関する変数の宣言
	String SelectPlayer2 = "";
	String SelectEquip2 = "";
	int Power2 = 0;
	int PlusPower2=0;
	int Selected2 = 0;
	int AllPower2 = 0;
	int expPower2 = 0;
	//Player3に関する変数の宣言
	String SelectPlayer3 = "";
	String SelectEquip3 = "";
	int Power3 = 0;
	int PlusPower3=0;
	int Selected3 = 0;
	int AllPower3 = 0;
	int expPower3 = 0;
	
	//Playerの情報を乗せるラベル、０が名前、１が選択されている装備、２がそのときの強さ
	JLabel PlayerDateLabel0 = new JLabel("");
	JLabel PlayerDateLabel10 = new JLabel("");
	JLabel PlayerDateLabel11 = new JLabel("");
	JLabel PlayerDateLabel12 = new JLabel("");
	JLabel PlayerDateLabel13 = new JLabel("");
	JLabel PlayerDateLabel2 = new JLabel("");
	
	//特殊操作ボタンの生成、装備の変更を決定してプレイヤー選択画面に戻る。
	JButton Enter = new JButton("決定");
	
	
	//Frameをリセットし、プレイヤー選択画面に戻る。
	void Reset(){
		Main.MainFrame.setTitle(Main.TitleName);
		PlayerPanel.remove(PlayerDateLabel10);
		PlayerPanel.remove(PlayerDateLabel11);
		PlayerPanel.remove(PlayerDateLabel12);
		PlayerPanel.remove(PlayerDateLabel13);
		PlayerPanel.remove(PlayerDateLabel0);
		PlayerPanel.remove(PlayerDateLabel2);
		Main.Gone.remove(PlayerPanel);
		Main.Gone.remove(EquipPanel);
		Main.Gone.add(GoPanel);
		Main.ResetFrame();
	}
	
	//選択済みの装備を選択欄から除去するためのメソッドの一部。ここで選択されている装備を除去する情報を提供する。
	int SelectedEquip0=0;
	int SelectedEquip1=0;
	int SelectedEquip2=0;
	int SelectedEquip3=0;
	int SelectedEquip4=0;
	int SelectedEquip5=0;
	int SelectedEquip6=0;
	int SelectedEquip7=0;
	void Select(){
		if (SelectedEquip0 == 1){
			OrRemove0 = 1;
		}
		if (SelectedEquip1 == 1){
			OrRemove1 = 1;
		}
		if (SelectedEquip2 == 1){
			OrRemove2 = 1;
		}
		if (SelectedEquip3 == 1){
			OrRemove3 = 1;
		}
		if (SelectedEquip4 == 1){
			OrRemove4 = 1;
		}
		if (SelectedEquip5 == 1){
			OrRemove5 = 1;
		}
		if (SelectedEquip6 == 1){
			OrRemove6 = 1;
		}
		if (SelectedEquip7 == 1){
			OrRemove7 = 1;
		}
	}
	
	//選択済みの装備を選択欄から除去するためのメソッドの一部。ここでは選択されている装備の除去を行う。
	int SelectionUser=0;
	int OrRemove0=0;
	int OrRemove1=0;
	int OrRemove2=0;
	int OrRemove3=0;
	int OrRemove4=0;
	int OrRemove5=0;
	int OrRemove6=0;
	int OrRemove7=0;
	void ORRemove(){
		if(1 == OrRemove0){
			EquipPanel.remove(EquipButton0);
		}
		if(1 == OrRemove1){
			EquipPanel.remove(EquipButton1);
		}
		if(1 == OrRemove2){
			EquipPanel.remove(EquipButton2);
		}
		if(1 == OrRemove3){
			EquipPanel.remove(EquipButton3);
		}
		if(1 == OrRemove4){
			EquipPanel.remove(EquipButton4);
		}
		if(1 == OrRemove5){
			EquipPanel.remove(EquipButton5);
		}
		if(1 == OrRemove6){
			EquipPanel.remove(EquipButton6);
		}
		if(1 == OrRemove7){
			EquipPanel.remove(EquipButton7);
		}
	}
	
	
	//どの装備が選択されているか調べるメソッド
	void Take0(){
		if(SelectEquip0.equals(equipName0)){
			SelectedEquip0 = 1;
		}
		
		else if(SelectEquip0.equals(equipName1)){
			SelectedEquip1 = 1;
		}
		else if(SelectEquip0.equals(equipName2)){
			SelectedEquip2 = 1;
		}
		else if(SelectEquip0.equals(equipName3)){
			SelectedEquip3 = 1;
		}
		else if(SelectEquip0.equals(equipName4)){
			SelectedEquip4 = 1;
		}
		else if(SelectEquip0.equals(equipName5)){
			SelectedEquip5 = 1;
		}
		else if(SelectEquip0.equals(equipName6)){
			SelectedEquip6 = 1;
		}
		else if(SelectEquip0.equals(equipName7)){
			SelectedEquip7 = 1;
		}
	}
	void Take1(){
		if(SelectEquip1.equals(equipName0)){
			SelectedEquip0 = 1;
		}
		
		else if(SelectEquip1.equals(equipName1)){
			SelectedEquip1 = 1;
		}
		else if(SelectEquip1.equals(equipName2)){
			SelectedEquip2 = 1;
		}
		else if(SelectEquip1.equals(equipName3)){
			SelectedEquip3 = 1;
		}
		else if(SelectEquip1.equals(equipName4)){
			SelectedEquip4 = 1;
		}
		else if(SelectEquip1.equals(equipName5)){
			SelectedEquip5 = 1;
		}
		else if(SelectEquip1.equals(equipName6)){
			SelectedEquip6 = 1;
		}
		else if(SelectEquip1.equals(equipName7)){
			SelectedEquip7 = 1;
		}
	}
	void Take2(){
		if(SelectEquip2.equals(equipName0)){
			SelectedEquip0 = 1;
		}
		
		else if(SelectEquip2.equals(equipName1)){
			SelectedEquip1 = 1;
		}
		else if(SelectEquip2.equals(equipName2)){
			SelectedEquip2 = 1;
		}
		else if(SelectEquip2.equals(equipName3)){
			SelectedEquip3 = 1;
		}
		else if(SelectEquip2.equals(equipName4)){
			SelectedEquip4 = 1;
		}
		else if(SelectEquip2.equals(equipName5)){
			SelectedEquip5 = 1;
		}
		else if(SelectEquip2.equals(equipName6)){
			SelectedEquip6 = 1;
		}
		else if(SelectEquip2.equals(equipName7)){
			SelectedEquip7 = 1;
		}
	}
	void Take3(){
		if(SelectEquip3.equals(equipName0)){
			SelectedEquip0 = 1;
		}
		else if(SelectEquip3.equals(equipName1)){
			SelectedEquip1 = 1;
		}
		else if(SelectEquip3.equals(equipName2)){
			SelectedEquip2 = 1;
		}
		else if(SelectEquip3.equals(equipName3)){
			SelectedEquip3 = 1;
		}
		else if(SelectEquip3.equals(equipName4)){
			SelectedEquip4 = 1;
		}
		else if(SelectEquip3.equals(equipName5)){
			SelectedEquip5 = 1;
		}
		else if(SelectEquip3.equals(equipName6)){
			SelectedEquip6 = 1;
		}
		else if(SelectEquip3.equals(equipName7)){
			SelectedEquip7 = 1;
		}
	}
	
	//画面上にプレイヤーの名前、現在装備、強さを表示するためのメソッド
	void AddPlayer0DateLabel(){
		PlayerPanel.setLayout(new GridLayout(4,1));
		PlayerDateLabel0.setText(SelectPlayer0);
		if(Selected0 == 0){
			PlayerDateLabel10.setText("");
			PlayerDateLabel2.setText("強さ："+AllPower0);
		}
		else if (Selected0 == 1){
			PlayerDateLabel2.setText("強さ："+AllPower0);
		}
		
		PlayerPanel.add(PlayerDateLabel0);
		PlayerPanel.add(PlayerDateLabel10);
		PlayerPanel.add(PlayerDateLabel2);
		PlayerPanel.add(Enter);
		
		Main.Gone.add(PlayerPanel);
		Enter.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Reset();
				PlayerPanel.remove(PlayerDateLabel10);
				SelectUser0.setText("<html>"+SelectPlayer0+"<br>強さ:"+AllPower0+"<br>装備:"+SelectEquip0);
				Selected0 = 1;
				Take0();
				Select();
			}
		});
	}
	void AddPlayer1DateLabel(){
		PlayerPanel.setLayout(new GridLayout(4,1));
		PlayerDateLabel0.setText(SelectPlayer1);
		if(Selected1 == 0){
			PlayerDateLabel11.setText("");
			PlayerDateLabel2.setText("強さ："+AllPower1);
		}
		else if (Selected1 == 1){
			PlayerDateLabel2.setText("強さ："+AllPower1);
		}
		PlayerPanel.add(PlayerDateLabel0);
		PlayerPanel.add(PlayerDateLabel11);
		PlayerPanel.add(PlayerDateLabel2);
		PlayerPanel.add(Enter);

		
		Main.Gone.add(PlayerPanel);
		Enter.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Reset();
				Selected1 = 1;
				SelectUser1.setText("<html>"+SelectPlayer1+"<br>強さ:"+AllPower1+"<br>装備:"+SelectEquip1);
				Take1();
				Select();
			}
		});
	}
	void AddPlayer2DateLabel(){
		PlayerPanel.setLayout(new GridLayout(4,1));
		PlayerDateLabel0.setText(SelectPlayer2);
		if(Selected2 == 0){
			PlayerDateLabel12.setText("");
			PlayerDateLabel2.setText("強さ："+AllPower2);
		}
		else if (Selected2 == 1){
			PlayerDateLabel2.setText("強さ："+AllPower2);
		}
		PlayerPanel.add(PlayerDateLabel0);
		PlayerPanel.add(PlayerDateLabel12);
		PlayerPanel.add(PlayerDateLabel2);
		PlayerPanel.add(Enter);
	
		
		Main.Gone.add(PlayerPanel);
		Enter.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Reset();
				SelectUser2.setText("<html>"+SelectPlayer2+"<br>強さ:"+AllPower2+"<br>装備:"+SelectEquip2);
				Selected2 = 1;
				Take2();
				Select();
			}
		});
	}
	void AddPlayer3DateLabel(){
		PlayerPanel.setLayout(new GridLayout(4,1));
		PlayerDateLabel0.setText(SelectPlayer3);
		if(Selected3 == 0){
			PlayerDateLabel13.setText("");
			PlayerDateLabel2.setText("強さ："+AllPower3);
		}
		else if (Selected3 == 1){
			PlayerDateLabel2.setText("強さ："+AllPower3);
		}
		PlayerPanel.add(PlayerDateLabel0);
		PlayerPanel.add(PlayerDateLabel13);
		PlayerPanel.add(PlayerDateLabel2);
		PlayerPanel.add(Enter);
		
		Main.Gone.add(PlayerPanel);
		Enter.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Reset();
				SelectUser3.setText("<html>"+SelectPlayer3+"<br>強さ:"+AllPower3+"<br>装備:"+SelectEquip3);
				Selected3 = 1;
				Take3();
				Select();
			}
		});
	}
	
	//プレイヤーパワーと装備の能力値の足し算を行う。
	void AllPower(){
		AllPower0 = Power0 + PlusPower0 + expPower0;
		AllPower1 = Power1 + PlusPower1 + expPower1;
		AllPower2 = Power2 + PlusPower2 + expPower2;
		AllPower3 = Power3 + PlusPower3 + expPower3;
	}
	
	//アクションリステナーの重複登録を避けるためのFilter数。0の場合のみアクションリステナーを登録する。
	int Filter0=0;
	//画面上に装備一覧を表示するためのメソッド
	void AddEquipButton(){
		EquipPanel.setLayout(new GridLayout(8,1));
		EquipPanel.add(EquipButton0);
		EquipPanel.add(EquipButton1);
		EquipPanel.add(EquipButton2);
		EquipPanel.add(EquipButton3);
		EquipPanel.add(EquipButton4);
		EquipPanel.add(EquipButton5);
		EquipPanel.add(EquipButton6);
		EquipPanel.add(EquipButton7);
		ORRemove();
		//EquipButtonの文字情報を読み込み直す（Dropアイテムを追加するために）
		EquipButton0.setText(equipName0+":"+equipPower0);
		EquipButton1.setText(equipName1+":"+equipPower1);
		EquipButton2.setText(equipName2+":"+equipPower2);
		EquipButton3.setText(equipName3+":"+equipPower3);
		EquipButton4.setText(equipName4+":"+equipPower4);
		EquipButton5.setText(equipName5+":"+equipPower5);
		EquipButton6.setText(equipName6+":"+equipPower6);
		EquipButton7.setText(equipName7+":"+equipPower7);
		//それぞれの装備ボタンにアクションリスナーを登録する。
		if(Filter0 == 0){
			EquipButton0.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					
					if(SelectionUser == 0){
						PlayerDateLabel10.setText(equipName0);
						SelectEquip0 = equipName0;
						PlusPower0 = equipPower0;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower0);
						}
					else if (SelectionUser == 1){
						PlayerDateLabel11.setText(equipName0);
						SelectEquip1 = equipName0;
						PlusPower1 = equipPower0;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower1);
						}
					else if (SelectionUser == 2){
						PlayerDateLabel12.setText(equipName0);
						SelectEquip2 = equipName0;
						PlusPower2 = equipPower0;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower2);
						}
					else if (SelectionUser == 3){
						PlayerDateLabel13.setText(equipName0);
						SelectEquip3 = equipName0;
						PlusPower3 = equipPower0;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower3);
						}
					Main.ResetFrame();
				}
			});
			EquipButton1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					if(SelectionUser == 0){
						PlayerDateLabel10.setText(equipName1);
						SelectEquip0 = equipName1;
						PlusPower0 = equipPower1;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower0);
						}
					else if (SelectionUser == 1){
						PlayerDateLabel11.setText(equipName1);
						SelectEquip1 = equipName1;
						PlusPower1 = equipPower1;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower1);
					}
					else if (SelectionUser == 2){
						PlayerDateLabel12.setText(equipName1);
						SelectEquip2 = equipName1;
						PlusPower2 = equipPower1;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower2);
						}
					else if (SelectionUser == 3){
						PlayerDateLabel13.setText(equipName1);
						SelectEquip3 = equipName1;
						PlusPower3 = equipPower1;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower3);
						}
					Main.ResetFrame();
				}
			});
			EquipButton2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					if(SelectionUser == 0){
						PlayerDateLabel10.setText(equipName2);
						SelectEquip0 = equipName2;
						PlusPower0 = equipPower2;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower0);
						}
					else if (SelectionUser == 1){
						PlayerDateLabel11.setText(equipName2);
						SelectEquip1 = equipName2;
						PlusPower1 = equipPower2;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower1);
						}
					else if (SelectionUser == 2){
						PlayerDateLabel12.setText(equipName2);
						SelectEquip2 = equipName2;
						PlusPower2 = equipPower2;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower2);
						}
					else if (SelectionUser == 3){
						PlayerDateLabel13.setText(equipName2);
						SelectEquip3 = equipName2;
						PlusPower3 = equipPower2;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower3);
						}
					Main.ResetFrame();
				}
			});
			EquipButton3.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					if(SelectionUser == 0){
						PlayerDateLabel10.setText(equipName3);
						SelectEquip0 = equipName3;
						PlusPower0 = equipPower3;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower0);
						}
					else if (SelectionUser == 1){
						PlayerDateLabel11.setText(equipName3);
						SelectEquip1 = equipName3;
						PlusPower1 = equipPower3;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower1);
						}
					else if (SelectionUser == 2){
						PlayerDateLabel12.setText(equipName3);
						SelectEquip2 = equipName3;
						PlusPower2 = equipPower3;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower2);
						}
					else if (SelectionUser == 3){
						PlayerDateLabel13.setText(equipName3);
						SelectEquip3 = equipName3;
						PlusPower3 = equipPower3;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower3);
						}
					Main.ResetFrame();
				}
			});
			EquipButton4.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					if(SelectionUser == 0){
						PlayerDateLabel10.setText(equipName4);
						SelectEquip0 = equipName4;
						PlusPower0 = equipPower4;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower0);
						}
					else if (SelectionUser == 1){
						PlayerDateLabel11.setText(equipName4);
						SelectEquip1 = equipName4;
						PlusPower1 = equipPower4;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower1);
						}
					else if (SelectionUser == 2){
						PlayerDateLabel12.setText(equipName4);
						SelectEquip2 = equipName4;
						PlusPower2 = equipPower4;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower2);
						}
					else if (SelectionUser == 3){
						PlayerDateLabel13.setText(equipName4);
						SelectEquip3 = equipName4;
						PlusPower3 = equipPower4;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower3);
						}
					Main.ResetFrame();
				}
			});
			EquipButton5.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					if(SelectionUser == 0){
						PlayerDateLabel10.setText(equipName5);
						SelectEquip0 = equipName5;
						PlusPower0 = equipPower5;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower0);
						}
					else if (SelectionUser == 1){
						PlayerDateLabel11.setText(equipName5);
						SelectEquip1 = equipName5;
						PlusPower1 = equipPower5;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower1);
						}
					else if (SelectionUser == 2){
						PlayerDateLabel12.setText(equipName5);
						SelectEquip2 = equipName5;
						PlusPower2 = equipPower5;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower2);
						}
					else if (SelectionUser == 3){
						PlayerDateLabel13.setText(equipName5);
						SelectEquip3 = equipName5;
						PlusPower3 = equipPower5;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower3);
						}
					Main.ResetFrame();
				}
			});
			EquipButton6.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					if(SelectionUser == 0){
						PlayerDateLabel10.setText(equipName6);
						SelectEquip0 = equipName6;
						PlusPower0 = equipPower6;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower0);
						}
					else if (SelectionUser == 1){
						PlayerDateLabel11.setText(equipName6);
						SelectEquip1 = equipName6;
						PlusPower1 = equipPower6;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower1);
						}
					else if (SelectionUser == 2){
						PlayerDateLabel12.setText(equipName6);
						SelectEquip2 = equipName6;
						PlusPower2 = equipPower6;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower2);
						}
					else if (SelectionUser == 3){
						PlayerDateLabel13.setText(equipName6);
						SelectEquip3 = equipName6;
						PlusPower3 = equipPower6;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower3);
						}
					Main.ResetFrame();
				}
			});
			EquipButton7.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					if(SelectionUser == 0){
						PlayerDateLabel10.setText(equipName7);
						SelectEquip0 = equipName7;
						PlusPower0 = equipPower7;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower0);
						}
					else if (SelectionUser == 1){
						PlayerDateLabel11.setText(equipName7);
						SelectEquip1 = equipName7;
						PlusPower1 = equipPower7;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower1);
						}
					else if (SelectionUser == 2){
						PlayerDateLabel12.setText(equipName7);
						SelectEquip2 = equipName7;
						PlusPower2 = equipPower7;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower2);
						}
					else if (SelectionUser == 3){
						PlayerDateLabel13.setText(equipName7);
						SelectEquip3 = equipName7;
						PlusPower3 = equipPower7;
						AllPower();
						PlayerDateLabel2.setText("強さ："+AllPower3);
						}
					Main.ResetFrame();
				}
			});
			//二度目のアクションリステナー登録を防ぐためにFliter数を追加する。
			Filter0++;
			}
		Main.Gone.add(EquipPanel);
		}
	
	void AllReset(){
		SelectEquip0 = "";
		PlusPower0=0;
		Selected0 = 0;
		
		SelectEquip1 = "";
		PlusPower1=0;
		Selected1 = 0;
		
		SelectEquip2 = "";
		PlusPower2=0;
		Selected2 = 0;
		
		SelectEquip3 = "";
		PlusPower3=0;
		Selected3 = 0;
		
		AllPower();
		
		SelectionUser=0;
		OrRemove0=0;
		OrRemove1=0;
		OrRemove2=0;
		OrRemove3=0;
		OrRemove4=0;
		OrRemove5=0;
		OrRemove6=0;
		OrRemove7=0;
		
		SelectedEquip0=0;
		SelectedEquip1=0;
		SelectedEquip2=0;
		SelectedEquip3=0;
		SelectedEquip4=0;
		SelectedEquip5=0;
		SelectedEquip6=0;
		SelectedEquip7=0;
		EquipButton0.setText(equipName0+":"+equipPower0);
		EquipButton1.setText(equipName1+":"+equipPower1);
		EquipButton2.setText(equipName2+":"+equipPower2);
		EquipButton3.setText(equipName3+":"+equipPower3);
		EquipButton4.setText(equipName4+":"+equipPower4);
		EquipButton5.setText(equipName5+":"+equipPower5);
		EquipButton6.setText(equipName6+":"+equipPower6);
		EquipButton7.setText(equipName7+":"+equipPower7);
		
		SelectUser0.setText("<html>"+SelectPlayer0+"<br>強さ:"+AllPower0);
		SelectUser1.setText("<html>"+SelectPlayer1+"<br>強さ:"+AllPower1);
		SelectUser2.setText("<html>"+SelectPlayer2+"<br>強さ:"+AllPower2);
		SelectUser3.setText("<html>"+SelectPlayer3+"<br>強さ:"+AllPower3);
		PlayerDateLabel10.setText("");
		PlayerDateLabel11.setText("");
		PlayerDateLabel12.setText("");
		PlayerDateLabel13.setText("");
		
		Main.ResetFrame();
	}
	
	int Filter1=0;
	
	Go(){
		GoPanel.setLayout(new GridLayout(3,2));
		GoPanel.add(SelectUser0);
		GoPanel.add(SelectUser1);
		GoPanel.add(SelectUser2);
		GoPanel.add(SelectUser3);
		GoPanel.add(AllRefl);
		GoPanel.add(FinalEnter);

		SelectUser0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Main.Gone.remove(GoPanel);
				SelectionUser = 0;
				AddPlayer0DateLabel();
				AddEquipButton();
				Main.ResetFrame();
				}
			});
		SelectUser1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Main.Gone.remove(GoPanel);
				SelectionUser = 1;
				AddPlayer1DateLabel();
				AddEquipButton();
				Main.ResetFrame();
				}
			});
		SelectUser2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Main.Gone.remove(GoPanel);
				Main.ResetFrame();
				SelectionUser = 2;
				AddPlayer2DateLabel();
				AddEquipButton();
				Main.ResetFrame();
				}
			});
		SelectUser3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Main.Gone.remove(GoPanel);
				SelectionUser = 3;
				AddPlayer3DateLabel();
				AddEquipButton();
				Main.ResetFrame();
			}
		});
		//初期化ボタンのアクションリステナー。すべての変数とパネルを初期化し、取り除かれた装備などを再選択できるようにする。
		AllRefl.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				AllReset();
			}
		});
		
		//決定ボタンのアクションリステナー。
		//プレイヤー全員の装備が選択されている場合のみ稼働し、バトルクラスへプレイヤーデータを提供する。
		//ただし、戻るが選択された場合は決定できない。
		FinalEnter.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(Selected0 == 1 && Selected1 == 1 && Selected2 == 1 && Selected3 ==1){
					Main.battle.date(AllPower0, AllPower1, AllPower2, AllPower3);
					Main.ResetFrame();
				}
				else{
					Main.MainFrame.setTitle("全員分の装備を選んでください。");
				}
			}
		});
		
	}
	
	void Gone(){
		//セレクトクラスのプレイヤーデータをGoクラスの変数に代入する。
		Main.SelectionDate();
		SelectPlayer0=Main.User0Name;
		Power0 = Main.User0Power;
		SelectPlayer1=Main.User1Name;
		Power1 = Main.User1Power;
		SelectPlayer2=Main.User2Name;
		Power2 = Main.User2Power;
		SelectPlayer3=Main.User3Name;
		Power3 = Main.User3Power;

		//これから扱うデータをすべてリセットする。
		AllReset();
		
		AllPower();
	}
}
