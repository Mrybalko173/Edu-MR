package main;

public class Game {
	 public static void doTowers(int topN, Tower from, Tower inter, Tower to) throws Exception
			 {
		 		
			 	if(topN==1) {
			 		//System.out.println("Disk 1 from " + from + " to "+ to);
			 		step(topN, from, to);
			 		
			 	}
			 	else	{
			 		
			 		doTowers(topN-1, from, to, inter); // from-->inter
			 		
			 		//System.out.println("Disk " + topN + " from " + from + " to "+ to);
			 		
			 		doTowers(topN-1, from, inter, to); // inter-->to
			 		doTowers(topN-1, inter, from, to);
			 	}
			 }
	 
	 public static void step(int i, Tower from, Tower to) {
		 //Tower fr = from;
		 //Tower t = to;
		 int indF = topInd(from);
		 int indT = topInd(to);
		 int buff = from.getArray(indF);
		 from.setArray(indF, Main.n+1);
		 to.setArray(indT, buff);
		 Print.print();
		 System.out.println("Top index A = " + indF);
		 System.out.println("Top index C = " + indT);
	 }
	 
	 public static int topInd(Tower s){
		int i=0;
		/*while (i<Main.n) {
			 if (s.getArray(i)==Main.n+1) {
				 i++;
			 }
			 else break;
			 //i++;
		}*/
		 
		 for (int j=0; j<Main.n; j++) {
			 if (s.getArray(j)==Main.n+1) {
				 i=j;
			 }
			 else break;
			 
		 }

		
		if (i==Main.n) {
			i--;
		}		 
		return i;
	 }
}
