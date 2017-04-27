package main;

/**main class
 * @author mikhail.rybalko
 *
 */
public class Main {


	public static void main(String[] args) throws Exception {
		char c = InputChar.input();
		System.out.println("Char for search " + c);
		CountChar.count(c);
	}

}
