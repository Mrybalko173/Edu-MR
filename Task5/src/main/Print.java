package main;

public class Print {
	
	private static int q = Main.n +1; 
	public static void print(){
		System.out.println("___________________________________________________________________");
		for (int i=0; i < Main.n; i++) {
			System.out.println(" ");
			printElA(i);
			System.out.print("   ");
			printElB(i);
			System.out.print("   ");
			printElC(i);
		}
		System.out.println("---  ---  ---");
		System.out.println(" A    B    C");
		System.out.println("___________________________________________________________________");
	}

	static private void printElA(int i){
		if (Main.a.getArray(i) == q) {
			System.out.print(" |");
		}
		else {
			System.out.print(" " + Main.a.getArray(i));
		}	
	}
	
	static private void printElB(int i){
		if (Main.b.getArray(i) == q) {
			System.out.print(" |");
		}
		else {
			System.out.print(" " + Main.b.getArray(i));
		}	
	}
	
	static private void printElC(int i){
		if (Main.c.getArray(i) == q) {
			System.out.println(" |");
		}
		else {
			System.out.println(" " + Main.c.getArray(i));
		}	
	}
}
