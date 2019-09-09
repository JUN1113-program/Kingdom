package kingdom;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ending extends JPanel{
	JPanel EndPanel = new JPanel();
	JLabel EndLabel = new JLabel();
	JLabel ClearLabel0 = new JLabel();
	JLabel ClearLabel1 = new JLabel();
	JLabel ClearLabel2 = new JLabel();
	JLabel ClearLabel3 = new JLabel();
	JButton button = new JButton();
	
	Ending(){
		EndPanel.setLayout(new GridLayout(3,1));
		EndPanel.add(EndLabel);
		EndPanel.add(button);
		EndPanel.add(ClearLabel0);
		EndPanel.add(ClearLabel1);
		EndPanel.add(ClearLabel2);
		EndPanel.add(ClearLabel3);
		
		button.setText("Go Back Opening");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Main.card.show(Main.MainPanel,"Open");
				if(Main.report.RPGEnd == 1){
					System.exit(1);
				}
			}
		});
		EndLabel.setText("<html>Thank you for Playing！ <br>");
		
	}
	
	void End(){
		if(Main.report.RPGEnd == 1){
			EndLabel.setText("BadEnd");
		} 
		ClearLabel0.setText("<html>"+Main.go.SelectPlayer0+"<br>強さ："+Main.go.AllPower0+"<br>装備："+Main.go.SelectEquip0);
		ClearLabel1.setText("<html>"+Main.go.SelectPlayer1+"<br>強さ："+Main.go.AllPower1+"<br>装備："+Main.go.SelectEquip1);
		ClearLabel2.setText("<html>"+Main.go.SelectPlayer2+"<br>強さ："+Main.go.AllPower2+"<br>装備："+Main.go.SelectEquip2);
		ClearLabel3.setText("<html>"+Main.go.SelectPlayer3+"<br>強さ："+Main.go.AllPower3+"<br>装備："+Main.go.SelectEquip3);
		Main.ResetFrame();
	}
}
