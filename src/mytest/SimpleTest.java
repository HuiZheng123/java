package mytest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SimpleTest {

	private Simple s1, s2;
	
	@Before
	public void setUp() throws Exception {
		
	//	super.setUp();
		s1 = new Simple(10);
		s2 = new Simple(-7);
	}

	@Test
	public void testFoo() {
		
		assertTrue(s1.foo()==10);
		assertTrue(s2.foo()==7);
		//fail("Not yet implemented");
	}

}
