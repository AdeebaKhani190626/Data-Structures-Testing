import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import DataStructures.CircularLinkedList;
import DataStructures.LinkedList;

public class LinkedListTest {

	private LinkedList LObj;
	
	@Before
	public void setUp() throws Exception {
		LObj = new LinkedList();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("\n *** The test has been executed !!! *** ");
		LObj.display();
	}

	@Test
	public void testPush() {
		
		LObj.pushBack(8);
		LObj.display();
		LObj.pushFront(7);
		LObj.pushFront(8);
		LObj.pushFront(9);
		LObj.display();
		LObj.pushBack(7);
		LObj.pushBack(8);
		LObj.pushBack(9);
		LObj.display();
	}

	@Test
	public void testPop() {
		
		LObj.popFront();
		LObj.popBack();
		LObj.pushFront(7);
		LObj.pushFront(8);
		LObj.pushFront(9);
		LObj.pushBack(7);
		LObj.pushBack(8);
		LObj.pushBack(9);
		LObj.display();
		LObj.display();
		LObj.popFront();
		LObj.popFront();
		LObj.popFront();
		LObj.display();
		LObj.popBack();
		LObj.popBack();
		LObj.display();
	}
	
	@Test
	public void testPopAndPush() {
		
		LObj.pushFront(2);
		LObj.pushBack(2);
		LObj.popFront();
		LObj.popBack();
	}
	
	@Test
	public void testPopAndPush2() {
		
		LObj.pushFront(2);
		LObj.popFront();
	}
	
	@Test
	public void testPopOnlu() {
		
		LObj.pop(0);
		LObj.pushFront(2);
		LObj.pop(0);
		LObj.pushFront(9);
		LObj.pushBack(7);
		LObj.pushBack(8);
		LObj.pushBack(9);
		LObj.pop(3);
		LObj.pop(4);	
	}

}
