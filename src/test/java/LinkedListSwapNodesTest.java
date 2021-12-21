import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import DataStructures.CircularLinkedList;
import DataStructures.LinkedList;
import DataStructures.LinkedListSwapNodes;

public class LinkedListSwapNodesTest {

	private LinkedListSwapNodes SNObj;
	
	@Before
	public void setUp() throws Exception {
		SNObj = new LinkedListSwapNodes();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("\n *** The test has been executed !!! *** ");
		SNObj.display();
	}

	@Test
	public void testSwap1() {
		
		SNObj.display();
		SNObj.pushFront(7);
		SNObj.pushBack(8);
		SNObj.display();
		SNObj.pushFront(8);
		SNObj.pushFront(9);
		SNObj.display();
		SNObj.pushBack(7);
		SNObj.pushBack(8);
		SNObj.pushBack(9);
		SNObj.display();
	}
	
	@Test
	public void testSwap2() {
		
		SNObj.pushBack(8);
		SNObj.display();
		SNObj.swap();
		SNObj.pushFront(8);
		SNObj.pushFront(9);
		SNObj.swap();
		SNObj.display();
	}

}
