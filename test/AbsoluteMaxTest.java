import static org.junit.Assert.*;

import org.junit.Test;

public class AbsoluteMaxTest {

	AbsoluteMax absolutemax=new AbsoluteMax();
	
	@Test
	public void testMain() {
//		fail("��δʵ��");
	}

	@Test
	public void testAbsMax() {
		int[] num = {-3,4,6};
		int result=absolutemax.absMax(num);
		int expect=6; 
		assertEquals("�������ֵ������",expect,expect);
		System.out.println("This is AbsoluteMax");
//		fail("��δʵ��");
	}
}