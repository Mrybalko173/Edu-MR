package main;

import java.util.Scanner;

/**Class of Circle
 * @author mikhail.rybalko
 *
 */
public class Circle extends Rectangle {
	private Point a;
	private	int r;
	
	@Override
	public void setFigure(Point p) {	//constructor of new circle object
		System.out.println("Enter lenghth and hight of square");
		Scanner in = new Scanner(System.in);	// Enter radius of circle
		String temp = in.nextLine();
		String[] data = temp.trim().split(" ");
		this.r = Integer.parseInt(data[0]);
		a = new Point(p.getPointX(), p.getPointY());	// Create point for circle
	}
	
	@Override
	public void print() {	// print circle coordinates
		System.out.println("Circle center point and radius:");
		System.out.println("Center point: (" + a.getPointX() + ", " + a.getPointY() + ") radius = " + r);
		System.out.println();
	}
	
	@Override
	public int showPerimeter() {	// calculate circle perimeter
		double p = this.r*Math.PI*2;
		return (int) p;
	}
	
	@Override
	public void move(Point p) {		// move circle to new point
		this.a = p;
	}
	
	@Override
	public boolean isInside(Point p) {	// check locating point in figure
		double l = Math.sqrt(Math.pow((p.getPointX()-this.a.getPointX()), 2) + Math.pow(p.getPointY()-this.a.getPointY(), 2));
		boolean in = false;
		if (l<=r){
			in = true;
		}
		return in;
	}
	
	public void boundingBox(){
		Rectangle  rec = new Rectangle();
		rec.a = new Point(this.a.getPointX() - this.r, this.a.getPointY() - this.r);
		rec.b = new Point(this.a.getPointX() - this.r, this.a.getPointY() + this.r);
		rec.c = new Point(this.a.getPointX() + this.r, this.a.getPointY() + this.r);
		rec.d = new Point(this.a.getPointX() + this.r, this.a.getPointY() - this.r);
		rec.print();
	}
	
	
}
