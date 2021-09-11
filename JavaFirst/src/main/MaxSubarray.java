package main;

public class MaxSubarray {

	public static void main(String[] args) {

		int[] nums=new int[] {1};
		System.out.println(subArray(nums));
	}
	
	public static int subArray(int[] nums) {
		
		int sumSoFar=nums[0];
		int maxSum=nums[0];
		
		for(int i=1;i<nums.length;i++) {
			sumSoFar+=nums[i];
			if(sumSoFar<nums[i]) {
				sumSoFar=nums[i];
			}
			maxSum=Math.max(sumSoFar,maxSum);
		}
		
		return maxSum;
	}

}
