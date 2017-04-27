package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**Class for count chars in text
 * @author mikhail.rybalko
 *
 */
public class CountChar {
	public static int count(char a) throws IOException{
		int i = 0; // count varuable
		String text = new String(Files.readAllBytes(Paths.get("Text.txt"))); //get text from file to String varuable
		
		for (int j = 0; j<text.length(); j++){ //counter cycle
			if (a == text.charAt(j)){
				i +=1;
			}
		}
		System.out.println();
		System.out.println("Here is your text: " + text);
		System.out.println();
		System.out.print("Count of char: "+ i);
	
		return i;	
	}
}
