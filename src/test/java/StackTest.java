import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import DataStructures.MyStack;
import DataStructures.Stack;

public class StackTest {

	private Stack StackObjS;
	
	@Before
	public void setUp() throws Exception {
		StackObjS = new Stack();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("\n *** The test has been executed !!! *** ");
		StackObjS.display();
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testPositivePush() {
		
		StackObjS.push(44);
		StackObjS.push(23);
		StackObjS.push(66);
		StackObjS.push(901);
		
		int [] result01 = StackObjS.GetArray();
		int [] expectedOutput01 = {44,23,66,901};
		
		for (int i=0; i<StackObjS.GetSize(); i++)
		{
			Assert.assertEquals(expectedOutput01[i], result01[i]);
		}
	}
	
	@Test
	public void testNegativePush() {
		
		StackObjS.SetaddPointer(200);
		StackObjS.push(5);
		
		int [] result02 = StackObjS.GetArray();
		int [] expectedOutput02 = {0};
		
		for (int i=0; i<=StackObjS.GetSize(); i++)
		{
			Assert.assertEquals(expectedOutput02[i], result02[i]);
		}
	}
	
	@Test
	public void testPositivePop() {
		
		StackObjS.push(5);
		StackObjS.push(102);
		
		int Expectedpopped = 102;
		Assert.assertEquals(Expectedpopped, StackObjS.pop());
		
		StackObjS.push(101);
		StackObjS.push(102);
		StackObjS.push(103);
		
		int [] result03 = StackObjS.GetArray();
		int [] expectedOutput03 = {5,101,102,103};
		
		for (int i=0; i<StackObjS.GetSize(); i++)
		{
			Assert.assertEquals(expectedOutput03[i], result03[i]);
		}
	}
	
	@Test
	public void testNegativePop() {
		
		Assert.assertEquals(-1, StackObjS.pop());
	}

}
