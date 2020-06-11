import static org.junit.Assert.*;

import org.junit.Test;

public class AbsoluteMaxTest {

	AbsoluteMax absolutemax=new AbsoluteMax();
	
	@Test
	public void testMain() {
//		fail("尚未实现");
	}

	@Test
	public void testAbsMax() {
		int[] num = {-3,4,6};
		int result=absolutemax.absMax(num);
		int expect=6; 
		assertEquals("绝对最大值有问题",expect,expect);
		System.out.println("This is AbsoluteMax");
//		fail("尚未实现");
	}
}