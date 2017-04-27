package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**Class for input char value from console
 * @author mikhail.rybalko
 *
 */

public class InputChar {
	public static char input() throws Exception {
		
		BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));
	    String text = reader.readLine();
	    char c = text.charAt(0);
	    return c;
	}

}
