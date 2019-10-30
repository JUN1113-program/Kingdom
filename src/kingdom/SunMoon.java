package kingdom;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

public class SunMoon extends JPanel {
	Image moon;
	Image sun;
	Image Rking0;
	Image Rking1;
	Image Rking2;
	Image Lking0;
	Image Lking1;
	Image Lking2;
	
	int xmoon = 100;
	int ymoon = 100;
	int xsun = 100;
	int ysun = 100;
	int xking = 0;
	int king = 0;
	int RL =0;
	int width=0;
	double C=0;
	int i =0;
	int ac = 1;
	
	JButton acButton = new JButton("");
	SunMoon(){
		sun = getToolkit().getImage("date/sun.png");
		moon = getToolkit().getImage("date/moon.png");
		Rking0 = getToolkit().getImage("date/Left_King0.png");
		Rking1 = getToolkit().getImage("date/Left_King1.png");
		Rking2 = getToolkit().getImage("date/Left_King2.png");
		Lking0 = getToolkit().getImage("date/Right_King0.png");
		Lking1 = getToolkit().getImage("date/Right_King1.png");
		Lking2 = getToolkit().getImage("date/Right_King2.png");
		
		acButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				ac++;
			}
		});
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
	    g.setColor(getBackground());	
	    Dimension d = Main.MainFrame.getSize();
	    g.fillRect(0,0,d.width,d.height);
		g.drawImage(sun, xsun, ysun, this);
		g.drawImage(moon,xmoon,ymoon, this);

		if(RL == 0){
			if(king%4 == 0){
				g.drawImage(Rking0,d.width-king,d.height-160,this);
				}
			else if(king%4 == 1){
				g.drawImage(Rking1,d.width-king,d.height-160,this);
				}
			else if(king%4 == 2){
				g.drawImage(Rking0,d.width-king,d.height-160,this);
				}
			else if(king%4 == 3){
				g.drawImage(Rking2,d.width-king,d.height-160,this);
				}
			}
		else if(RL == 1){
			if(king%4 == 0){
				g.drawImage(Lking0,king,d.height-160,this);
				}
			else if(king%4 == 1){
				g.drawImage(Lking1,king,d.height-160,this);
				}
			else if(king%4 == 2){
				g.drawImage(Lking0,king,d.height-160,this);
				}
			else if(king%4 == 3){
				g.drawImage(Lking2,king,d.height-160,this);
				}
			}
		}
	void animation(){
		//透明化したボタンを配置し、押される度にアニメーションの再生速度を上昇させる。（MAC上では正常に動作せず。）
		new OverlayLayout(Main.SunMoonPanel);
		acButton.setBounds(getWidth(),0,30,30);
		Main.SunMoonPanel.add(acButton,"ac");
		acButton.setContentAreaFilled(false);
		acButton.setOpaque(false);
		acButton.setBorderPainted(false);
	
		for(i=5;;i++){
			if(i==2){
				Main.card.show(Main.MainPanel,"Report");
			}
		    Dimension d = Main.MainFrame.getSize();
		    width = d.width;
		    RL=0;
			for(king=0;king<width;C=C+0.2,king++){
				try{
					Thread.sleep(10/ac);
					xsun = (int) Math.round(Math.cos(Math.toRadians(C))*200);
					ysun = (int) Math.round(Math.sin(Math.toRadians(C))*200);
					xmoon = (int) -Math.round(Math.cos(Math.toRadians(C))*200);
					ymoon = (int) -Math.round(Math.sin(Math.toRadians(C))*200);
					repaint();
				}catch(Exception e){
					System.err.println(e);
					System.exit(0);
				}
				
			}
			RL=1;
			for(king =0;king<width;C=C+0.2,king++){
				try{
					Thread.sleep(10/ac);
					xsun = (int) Math.round(Math.cos(Math.toRadians(C))*200);
					ysun = (int) Math.round(Math.sin(Math.toRadians(C))*200);
					xmoon = (int) -Math.round(Math.cos(Math.toRadians(C))*200);
					ymoon = (int) -Math.round(Math.sin(Math.toRadians(C))*200);
					repaint();
				}catch(Exception e){
					System.err.println(e);
					System.exit(0);
				}
			}
		}
		
	}

}