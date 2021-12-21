import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import DataStructures.StackLinkedList;

public class StackLinkedListTest {

	private StackLinkedList SLObj;
	
	@Before
	public void setUp() throws Exception {
		SLObj = new StackLinkedList();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("\n *** The test has been executed !!! *** ");
		SLObj.display();
	}

	@Test
	public void testPopNegative() {
		
		Assert.assertEquals(-1, SLObj.pop());
	}
	
	@Test
	public void testTopNegative() {
		
		Assert.assertEquals(-1, SLObj.top());
	}
	
	@Test
	public void testPush_Pop_Top_Positive() {
		
		SLObj.push(1);
		SLObj.push(5);
		SLObj.push(7);
		int s = SLObj.getSize();
		
		Assert.assertEquals(7, SLObj.pop());
		Assert.assertEquals(5, SLObj.pop());
		Assert.assertEquals(1, SLObj.top());
	}

}
