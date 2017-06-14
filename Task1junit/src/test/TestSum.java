package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Sum;

public class TestSum {

	@Test
	public void testSum() {
		Sum test1 = new Sum();
		assertEquals("2 + 7 must be 9", 9, test1.sum(2, 7));
	}

}
