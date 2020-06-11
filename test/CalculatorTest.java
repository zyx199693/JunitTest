import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class CalculatorTest {
	
	Calculator calculator=new Calculator();

	@Test
	void testAdd() {
		calculator.add(3);
		calculator.add(4);
		Assert.assertEquals("¼Ó·¨ÓÐwenti",7, calculator.getResult());
//		fail("Not yet implemented");
	}

	@Test
	void testSubstract() {
//		fail("Not yet implemented");
	}

	@Test
	void testMultiply() {
//		fail("Not yet implemented");
	}

	@Test
	void testDivide() {
//		fail("Not yet implemented");
	}

	@Test
	void testSquare() {
//		fail("Not yet implemented");
	}

	@Test
	void testSquareRoot() {
//		fail("Not yet implemented");
	}

	@Test
	void testClear() {
//		fail("Not yet implemented");
	}

	@Test
	void testGetResult() {
//		fail("Not yet implemented");
	}

}
