package main;

public class Main {
	static int n;
	//static ArrayList<Integer> listA;
	//static ArrayList<Integer> listB;
	//static ArrayList<Integer> listC;
	static Tower a;
	static Tower b;
	static Tower c;
	
	public static void main(String[] args) throws Exception {
		System.out.println("Let's start this game! Please, enter value of elements in first tower");
		n = Input.input();
		a = new Tower();
		b = new Tower();
		c = new Tower();
		Tower.fTower(a);
		//listA = new ArrayList<Integer>();
		//listB = new ArrayList<Integer>();
		//listC = new ArrayList<Integer>();
		Print.print();
		
		Game.doTowers(n, a, b, c);
		//Print.print();
	}

}
