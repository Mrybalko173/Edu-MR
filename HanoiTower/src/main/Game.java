package main;
/**Main class
 * @author mikhail.rybalko
 *
 */
public class Game {
	public static void doTowers(int n, char from, char inter, char to) {
			 if(n==1) // Condition if we have just one disk on A tower
				 System.out.println("Move disk 1 from " + from + " to "+ to);
			 else
			 {
				 doTowers(n-1, from, to, inter); // Move disk from A tower to B tower 
				 System.out.println("Move disk " + n + " from " + from + " to "+ to);
				 doTowers(n-1, inter, from, to); // Move disk from B tower to C tower 
			 }
			 }
}
