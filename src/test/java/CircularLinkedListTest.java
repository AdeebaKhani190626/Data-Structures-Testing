import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import DataStructures.CircularLinkedList;
import DataStructures.StackLinkedList;

public class CircularLinkedListTest {

	private CircularLinkedList CObj;
	
	@Before
	public void setUp() throws Exception {
		CObj = new CircularLinkedList();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("\n *** The test has been executed !!! *** ");
		CObj.display();
	}	

	@Test
	public void testPush() {
		
		CObj.pushBack(8);
		CObj.display();
		CObj.pushFront(7);
		CObj.pushFront(8);
		CObj.pushFront(9);
		CObj.display();
		CObj.pushBack(7);
		CObj.pushBack(8);
		CObj.pushBack(9);
		CObj.display();
	}

	@Test
	public void testPop() {
		
		CObj.popFront();
		CObj.popBack();
		CObj.pushFront(7);
		CObj.pushFront(8);
		CObj.pushFront(9);
		CObj.pushBack(7);
		CObj.pushBack(8);
		CObj.pushBack(9);
		CObj.display();
		CObj.display();
		CObj.popFront();
		CObj.popFront();
		CObj.popFront();
		CObj.display();
		CObj.popBack();
		CObj.popBack();
		CObj.display();
	}
	
	@Test
	public void testPopAndPush() {
		
		CObj.pushFront(2);
		CObj.pushBack(2);
		CObj.popFront();
		CObj.popBack();
	}
	
	@Test
	public void testPopAndPush2() {
		
		CObj.pushFront(2);
		CObj.popFront();
	}
}
