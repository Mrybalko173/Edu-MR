package main;
/**Class of Circle
 * @author mikhail.rybalko
 *
 */
public class Circle extends Square{
	Point a;
	int r;
	
	@Override
	public void setFigure() {
		a = new Point(0, 0);
		r = 4;
	}
	@Override
	public void print() {
		System.out.println("Circle center point and radius:");
		System.out.println("Center point: (" + a.getPointX() + ", " + a.getPointY() + ") radius = " + r);
	}
	@Override
	public int showPerimeter() {
		double p = this.r*3.14*2;
		return (int) p;
	}
	@Override
	public void move(Point p) {
		this.a = p;
	}
	@Override
	public void isInside(Point p) {
		double l = Math.sqrt(Math.pow((p.getPointX()-this.a.getPointX()), 2) + Math.pow(p.getPointY()-this.a.getPointY(), 2));
		if (l<=r){
			System.out.println("This point inside this figure");
		}
		else {
			System.out.println("This point outside this figure");
		}
	}
	
	public void boundingBox(){
		Rect rec = new Rect();
		rec.a = new Point(this.r, this.a.getPointX());
		double l = 2*r*Math.cos(0.52);
		double h = Math.cos(0.52)*this.l - r;
		rec.b = new Point((int) -l/2, (int) -h);
		rec.c = new Point((int) l/2, (int) -h);
		rec.print();
	}
	
	
}
