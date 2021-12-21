import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import DataStructures.Dequeue;

public class DequeueTest {

	Dequeue DObj;
	
	@Before
	public void setUp() throws Exception {
		DObj = new Dequeue(15);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("\n *** The test has been executed !!! *** ");
		DObj.display();
	}

	@Test
	public void testAddRightPositive() {
		
		DObj.addRight(1);
		DObj.addRight(9);
		DObj.addRight(2);
		DObj.addRight(8);
		
		int [] expectedOutput_1 = {0,0,0,0,0,0,0,0,0,0,0,8,2,9,1};
		Assert.assertArrayEquals(expectedOutput_1, DObj.GetArray());
	}
	
	@Test
	public void testAddRightNegative01() {
		
		DObj.addLeft(1);
		DObj.addLeft(9);
		DObj.addLeft(2);
		DObj.addLeft(8);
		DObj.addLeft(1);
		DObj.addLeft(9);
		DObj.addLeft(2);
		DObj.addRight(6);
		DObj.addRight(5);
		DObj.addRight(4);
		DObj.addRight(3);
		DObj.addRight(2);
		DObj.addRight(1);
		DObj.addRight(9);
		DObj.addRight(2);
		
		DObj.addRight(10);
		int [] expectedOutput_1 = {1,9,2,8,1,9,2,2,9,1,2,3,4,5,6};
		Assert.assertArrayEquals(expectedOutput_1, DObj.GetArray());
	}
	
	@Test
	public void testAddRightNegative02() {
		
		DObj.SetLeftPointer(0);
		DObj.SetRightPointer(14);
		
		DObj.addRight(1);
		
		int [] expectedOutput_1 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		Assert.assertArrayEquals(expectedOutput_1, DObj.GetArray());
	}
	
	@Test
	public void testAddRightNegative03() {
		
		DObj.SetRightPointer(5);
		DObj.SetLeftPointer(0);
		
		DObj.addRight(1);
		DObj.addRight(2);
		DObj.addRight(3);
		DObj.addRight(4);
		
		int [] expectedOutput_2 = {0,0,0,0,0,0,0,0,0,0,4,3,2,1,1};
		Assert.assertArrayEquals(expectedOutput_2, DObj.GetArray());
	}
	
	@Test
	public void testAddLeftPositive() {
		
		DObj.addLeft(1);
		DObj.addLeft(9);
		DObj.addLeft(2);
		DObj.addLeft(8);
		
		int [] expectedOutput_1 = {1,9,2,8,0,0,0,0,0,0,0,0,0,0,0};
		Assert.assertArrayEquals(expectedOutput_1, DObj.GetArray());
	}
	
	@Test
	public void testAddLeftNegative() {
		
		DObj.addLeft(1);
		DObj.addLeft(9);
		DObj.addLeft(2);
		DObj.addLeft(8);
		DObj.addLeft(1);
		DObj.addLeft(9);
		DObj.addLeft(2);
		DObj.addRight(6);
		DObj.addRight(5);
		DObj.addRight(4);
		DObj.addRight(3);
		DObj.addRight(2);
		DObj.addRight(1);
		DObj.addRight(9);
		DObj.addRight(2);
		
		DObj.addLeft(10);
		int [] expectedOutput_1 = {1,9,2,8,1,9,2,2,9,1,2,3,4,5,6};
		Assert.assertArrayEquals(expectedOutput_1, DObj.GetArray());
	}
	
	@Test
	public void testAddLeftNegative02() {
		
		DObj.SetLeftPointer(0);
		DObj.SetRightPointer(14);
		
		DObj.addLeft(1);
		
		int [] expectedOutput_1 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		Assert.assertArrayEquals(expectedOutput_1, DObj.GetArray());
	}

	@Test
	public void testAddLeftNegative03() {
		
		DObj.SetRightPointer(14);
		DObj.SetLeftPointer(5);
		
		DObj.addLeft(1);
		DObj.addLeft(2);
		DObj.addLeft(3);
		DObj.addLeft(4);
		
		int [] expectedOutput_2 = {1,1,2,3,4,0,0,0,0,0,0,0,0,0,0};
		Assert.assertArrayEquals(expectedOutput_2, DObj.GetArray());
	}
}
