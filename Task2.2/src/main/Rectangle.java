package main;

import java.util.Scanner;

/**Class of Rectangular
 * @author mikhail.rybalko
 *
 */
public class Rectangle{
	private Point a;
	private Point b;
	private Point c;
	private Point d;
	private int l;
	private int h;
	
	
	public void setFigure(Point p){  	//constructor of new Rectangular object
		System.out.println("Enter lenghth and height of rectangle");
		Scanner in = new Scanner(System.in); 	// Enter length and height of Rectangular
		String temp = in.nextLine();
		String[] data = temp.trim().split(" ");
		this.l = Integer.parseInt(data[0]);
		this.h = Integer.parseInt(data[1]);
		a = new Point(p.getPointX(), p.getPointY());	 // Create points for Rectangular
		b = new Point(p.getPointX(), h);
		c = new Point(l, h);
		d = new Point(l, p.getPointY());
	}
	
	
	public void print(){ 	// print Rectangle coordinates
		System.out.println("Rectangle coordinates:");
		System.out.println("a(" + a.getPointX() + ", " + a.getPointY() + ") b(" + b.getPointX() + ", " + b.getPointY() + ") c(" + c.getPointX() + ", " + c.getPointY() + ") d(" + d.getPointX() + ", " + d.getPointY() + ")");
		System.out.println();
	}
	
	
	public int showPerimeter() {	// calculate Rectangle perimeter
		return this.l*2+this.h*2;
	}

	
	public void move(Point p) {		// move Rectangle to new point
		this.a = p;
		this.b.setPointX(p.getPointX());
		this.b.setPointY(p.getPointY()+this.h);
		this.c.setPointX(p.getPointX()+this.l);
		this.c.setPointY(p.getPointY()+this.h);
		this.d.setPointX(p.getPointX()+this.l);
		this.d.setPointY(p.getPointY());
	}

	public boolean isInside(Point p) {	// check locating point in figure
		boolean in = false;
		if ((p.getPointX()<=c.getPointX())&&(p.getPointX()>=a.getPointX())&&(p.getPointY()>=a.getPointY())&&(b.getPointY()>=p.getPointY())){
			in = true;
		}		
		return in;
	}
}
