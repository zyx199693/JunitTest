import static org.junit.Assert.*;

import org.junit.Test;

public class AbsoluteMinTest {

	AbsoluteMin absolutemin = new AbsoluteMin();
	@Test
	public void testMain() {
//		fail("��δʵ��");
	}

	@Test
	public void testAbsMin() {
		int[] num= {-4,6,5};
		int result=absolutemin.absMin(num);
		int expect=-4;
		assertEquals("������Сֵ������",expect,result);
		System.out.println("This is AbsoluteMin");
//		fail("��δʵ��");
	}

}
