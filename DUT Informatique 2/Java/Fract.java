package bloc3.fractales;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fract extends JFrame implements ActionListener {


	
	//-----------------------------------------------------------------
	
	/**
	 * Taille de la fenêtre
	 */
	private int w = 600;
	private int h = 500;
	
	
	public void start() {
	

		
	}
	
	
	
	
	
	//----------------------------------------------------------------
	


	
	/**
	 * A PARTIR D'ICI, PAS TOUCHER !
	 */
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
	private static final long serialVersionUID = 1L;
	JPanel panel;
	
	class Line extends JComponent {
		private static final long serialVersionUID = 1L;
		private Color color;
		private int x1, y1, x2, y2;
		private int w = 2;
		public Line(int x1,int y1,int x2,int y2, Color color) {
			this.color = color;
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
			this.setBounds(Math.min(x1,x2)-w/2,Math.min(y1,y2)-w/2,w+Math.abs(x2-x1),w+Math.abs(y2-y1));
		}
		public void paintComponent(Graphics gr) {
			Graphics2D g = (Graphics2D)gr;
			g.setRenderingHint(
				    RenderingHints.KEY_ANTIALIASING,
				    RenderingHints.VALUE_ANTIALIAS_ON);
			g.setStroke(new BasicStroke(w, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL));
			g.setColor(this.color);
			if (x1<x2)
				if (y1<y2)
					g.drawLine(w/2,w/2,this.getWidth()-w/2, this.getHeight()-w/2);
				else
					g.drawLine(w/2,this.getHeight()-w/2-1,this.getWidth()-w/2-1, w/2);
			else
				if (y1<y2)
					g.drawLine(this.getWidth()-w/2-1, w/2, w/2, this.getHeight()-w/2);
				else
					g.drawLine(this.getWidth()-w/2-1, this.getHeight()-w/2-1, w/2, w/2);
		}
	}

	public void line(int x1,int y1,int x2,int y2, Color color) {
		Line line = new Line(x1,y1,x2,y2,color);
		panel.add(line);
		panel.updateUI();
	}
	
	public Fract() {
		this.setBounds(10, 10, w, h);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getRootPane().setLayout(new BorderLayout());
		this.setTitle("M3103 - Fractales");
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		this.getRootPane().add(panel);

		start();
		this.setVisible(true);	
	}
	
	
	public static void main(String[] args) {
		new Fract();
	}


}
