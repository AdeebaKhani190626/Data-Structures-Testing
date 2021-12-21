import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import DataStructures.Array;

@RunWith(Parameterized.class)
public class ArrayTest {

	private Array ArrObj;
	private final int InputNumber;
	private final Boolean expectedOutput;
	
	@Before
	public void setUp() throws Exception {
		ArrObj = new Array();
	}

	public ArrayTest(int InputNumber, Boolean expectedOutput)
	{
		this.InputNumber = InputNumber;
		this.expectedOutput = expectedOutput;
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("\n *** The test has been executed !!! *** ");
	}

	@Parameterized.Parameters
	public static Collection Searching()
	{
		return Arrays.asList(new Object[][] {{1,true},{67,false},{5,true},{3,true},{77,true}});
		
	}
	
	@Test
	public void ArrayLinearSearch() {
		
		int [] arrS = {3,22,33,1,55,66,77,88,5};
		
		ArrObj.SetSize(9); 
		ArrObj.SetArray(arrS);
		Assert.assertEquals(expectedOutput,ArrObj.linearSearch(InputNumber));
	}
	
	@Test
	public void ArrayBinarySearch() {
		
		int [] arrS2 = {1,2,3,4,5,44,66,77};
		
		ArrObj.SetSize(8); 
		ArrObj.SetArray(arrS2);
		Assert.assertEquals(expectedOutput,ArrObj.binarySearch(InputNumber,0,ArrObj.GetSize()));
	}
	
	@Test
	public void ArrayBubbleSort()
	{
		int [] arrUn = {111,1111111111,11111,111,1,11111,1111,1111111,11};
		ArrObj.SetSize(9); 
		ArrObj.SetArray(arrUn);
		ArrObj.bubbleSort();
		int [] SortedArr = {1,11,111,111,1111,11111,11111,1111111,1111111111,0
							,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
							,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
							,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		Assert.assertArrayEquals(SortedArr, ArrObj.GetArray());
	}
	
	// Positive Insert
	@Test
	public void ArrayInserttest() {
		
		int [] arr1 = {11,22,33,44,55,66,77,88,99};
		
		/* Setting size and Array */
		ArrObj.SetSize(9); 
		ArrObj.SetArray(arr1);
		
		/* First Case : Insertion at Start */
		ArrObj.insert(12, 0);
		
		int [] expectedOutput1 = {12,11,22,33,44,55,66,77,88,99
									,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
				                    ,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
				                    ,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int [] result1 = ArrObj.GetArray();
		Assert.assertArrayEquals(expectedOutput1, result1);
		
		/* Second Case : Insertion at End */
		ArrObj.insert(12, 9);
		
		int [] expectedOutput2 = {12,11,22,33,44,55,66,77,88,12,99
									,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
									,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
									,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int [] result2 = ArrObj.GetArray();
		Assert.assertArrayEquals(expectedOutput2, result2);
		
		/* Third Case : Insertion at Middle */
		ArrObj.insert(12, 5);
		
		int [] expectedOutput3 = {12,11,22,33,44,12,55,66,77,88,12,99
									,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
									,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
									,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int [] result3 = ArrObj.GetArray();
		Assert.assertArrayEquals(expectedOutput3, result3);
		
		System.out.println("Final Array : ");
		ArrObj.display();
	}
	
	// Positive Delete
	@Test
	public void ArrayDeletetest() {
		
		int [] arrd1 = {111,222,333,444,555,666,777,888,999};
		
		/* Setting size and Array */
		ArrObj.SetSize(9); 
		ArrObj.SetArray(arrd1);
		
		/* First Case : Deletion at Start */
		ArrObj.delete(0);
		
		int [] expectedOutputd1 = {222,333,444,555,666,777,888,999,999
									,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
									,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
									,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int [] resultd1 = ArrObj.GetArray();
		Assert.assertArrayEquals(expectedOutputd1, resultd1);
		
		/* Second Case : Deletion at End */
		ArrObj.delete(9);
		
		int [] expectedOutputd2 = {222,333,444,555,666,777,888,999,999
									,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
									,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
									,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int [] resultd2 = ArrObj.GetArray();
		Assert.assertArrayEquals(expectedOutputd2, resultd2);
		
		/* Third Case : Deletion at Middle */
		ArrObj.delete(5);
		
		int [] expectedOutputd3 = {222,333,444,555,666,888,888,999,999
									,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
									,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
									,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int [] resultd3 = ArrObj.GetArray();
		Assert.assertArrayEquals(expectedOutputd3, resultd3);
		
		System.out.println("Final Array : ");
		ArrObj.display();
	}	
}
