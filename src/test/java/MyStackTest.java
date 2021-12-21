import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import DataStructures.MyStack;
import DataStructures.Stack;

public class MyStackTest {

	private MyStack StackObj;
	
	@Before
	public void setUp() throws Exception {
		StackObj = new MyStack(5);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("\n *** The test has been executed !!! *** ");
		StackObj.displayStack();
	}

	@SuppressWarnings("deprecation")
	@Test
	public void MyStackPushPositiveTestAndPositiveTopTest() throws Exception {
		
		StackObj.push(3);
		int expectedOutput1 = 3;
		Assert.assertEquals(expectedOutput1, StackObj.top());
	}
	
	@Test
	public void MyStackPushNegativeTest() throws Exception {
		
		StackObj.push(3);
		StackObj.push(45);
		StackObj.push(78);
		StackObj.push(12);
		StackObj.push(32);
		
		try {
			StackObj.push(100); // It will throw Exception here
		} catch (Exception e) {
			System.out.println("Cannot push,Stack is full");
			e.printStackTrace();
		}
		
		int expectedOutput2 = 32;
		Assert.assertEquals(expectedOutput2, StackObj.top());
	}
	
	@Test
	public void MyStackPopPositiveAndNegativeTestAndNegativeTop() throws Exception {
		
		try {
			StackObj.top();
		} catch (Exception e) {
			System.out.println("Stack is empty.");
			e.printStackTrace();
		}
		
		int size = StackObj.size();
		
		try {
			StackObj.pop();
		} catch (Exception e) {
			System.out.println("Cannot pop,Stack is empty.");
			e.printStackTrace();
		}
		
		StackObj.push(3);
		StackObj.push(45);
		StackObj.push(78);
		StackObj.pop();
		StackObj.pop();
		
		int expectedOutput1 = 3;
		Assert.assertEquals(expectedOutput1, StackObj.top());
		
		StackObj.push(12);
		StackObj.push(32);
		int expectedOutput2 = 32;
		Assert.assertEquals(expectedOutput2, StackObj.top());
	}
	
}
