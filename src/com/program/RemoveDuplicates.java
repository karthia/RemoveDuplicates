package com.program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,
            20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,
            13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};
	
	/*
	 * Using Set remove duplicates because Set collection wont allow to store any duplicate elements
	 */
	public Set<Integer> removeDupUsingSet() {
		Set<Integer> nonDupList = new HashSet<>();
		for(int num : randomIntegers) {
			nonDupList.add(num);
		}
		return nonDupList;
	}
	
	/*
	 * Using LinkedHashSet to maintain the order of the collection, Hashset not guarantee the order of the elements stored.
	 */
	public Set<Integer> removeDupMaintainOrderLinkedHashSet() {
		Set<Integer> nonDupList = new LinkedHashSet<>();
		for(int num : randomIntegers) {
			nonDupList.add(num);
		}
		return nonDupList;
	}
	
	/*
	 * Removing duplicates by iterating and adding into list. order is maintained in this approach also.
	 */
	public int[] removeDupUsingList() {
		List<Integer> noDupNumbers = new ArrayList<>();
		
		for(int num : randomIntegers) {
			if(!noDupNumbers.contains(num)) {
				noDupNumbers.add(num);
			}
		}
		int[] resultNums = new int[noDupNumbers.size()];
		int index = 0;
		for(Integer num : noDupNumbers) {
			resultNums[index++] = num;
		}
		return resultNums;
	}
	
	public static void main(String arg[]) {
		
		RemoveDuplicates dup = new RemoveDuplicates();
		dup.removeDupUsingSet();
		dup.removeDupMaintainOrderLinkedHashSet();
		dup.removeDupUsingList();
	}
}
