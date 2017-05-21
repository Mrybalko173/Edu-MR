package main;
/**Class of Rectangular
 * @author mikhail.rybalko
 *
 */
public class Rect extends ObjStart {
	Point a;
	Point b;
	Point c;
	int l;
	double n;
	int h;
	
	@Override
	public void setFigure(){
		
		l = 4;
		n = l*Math.sqrt(3)/3;
		h = (int) n;
		a = new Point(0, 0);
		b = new Point(l/2, h);
		c = new Point(l, 0);
	}
	
	@Override
	public void print(){
		System.out.println("Rectangle coordinates:");
		System.out.println("a(" + a.getPointX() + ", " + a.getPointY() + ") b(" + b.getPointX() + ", " + b.getPointY() + ") c(" +  + c.getPointX() + ", " + c.getPointY() + ")");
	}
	
	@Override
	public int showPerimeter() {
		return this.l*3;
	}

	@Override
	public void move(Point p) {
		this.a = p;
		this.b.setPointX(p.getPointX()+this.b.getPointX());
		this.b.setPointY(p.getPointY()+this.b.getPointY());
		this.c.setPointX(p.getPointX()+this.c.getPointX());
		this.c.setPointY(p.getPointY()+this.c.getPointY());
	}

	@Override
	public void isInside(Point p) {
		if ((p.getPointX()<=c.getPointX())&&(p.getPointX()>=a.getPointX())&&(p.getPointY()>=a.getPointY())&&(b.getPointY()>=p.getPointY())){
			System.out.println("This point inside this figure");
		}
		else {
			System.out.println("This point outside this figure");
		}
		
	}
}
