import static org.junit.Assert.*;

import org.junit.Test;

public class AbsoluteValueTest {

	AbsoluteValue absolutevalue = new AbsoluteValue();
	
	@Test
	public void testMain() {
//		fail("��δʵ��");
	}

	@Test
	public void testAbsVal() {
		int num = -10;
		int result = absolutevalue.absVal(num);
		int expect = 10;
		assertEquals("����ֵ������",expect,result);
		System.out.println("This is AbsoluteValue");
//		fail("��δʵ��");
	}

}
