package main;

public class Game {
	static int counter = 0;
	 public static void doTowers(int topN, Tower from, Tower inter, Tower to) throws Exception
			 {
		 //counter++;
		 //System.out.println("Counter = " + counter);
			 	if(topN==1) {
			 		step(topN, from, to);
			 		
			 	}
			 	else	{
			 		
			 		doTowers(topN-1, from, to, inter); // from-->inter			 		
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
		 from.setArray(indF, 0);
		 to.setArray(indT, buff);
		 
		 System.out.println("Top index A = " + indF);
		 System.out.println("Top index C = " + indT);
		 Print.print();
	 }
	 
	 public static int topInd(Tower s){
		int i=0;
		int topInd=0;
		/*while (i<Main.n) {
			 if (s.getArray(i)==Main.n+1) {
				 i++;
			 }
			 else break;
			 //i++;
		}*/
		 
		for (int j=0; j<Main.n; j++) {
			System.out.println(i); 
			if (s.getArray(j)==0) {
				 i++;
			 }
		 }
		if (i<=0) {
			topInd = 0;
		}
		else topInd = i-1;
		if (i==Main.n) {
		topInd = Main.n-1;
	}
	else topInd = i;
		
		//topInd = i;
		
		/*if (topInd<0) {
		topInd = 0;
		}
		if (topInd>=Main.n) {
				topInd = Main.n-1;
		}*/
		/*switch(i){
	    case -1 :
	    	topInd = Main.n-1;
	       break; 
	    case n:
	       //Операторы
	       break; 
	    default : 
	    	topInd = i;
	}*/
		
		System.out.println("---");
		System.out.println("i=" + i);
		System.out.println("---");
		return topInd;
	 }
}
