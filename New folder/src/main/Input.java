package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input {
	
	public static int input() throws Exception {
		System.out.println("Input length of array");
		BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));
	    String numa = reader.readLine();
	    int num1 = Integer.parseInt(numa);
	    return num1;
	}

}
