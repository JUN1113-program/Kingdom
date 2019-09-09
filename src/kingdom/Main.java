package kingdom;
import java.awt.CardLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame{
	static JFrame MainFrame = new JFrame();
	static String TitleName = ("王様キングダム");
	static JPanel MainPanel = new JPanel();
	static CardLayout card = new CardLayout();
	
	//openに関する宣言
	static Opening open = new Opening();
	
	//Battleに関する宣言
	static Battle battle = new Battle();
	
	//Dropに関する宣言
	static Drop drop = new Drop();
	
	//Selectに関する宣言
	static Select select = new Select();
	static int User0Power = select.User0;
	static int User1Power = select.User1; 
	static int User2Power = select.User2; 
	static int User3Power = select.User3;
	static String User0Name = "";
	static String User1Name = "";
	static String User2Name = "";
	static String User3Name = "";
	static JPanel SelectionPanel = new JPanel();
	
	//Goに関する宣言
	static Go go = new Go();
	static JPanel Gone = new JPanel();
	
	//SunMoonに関する宣言
	static SunMoon SunMoonPanel = new SunMoon();
	
	//Reportに関する宣言
	static JPanel ReportMainPanel = new JPanel();
	static Report report = new Report();
	
	//Endingに関する宣言
	static Ending end = new Ending();
	
	
	//Frameを一度真っ白にして、含まれているコンポーネントを表示する。その後Frameを再描写する。
	static void ResetFrame(){
		MainFrame.invalidate();             
		MainFrame.validate();
		MainFrame.repaint();
	}
	
	//Selectメソッドから使用され、Selectメソッドで選択したプレイヤーデータを保存する。
	static void SelectionDate(){
		User0Power = select.User0;
		User1Power = select.User1; 
		User2Power = select.User2; 
		User3Power = select.User3; 
		User0Name = select.UserPlayer0;
		User1Name = select.UserPlayer1;
		User2Name = select.UserPlayer2;
		User3Name = select.UserPlayer3;
	}
	
	Main(){
		MainFrame.setTitle(TitleName);
		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainFrame.setSize(700,400);
		MainFrame.setVisible(true);
		MainFrame.getContentPane().add(MainPanel);
		
		MainPanel.setLayout(card);
		MainPanel.add(open.OpeningPanel,"Open");

		SelectionPanel.setLayout(new GridLayout(1,2));
		MainPanel.add(SelectionPanel,"Select");
		SelectionPanel.add(select.SelectLabel);
		SelectionPanel.add(select.SelectPanel);
		
		Gone.setLayout(new GridLayout(1,2));
		Gone.add(go.GoPanel);
		MainPanel.add(Gone,"Go");
		
		MainPanel.add(ReportMainPanel,"Report");

		MainPanel.add(end.EndPanel,"End");

		SunMoonPanel.setLayout(new GridLayout(1,1));
		MainPanel.add(SunMoonPanel,"SunMoon");
		SunMoonPanel.animation();
	}
	

	
	public static void main(String[]args){
		new Main();
	}

}
