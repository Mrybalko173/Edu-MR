package main;

import java.util.ArrayList;

public class Tower {
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	public Tower() throws Exception{
		this.mTower();
	}
	
	
	public void mTower() throws Exception{ //Create empty tower
		int n = Main.n;
		for (int i = 1; i<=n; i++) {
			this.list.add(0);
		}
	}
	
	public int getArray(int i){ //Getter of this class
		
		return this.list.get(i);
	} 
	
	public void setArray(int i, int j){ //Setter of this class
		
		this.list.set(i, j);
	}

	public static void fTower(Tower y) throws Exception{ //Create first full tower
		int n = Main.n;
		for (int i = 1; i<=n; i++) {
			y.setArray(i-1, i);
		}
	}
}
