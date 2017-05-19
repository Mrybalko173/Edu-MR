package main;

import org.apache.commons.lang3.RandomStringUtils;

/**class for generating random string word
 * @author mikhail.rybalko
 *
 */

public class StringRandom { 
	public static String rand() {
		String word = RandomStringUtils.randomAlphabetic(6);
		return word;
	}
}
