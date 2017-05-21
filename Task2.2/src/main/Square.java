package main;
/**Class of Square
 * @author mikhail.rybalko
 *
 */
public class Square extends ObjStart{
	Point a;
	Point b;
	Point c;
	Point d;
	int l;
	double n;
	int h;
	
	@Override
	public void setFigure(){
		
		l = 4;
		n = l*Math.sqrt(3)/3;
		h = (int) n;
		a = new Point(0, 0);
		b = new Point(0, l);
		c = new Point(l, l);
		d = new Point(l, 0);
	}
	
	@Override
	public void print(){
		System.out.println("Square coordinates:");
		System.out.println("a(" + a.getPointX() + ", " + a.getPointY() + ") b(" + b.getPointX() + ", " + b.getPointY() + ") c(" + c.getPointX() + ", " + c.getPointY() + ") d(" +  d.getPointX() + ", " + d.getPointY() + ")");
	}
	
	@Override
	public int showPerimeter() {
		return this.l*4;
	}

	@Override
	public void move(Point p) {
		this.a = p;
		this.b.setPointX(p.getPointX()+this.b.getPointX());
		this.b.setPointY(p.getPointY()+this.b.getPointY());
		this.c.setPointX(p.getPointX()+this.c.getPointX());
		this.c.setPointY(p.getPointY()+this.c.getPointY());
		this.d.setPointX(p.getPointX()+this.d.getPointX());
		this.d.setPointY(p.getPointY()+this.d.getPointY());
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
