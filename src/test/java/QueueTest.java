import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import DataStructures.Dequeue;
import DataStructures.Queue;

public class QueueTest {

	private Queue QObj;
	private Queue QObj1;
	
	@Before
	public void setUp() throws Exception {
		QObj = new Queue(10);
		QObj1 = new Queue(3);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("\n *** The test has been executed !!! *** ");
		QObj.display();
	}

	@Test
	public void testPositiveEnqueue01() throws Exception {
		
		QObj.display();
		QObj.enqueue(1);
		QObj.enqueue(2);
		QObj.enqueue(3);
		QObj.enqueue(4);
		QObj.enqueue(5);
		
		Assert.assertFalse(QObj.empty());
		
		int [] expectedOutput_01 = {1,2,3,4,5};
		int [] result_01 = QObj.GetArray();
		for (int i=0; i<QObj.size(); i++)
		{
			Assert.assertEquals(expectedOutput_01[i], result_01[i]);
		}	
	}
	
	@Test
	public void testPositiveEnqueue02() throws Exception {
		
		QObj1.enqueue(1);
		QObj1.enqueue(2);
		QObj1.enqueue(7);
		
		try
		{
			QObj1.enqueue(10);
		}
		catch(Exception e)
		{
			System.out.println("Cannot enqueue, Queue is full");
		}
		
		QObj1.dequeue();
		QObj1.enqueue(10);
		
		try
		{
			QObj1.enqueue(10);
		}
		catch(Exception e)
		{
			System.out.println("Cannot enqueue, Queue is full");
		}
	}
	
	@Test
	public void testPositiveDequeue() throws Exception {
		
		QObj.enqueue(1);
		QObj.enqueue(2);
		QObj.enqueue(3);
		QObj.enqueue(4);
		QObj.enqueue(5);
		
		QObj.dequeue();
		QObj.dequeue();
		QObj.dequeue();
		QObj.dequeue();
		QObj.dequeue();
		
		int [] expectedOutput_02 = {1};
		int [] result_02 = QObj.GetArray();
		
		Assert.assertTrue(QObj.empty());
		
		for (int i=0; i<=QObj.size(); i++)
		{
			Assert.assertEquals(expectedOutput_02[i], result_02[i]);
		}
	}
	
	@Test
	public void testPositiveDequeue02() throws Exception {
		
		QObj.enqueue(1);
		QObj.enqueue(2);
		QObj.enqueue(3);
		QObj.enqueue(4);
		QObj.enqueue(5);
		QObj.enqueue(1);
		QObj.enqueue(2);
		QObj.enqueue(3);
		QObj.enqueue(4);
		QObj.enqueue(5);
		
		System.out.println(QObj.GetArrayLength() + " ");
		System.out.println(QObj.GetRemovePointer() + " ");
		
		QObj.dequeue();
		QObj.dequeue();
		QObj.dequeue();
		QObj.dequeue();
		QObj.dequeue();
		QObj.dequeue();
		QObj.dequeue();
		QObj.dequeue();
		QObj.dequeue();
		QObj.dequeue();
		
		int [] expectedOutput_03 = {1};
		int [] result_03 = QObj.GetArray();
		
		for (int i=0; i<=QObj.size(); i++)
		{
			Assert.assertEquals(expectedOutput_03[i], result_03[i]);
		}	
	}
	
	@Test
	public void testNegativeDequeue01() {
		
		try
		{
			QObj.dequeue();
		}
		catch(Exception e)
		{
			System.out.println("Cannot remove, Queue is Empty");
		}
	}
}
