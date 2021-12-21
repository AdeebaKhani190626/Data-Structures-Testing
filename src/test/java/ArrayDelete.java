import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import DataStructures.ArrayDeletion;

public class ArrayDelete {
	private ArrayDeletion ADObj;
	
	@Before
	public void setUp() throws Exception {
		ADObj = new ArrayDeletion();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("\n *** The test has been executed !!! *** ");
	}

	// Positive
	@Test
	public void ArrayDeletetest1() {
		
		int [] arr_01 = {323,23,55,999,1,67,48,90,76,1000};
		
		/* First case : Deletion from middle */
		int [] result_01 = ADObj.delete(arr_01, 5);
		int [] expectedOutput_01 = {323,23,55,999,1,48,90,76,1000,-1};
		
		System.out.print("Deletion from Middle : " );
		ADObj.display(result_01);
		Assert.assertArrayEquals(expectedOutput_01, result_01);
		
		/* Second case : Deletion at start */
		int [] result_02 = ADObj.delete(arr_01, 0);
		int [] expectedOutput_02 = {23,55,999,1,48,90,76,1000,-1,-1};
		
		System.out.print("Deletion at Start : " );
		ADObj.display(result_02);
		Assert.assertArrayEquals(expectedOutput_02, result_02);
		
		/* Third case : Deletion at end */
		int [] result_03 = ADObj.delete(arr_01, 9);
		
		System.out.print("Deletion at End : " );
		ADObj.display(result_03);
		Assert.assertArrayEquals(expectedOutput_02, result_03);
	}
	
	// Negative
	@Test
	public void ArrayDeletetest2(){
		
		int [] arr_02 = {33,234,65,989,12,67,41,90,76,1001};
		
		/* Negative case : Deletion with wrong input */
		int [] result_02 = ADObj.delete(arr_02, -3);
		int [] expectedOutput_02 = {33,234,65,989,12,67,41,90,76,1001};
		
		System.out.print("\nWrong Input Case Output : " );
		ADObj.display(result_02);
		
		System.out.println("\n------- MAIN CALLS ------- \n");
		ADObj.main(null);
		
		Assert.assertArrayEquals(expectedOutput_02, result_02);
	}
}


