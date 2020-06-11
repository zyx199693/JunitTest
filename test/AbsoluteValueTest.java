import static org.junit.Assert.*;

import org.junit.Test;

public class AbsoluteValueTest {

	AbsoluteValue absolutevalue = new AbsoluteValue();
	
	@Test
	public void testMain() {
//		fail("尚未实现");
	}

	@Test
	public void testAbsVal() {
		int num = -10;
		int result = absolutevalue.absVal(num);
		int expect = 10;
		assertEquals("绝对值有问题",expect,result);
		System.out.println("This is AbsoluteValue");
//		fail("尚未实现");
	}

}
