import static org.junit.Assert.*;

import org.junit.Test;

public class AbsoluteMinTest {

	AbsoluteMin absolutemin = new AbsoluteMin();
	@Test
	public void testMain() {
//		fail("尚未实现");
	}

	@Test
	public void testAbsMin() {
		int[] num= {-4,6,5};
		int result=absolutemin.absMin(num);
		int expect=-4;
		assertEquals("绝对最小值有问题",expect,result);
		System.out.println("This is AbsoluteMin");
//		fail("尚未实现");
	}

}
