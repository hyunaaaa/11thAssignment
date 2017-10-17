import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Drawing {
	public static void main(String[] args){
		JFrame f = new JFrame("�׷��� ���� ���α׷�");
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
		int[] y={150, 200, 200, 150}; //drawpolyline�� ���� ��ǥ��
		super.paintComponent(g);
		
		g.drawLine(50, 50, 100, 100); //����
		g.drawString("drawLine()", 50, 120);
		g.drawPolyline(x, y, 4); //����
		g.drawString("drawPolyLine()", 50, 220);
		g.drawRect(150, 50, 50, 50); //�簢��
		g.drawString("drawRect()", 150, 120);
		g.fillRect(150, 150, 50, 50);//ä���� �簢��
		g.drawString("fillRect()", 150, 220);
		g.clearRect(150, 250, 50, 50); //�� �簢��
		g.drawString("clearRect()", 150, 320);
		g.draw3DRect(250, 50, 50, 50, true);//3���� �簢��
		g.drawString("draw3DRect()", 250, 120);
		g.fill3DRect(250, 150, 50, 50, true);//ä���� 3���� �簢��
		g.drawString("fill3DRect()", 250, 220);
		g.drawRoundRect(350, 50, 100, 50, 50, 50); //�ձ� �簢��
		g.drawString("drawRoundRect()", 350, 120);
		g.fillRoundRect(350, 150, 100, 50, 50, 50);//ä���� �ձ� �簢��
		g.drawString("fillRoundRect()", 350, 220);
		g.drawOval(500, 50, 50, 50); //Ÿ��
		g.drawString("drawOval()", 500, 120);
		g.fillOval(500, 150, 50, 50); //ä���� Ÿ��
		g.drawString("fillOval()", 500, 220);
		g.drawArc(600, 50, 50, 50, 50, 50);//ȣ
		g.drawString("drawArc()", 600, 120);
		g.fillArc(600, 150, 50, 50, 50, 50);//ä���� ȣ
		g.drawString("fillArc()", 600, 220);
	}
}