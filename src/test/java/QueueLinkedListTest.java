import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import DataStructures.QueueLinkedList;
import DataStructures.StackLinkedList;

public class QueueLinkedListTest {

	private QueueLinkedList QLObj;
	
	@Before
	public void setUp() throws Exception {
		QLObj = new QueueLinkedList();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("\n *** The test has been executed !!! *** ");
		QLObj.display();
	}
	
	@Test
	public void testEnqueue() {
		
		QLObj.display();
		QLObj.enqueue(1);
		QLObj.enqueue(5);
		QLObj.enqueue(7);
	}
	
	@Test
	public void testDequeuePositive() {
		
		QLObj.display();
		QLObj.enqueue(1);
		QLObj.enqueue(5);
		QLObj.enqueue(7);
		
		Assert.assertEquals(1, QLObj.dequeue());
		QLObj.enqueue(5);
		QLObj.enqueue(7);
		Assert.assertEquals(5, QLObj.dequeue());
		Assert.assertEquals(7, QLObj.dequeue());
	}
	
	@Test
	public void testDequeueNegative() {
		
		Assert.assertEquals(-1, QLObj.dequeue());
	}

}
