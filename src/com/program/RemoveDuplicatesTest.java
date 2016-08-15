package com.program;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class RemoveDuplicatesTest {

	public int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,
            20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,
            13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};
	
	public int[] resultIntegers = {1, 2, 34, 25, 45, 3, 26, 85, 4, 86, 43, 10000, 11, 16, 19, 18, 9, 20, 17, 8, 15, 6, 5, 10, 14, 12, 13, 7};
	
	RemoveDuplicates removeDup;
	
	@Before
	public void setUp() {
		removeDup = new RemoveDuplicates();
	}
	
	@Test
	public void testRemoveDupUsingSet() {
		Set<Integer> result = removeDup.removeDupUsingSet();
		assertNotNull(result);
		assertEquals(resultIntegers.length, result.size());
	}
	
	@Test
	public void testRemoveDupUsingList() {
		int[] result = removeDup.removeDupUsingList();
		assertNotNull(result);
		assertEquals(28, result.length);
		assertArrayEquals(resultIntegers, result);
	}
	
	@Test
	public void testRemoveDupMaintainOrderLinkedHashSet() {
		Set<Integer> result = removeDup.removeDupMaintainOrderLinkedHashSet();
		assertNotNull(result);
		assertEquals(resultIntegers.length, result.size());
	}
}
