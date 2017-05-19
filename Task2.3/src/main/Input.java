package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**Class for input values from console
 * @author mikhail.rybalko
 *
 */

public class Input {
	public static String input() throws Exception {
		
		BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));
	    String numa = reader.readLine();
	    return numa;
	}

}
