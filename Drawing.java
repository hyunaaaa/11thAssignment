import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Drawing {
	public static void main(String[] args){
		JFrame f = new JFrame("그래픽 기초 프로그램");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new MyPanel2());
		f.setSize(500,400);
		f.setVisible(true);
	}
}

class MyPanel2 extends JPanel{
	public MyPanel2(){
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	protected void paintComponent(Graphics g){
		int[] x={150, 250, 350};
		int[] y={250, 250, 300};
		super.paintComponent(g);
		g.drawRect(50, 50, 50, 50);
		g.fillRect(150, 50, 50, 50);//채워진 사각형
		g.draw3DRect(250, 50, 50, 50, true);
		g.fill3DRect(350, 50, 50, 50, true);
		g.drawRoundRect(50,150, 100, 50, 50, 50);
		g.drawOval(200, 150, 50, 50);
		g.fillOval(300, 150, 50, 50);
		g.drawLine(50, 250, 100, 250);
		g.drawPolyline(x, y, 3);
	}
}