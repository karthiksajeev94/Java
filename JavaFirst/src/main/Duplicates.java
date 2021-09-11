package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {

		int[] nums=new int[] {1,1,1,3,3,4,3,2,4,2};
		System.out.println(duplicate(nums));
	}
	
	public static boolean duplicate(int[] nums) {
		 
		Set<Integer> dupSet=new HashSet<Integer>();
		for(int i:nums) {
			if (!dupSet.add(i)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean duplicate1(int[] nums) {
		
		Set<Integer> dupSet=new HashSet<Integer>();

		for(int i:nums) {
			if(dupSet.contains(i)) {
				return true;
			}
			else {
				dupSet.add(i);
			}
		}
		
		return false;
	}

}
