package main;

public class Point {
	private int x;
	private int y;
	 public Point(){
		 
	 }
	 
	 public Point(int x, int y){
		 this.x = x;
		 this.y = y;
	 }
	 
	 public void setPointX(int x){
		 this.x = x;
	 }
	 
	 public void setPointY(int y){
		 this.y = y;
	 }
	 
	 public void setPoint(int x, int y){
		 this.x = x;
		 this.y = y;
	 }
	 
	 public int getPointX(){
		 return this.x;
	 }
	 
	 public int getPointY(){
		 return this.y;
	 }
}
