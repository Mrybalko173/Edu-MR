package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**Class for input values from console
 * @author mikhail.rybalko
 *
 */

public class Input {
	public String inputString() throws Exception {
		
		BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));
	    String word = reader.readLine(); 
	    return word;
	}
	
	public static int inputInt() throws Exception {
		
		BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));
	    String numa = reader.readLine();
	    int num1 = Integer.parseInt(numa); 
	    return num1;
	}

}
