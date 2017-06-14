package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import main.Sum;

public class SumTest {
	
	private Sum test1 = new Sum();
	
	@Test
	public void testSum() throws Exception {
		Assert.assertEquals(test1.sum(3, 1), 4);
	}
	
}
