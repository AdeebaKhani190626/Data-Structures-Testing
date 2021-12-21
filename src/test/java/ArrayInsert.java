import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import DataStructures.ArrayDeletion;
import DataStructures.ArrayInsertion;

public class ArrayInsert {
	private ArrayInsertion AIObj;
	
	@Before
	public void setUp() throws Exception {
		AIObj = new ArrayInsertion();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("\n *** The test has been executed !!! *** ");
	}

	// Positive
	@Test
	public void ArrayInserttest1() {
	
		int [] arr_01 = {3,13,23,43,53,63,73,83,93,103,0};
		
		/* First case : Insertion at End */
		int [] result_01 = AIObj.insert(arr_01, 113, 10); 
		int [] expectedOutput_01 = {3,13,23,43,53,63,73,83,93,103,113};
		
		System.out.print("Insertion at End : " );
		AIObj.display(result_01);
		Assert.assertArrayEquals(expectedOutput_01, result_01);
		
		/* Second case : Insertion at Start */
		int [] result_02 = ArrayInsertion.insert(arr_01, 44, 0);
		int [] expectedOutput_02 = {44,3,13,43,53,63,73,83,93,103,113};
		
		System.out.print("Insertion at Start : " );
		AIObj.display(result_02);
		Assert.assertArrayEquals(expectedOutput_02, result_02);
		
		/* Third case : Insertion at Middle */
		int [] result_03 = ArrayInsertion.insert(arr_01, 64, 6);
		int [] expectedOutput_03 = {44,3,13,43,53,63,64,83,93,103,113};
		
		System.out.print("Insertion at Middle : " );
		AIObj.display(result_03);
		Assert.assertArrayEquals(expectedOutput_03, result_03);
	}	
	
	// Negative
	@Test
	public void ArrayInserttest2() {
	
		int [] arr_02 = {11,12,13,14,15};
		
		AIObj.SetSize(6);
		int [] result_2 = ArrayInsertion.insert(arr_02, 64, 3);
		int [] expectedOutput_2 = {11,12,13,14,15};
		
		AIObj.display(result_2);
		Assert.assertArrayEquals(expectedOutput_2, result_2);
	}
}
