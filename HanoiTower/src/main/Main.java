package main;
/**Main class
 * @author mikhail.rybalko
 *
 */
public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("Let's start this game! Please, enter value of elements in first tower");
		int n = Input.input(); //read count of elements on A tower 
		Game.doTowers(n, 'A', 'B', 'C'); //Run game
	}

}
