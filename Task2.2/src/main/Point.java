package main;
/**Class for Point Object
 * @author mikhail.rybalko
 *
 */
public class Point {
	private int x;
	private int y;
	
	public Point(){					// default constructor
		 
	}
	 
	public Point(int x, int y){		// constructor with coordinates of point
		 this.x = x;
		 this.y = y;
	}
	 
	public void setPointX(int x){	// set coordinate x for point
		 this.x = x;
	}
	 
	public void setPointY(int y){	// set coordinate Y for point
		 this.y = y;
	}
	 
	public void setPoint(int x, int y){	// set coordinate x and y for point
		 this.x = x;
		 this.y = y;
	}
	 
	public int getPointX(){			// get coordinate x of point
		 return this.x;
	}
	 
	public int getPointY(){			// set coordinate x of point
		 return this.y;
	}
}
