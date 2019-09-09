package kingdom;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Opening{
	JPanel OpeningPanel = new JPanel();
	JLabel TitleLabel = new JLabel("王様キングダム");
	JButton OpenButton = new JButton("本編へ");
	
	Opening(){
		TitleLabel.setFont(new Font(Font.DIALOG, Font.PLAIN, 32));
		TitleLabel.setHorizontalAlignment(JLabel.CENTER);
		OpenButton.setContentAreaFilled(false);
		OpeningPanel.setLayout(new GridLayout(2,1));
		OpeningPanel.add(TitleLabel);
		OpeningPanel.add(OpenButton);
		Main.MainFrame.getContentPane().add(OpeningPanel);
		
		OpenButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Main.card.show(Main.MainPanel,"Select");
				Main.ResetFrame();
			}
		});
	}
}
