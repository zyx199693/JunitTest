 
import static org.junit.Assert.*;
 
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
 
public class JunitFlowText {
 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	System.out.println("this is beforeClasss....");
	}
 
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("this is afterClasss....");
	}
 
	@Before
	public void setUp() throws Exception {
		System.out.println("this is brfore....");
	}
 
	@After
	public void tearDown() throws Exception {
		System.out.println("this is after....");
	}
 
	@Test
	public void test1() {
		System.out.println("this is test1....");
	}
	@Test
	public void test2() {
		System.out.println("this is test2....");
	}
}