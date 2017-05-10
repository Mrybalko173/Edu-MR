package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**Class for input values from console
 * @author mikhail.rybalko
 *
 */

public class Input {
	public static int input() throws Exception {
		
		BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));
	    String numa = reader.readLine();
	    int num1 = Integer.parseInt(numa); 
	    return num1;
	}
	
public static String anyInput() throws Exception {
		
		BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));
		String any = reader.readLine();
		return any;
	}

}
