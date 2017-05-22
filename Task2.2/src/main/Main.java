package main;

import java.util.Scanner;
/**Main class
 * @author mikhail.rybalko
 *
 */
public class Main {
	
	Scanner in;
	
	public static void main(String[] args){
		Main m = new Main();
		
		Rectangle  rec = new Rectangle ();
		rec.setFigure(m.enterZeroPoint());
		rec.print();
		System.out.println("Perimeter this figure is " + rec.showPerimeter());
		rec.move(m.movePoint());
		rec.print();
		m.showIsInside(rec.isInside(m.inSearch()));
		
		Square sq = new Square();
		sq.setFigure(m.enterZeroPoint());
		sq.print();
		sq.move(m.movePoint());
		sq.print();
		m.showIsInside(sq.isInside(m.inSearch()));
		System.out.println("Perimeter this figure is " + sq.showPerimeter());
		
		Circle cir = new Circle();
		cir.setFigure(m.enterZeroPoint());
		cir.print();
		cir.move(m.movePoint());
		cir.print();
		m.showIsInside(cir.isInside(m.inSearch()));
		System.out.println("Perimeter this figure is " + cir.showPerimeter());
		cir.boundingBox();
	}
	
	public Point movePoint(){ // method for get coordinate point to move
		System.out.println("Enter new zero point for figure");
		this.in = new Scanner(System.in);
		String temp = in.nextLine();
		String[] data = temp.trim().split(" ");
		int a = Integer.parseInt(data[0]);
		int	b = Integer.parseInt(data[1]);
		Point p = new Point(a, b);
		return p;
	}
	
	public Point inSearch(){ // method for get coordinate point to check 
		System.out.println("Enter point coordinate, which you want to check");
		this.in = new Scanner(System.in);
		String temp = in.nextLine();
		String[] data = temp.trim().split(" ");
		int a = Integer.parseInt(data[0]);
		int	b = Integer.parseInt(data[1]);
		Point p = new Point(a, b);
		return p;
	}
	
	public void showIsInside(boolean b){ // show info about searching point
		if (b){
			System.out.println("This point inside this figure");
		}
		else {
			System.out.println("This point outside this figure");
		}
	}
	
	public Point enterZeroPoint(){	// enter start point for figure 
		System.out.println("Enter coordinat of figure start point");
		Point p = new Point();
		this.in = new Scanner(System.in);
		String temp = in.nextLine();
		String[] data = temp.trim().split(" ");
		p.setPoint(Integer.parseInt(data[0]), Integer.parseInt(data[1]));
		return p;
	}
}
