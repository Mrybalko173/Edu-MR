package main;

import org.apache.commons.lang3.RandomStringUtils;

//import org.apache.commons.lang3.*; 

public class StringRandom {
	public static String rand() {
		String word = RandomStringUtils.randomAlphabetic(6);
		return word;
	}
}
