import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import DataStructures.CircularLinkedList;
import DataStructures.LinkedLists;

public class LinkedListsTest {

	private LinkedLists LTObj;
	
	@Before
	public void setUp() throws Exception {
		LTObj = new LinkedLists();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("\n *** The test has been executed !!! *** ");
		LTObj.display();
	}

	@Test
	public void testPush1() {
		
		LTObj.display();
		LTObj.pushBack(8);
		LTObj.pushBack(7);
		LTObj.pushBack(8);
		LTObj.pushBack(9);
		LTObj.display();
	}
	
	@Test
	public void testPush2() {
		
		LTObj.display();
		LTObj.pushFront(7);
		LTObj.pushFront(8);
		LTObj.SetHeadEqualTail();
		LTObj.pushFront(9);
		LTObj.display();
	}
	
	@Test
	public void testadd() {
		
		LTObj.add(7);
		LTObj.add(8);
		LTObj.add(5);
		LTObj.SetElements(0);
		LTObj.add(5);
	}
	
	@Test
	public void testPop1() throws Exception {
		
		LTObj.popFront();
		LTObj.pushFront(7);
		LTObj.SetHeadEqualTail();
		LTObj.popFront();
		int s = LTObj.size();
	}
	
	@Test
	public void testTop() throws Exception {
		
		try
		{
			LTObj.topFront();
		}
		catch(Exception e)
		{
			System.out.println("LinkedList is empty");
			e.printStackTrace();
		}
		LTObj.pushFront(7);
		LTObj.topFront();
	}
	
	@Test
	public void testTop2() throws Exception {
		
		try
		{
			LTObj.topBack();
		}
		catch(Exception e)
		{
			System.out.println("LinkedList is empty");
			e.printStackTrace();
		}
		LTObj.pushBack(7);
		LTObj.topBack();
	}
	
	@Test
	public void testPop() throws Exception {
		
		LTObj.SetHead();
		try
		{
			LTObj.popFront();
		}
		catch(Exception e)
		{
			System.out.println("LinkedList is empty");
			e.printStackTrace();
		}
		
	}

}
