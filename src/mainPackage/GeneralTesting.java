package mainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneralTesting {

	@Test
	public void test() {
		assertEquals(9,DigitLengthFinder.findNumberLength(123456789));
		assertEquals(0,DigitLengthFinder.findNumberLength(0));
		assertEquals(1,DigitLengthFinder.findNumberLength(1));
		assertEquals(8,DigitLengthFinder.findNumberLength(98765432));
	}

}
