package main;

import java.util.Scanner;

/**Class of Square
 * @author mikhail.rybalko
 *
 */
public class Square{
	private Point a;
	private Point b;
	private Point c;
	private Point d;
	private int l;
	
	public void setFigure(Point p){  	//constructor of new Square object
		System.out.println("Enter lenghth and hight of square");
		Scanner in = new Scanner(System.in); 	// Enter length of square
		String temp = in.nextLine();
		String[] data = temp.trim().split(" ");
		this.l = Integer.parseInt(data[0]);
		a = new Point(p.getPointX(), p.getPointY()); 	// Create points for square
		b = new Point(p.getPointX(), l);
		c = new Point(l, l);
		d = new Point(l, p.getPointY());
	}
	
	
	public void print(){ 	// print square coordinates
		System.out.println("Square coordinates:");
		System.out.println("a(" + a.getPointX() + ", " + a.getPointY() + ") b(" + b.getPointX() + ", " + b.getPointY() + ") c(" + c.getPointX() + ", " + c.getPointY() + ") d(" +  d.getPointX() + ", " + d.getPointY() + ")");
		System.out.println();
	}
	
	
	public int showPerimeter() { 	// calculate square perimeter
		return this.l*4;
	}

	
	public void move(Point p) { 	// move square to new point
		this.a = p;
		this.b.setPointX(p.getPointX());
		this.b.setPointY(p.getPointY()+this.l);
		this.c.setPointX(p.getPointX()+this.l);
		this.c.setPointY(p.getPointY()+this.l);
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
