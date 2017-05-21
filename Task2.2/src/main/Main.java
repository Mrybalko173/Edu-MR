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
		
		Rect rec = new Rect();
		rec.setFigure();
		rec.print();
		rec.move(m.movePoint());
		rec.print();
		rec.isInside(m.inSearch());
		System.out.println("Perimeter this figure is " + rec.showPerimeter());
		
		Square sq = new Square();
		sq.setFigure();
		sq.print();
		sq.move(m.movePoint());
		sq.print();
		sq.isInside(m.inSearch());
		System.out.println("Perimeter this figure is " + sq.showPerimeter());
		
		Circle cir = new Circle();
		cir.setFigure();
		cir.print();
		cir.move(m.movePoint());
		cir.print();
		cir.isInside(m.inSearch());
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
}
