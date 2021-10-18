package secondary;

import java.util.Collections;
import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		
		System.out.println("Arrays");
		
		ArrayClass arrays=new ArrayClass();
//		int[] nums= {0,0,0};
//		int ans=arrays.consecutive(nums);
		
//		int[] nums= {12,34,5,765,3};
//		int ans=arrays.evenDigits(nums);
		
		int[] nums= {-7,-3,2,3,11};
		int[] ans=arrays.sortedSquares(nums);
		
//		System.out.println("Ans: "+ans);
		
		System.out.println(Arrays.toString(ans));
		

	}
	
	public int consecutive(int[] nums) {
		int count=0;
		int countMax=0;
		
		for (int i=0;i<nums.length;i++) {
			
			if(nums[i]==1) {
				count++;
				if(countMax<count) {
					countMax=count;
				}
			}
			else {
				count=0;
			}
			
		}
		
		return countMax;
	}
	
	public int evenDigits(int[] nums) {
		
		int countEven=0;
		for (int i=0;i<nums.length;i++) {
			int n=nums[i];
			if(n!=0) { 
				int digits=0;
				
				while(n!=0) {
					n=n/10;
					digits++;
				}
				
				System.out.println((digits & 2));
				
				if(digits%2==0) {
					countEven++;
				}
			}
		}
		
		return countEven;
	}
	
	// should use 2-pointer for O(n) 
	public int[] sortedSquares(int[] nums) {

		int[] squared=new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			squared[i]=nums[i]*nums[i];
			System.out.println(squared[i]);
		}
		Arrays.sort(squared);
		
		return squared;
	}

}
