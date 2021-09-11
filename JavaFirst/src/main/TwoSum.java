package main;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		
		int[] nums=new int[]{3,2,4};
		int target=6;
		
		int[] result=new int[2];
		
		result=twoSum(nums,target);
		
		for(int i:result) {
			System.out.println(i);
		}
		
		
	}
	
	public static int[] twoSum(int[] nums, int target) {
		
		int[] indices=new int[2];
		
		Arrays.sort(nums);
		
		for (int i: nums) {
			int x=target-i;
			int xIndex=Arrays.binarySearch(nums, x);
			if(xIndex>0) {
				indices[0]=i;
				indices[1]=xIndex;
				break;
			}
		}
		return(indices);
	}
	
	public static int[] twoSum2(int[] nums, int target) {
		
		int[] indices=new int[2];
		
		for (int i=0;i<nums.length-1;i++) {
			for (int j=i+1;j<nums.length;j++) {
				int sum=nums[i]+nums[j];
				if(sum==target) {
					indices[0]=i;
					indices[1]=j;
					break;
				}				
			}
		}
		
		return(indices);
	}

}
