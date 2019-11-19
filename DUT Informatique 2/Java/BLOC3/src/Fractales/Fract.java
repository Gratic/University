package Fractales;

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
		//triangle(100,300,100,80,50,70);
		//sierpinski(7, 300,100,100,400,500,300);
		//koch(5, 0,300, 600,300);
		flake(5, 400, 100, 200, 100);
		flake(5, 200, 100, 350, 300);
		flake(5, 350, 300, 400, 100);

	}

	public void koch(int count, int x1, int y1, int x2, int y2) {
		if(count > 0)
		{
			int vecx = (x2 - x1);
			int vecy = (y2 - y1);

			int normx = vecy;
			int normy = -vecx;

			int cx = x1 + vecx/3;
			int cy = y1 + vecy/3;

			int ex = x1 + 2 * vecx/3;
			int ey = y1 + 2 * vecy/3;

			int dx = (x1 + x2) / 2 + normx / 3;
			int dy = (y2 + y1) / 2 + normy / 3;

			line(x1, y1, cx, cy, Color.BLACK);
			line(cx, cy, dx, dy, Color.BLACK);
			line(dx, dy, ex, ey, Color.BLACK);
			line(ex, ey, x2, y2, Color.BLACK);
			//line(x1, y1, x2, y2, Color.RED);

			koch(count - 1, cx, cy, dx, dy);
			koch(count - 1, dx, dy, ex, ey);
		}
	}

	public void flake(int count, int xa, int ya, int xb, int yb) {
		if(count > 0)
		{
			int xv = xb-xa;
			int yv = yb-ya;

			int xc = xa+xv/3;
			int yc = ya+yv/3;
			int xe = xa+2*xv/3;
			int ye = ya+2*yv/3;

			int xvp = -yv;
			int yvp = xv;
			int xdp = xa+xv/2;
			int ydp = ya+yv/2;
			int xd = xdp + xvp/3;
			int yd = ydp+yvp/3;

			flake(count - 1, xa, ya, xc, yc);
			flake(count - 1, xc, yc, xd, yd);
			flake(count - 1, xd, yd, xe, ye);
			flake(count - 1, xe, ye, xb, yb);
		}
		else
		{
			line(xa,ya, xb,yb, Color.BLACK);
		}
	}

	public void sierpinski(int compteur, int x1, int y1, int x2, int y2, int x3, int y3) {
		if(compteur > 0)
		{
			line(x1, y1, x2, y2, Color.BLACK);
			line(x1, y1, x3, y3, Color.BLACK);
			line(x3, y3, x2, y2, Color.BLACK);

			sierpinski(compteur-1, (x2+x1)/2, (y2+y1)/2,(x3+x1)/2, (y3+y1)/2, x1, y1);
			sierpinski(compteur-1, (x3+x1)/2, (y3+y1)/2,(x3+x2)/2, (y3+y2)/2, x3, y3);
			sierpinski(compteur-1, (x2+x3)/2, (y2+y3)/2,(x2+x1)/2, (y2+y1)/2, x2, y2);
		}
	}

	public void triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		line(x1, y1, x2, y2, Color.BLACK);
		line(x1, y1, x3, y3, Color.BLACK);
		line(x3, y3, x2, y2, Color.BLACK);
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
