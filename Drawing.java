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
		f.setSize(700,400);
		f.setVisible(true);
	}
}

class MyPanel2 extends JPanel{
	public MyPanel2(){
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	protected void paintComponent(Graphics g){
		int[] x={50, 100, 50, 100};
		int[] y={150, 200, 200, 150}; //drawpolyline을 위한 좌표들
		super.paintComponent(g);
		
		g.drawLine(50, 50, 100, 100); //직선
		g.drawString("drawLine()", 50, 120);
		g.drawPolyline(x, y, 4); //직선
		g.drawString("drawPolyLine()", 50, 220);
		g.drawRect(150, 50, 50, 50); //사각형
		g.drawString("drawRect()", 150, 120);
		g.fillRect(150, 150, 50, 50);//채워진 사각형
		g.drawString("fillRect()", 150, 220);
		g.clearRect(150, 250, 50, 50); //빈 사각형
		g.drawString("clearRect()", 150, 320);
		g.draw3DRect(250, 50, 50, 50, true);//3차원 사각형
		g.drawString("draw3DRect()", 250, 120);
		g.fill3DRect(250, 150, 50, 50, true);//채워진 3차원 사각형
		g.drawString("fill3DRect()", 250, 220);
		g.drawRoundRect(350, 50, 100, 50, 50, 50); //둥근 사각형
		g.drawString("drawRoundRect()", 350, 120);
		g.fillRoundRect(350, 150, 100, 50, 50, 50);//채워진 둥근 사각형
		g.drawString("fillRoundRect()", 350, 220);
		g.drawOval(500, 50, 50, 50); //타원
		g.drawString("drawOval()", 500, 120);
		g.fillOval(500, 150, 50, 50); //채워진 타원
		g.drawString("fillOval()", 500, 220);
		g.drawArc(600, 50, 50, 50, 50, 50);//호
		g.drawString("drawArc()", 600, 120);
		g.fillArc(600, 150, 50, 50, 50, 50);//채워진 호
		g.drawString("fillArc()", 600, 220);
	}
}