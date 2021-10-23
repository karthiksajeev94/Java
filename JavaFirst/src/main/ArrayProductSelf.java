package main;

import java.util.Arrays;

public class ArrayProductSelf {

	public static void main(String[] args) {
		
		ArrayProductSelf aps=new ArrayProductSelf();
		int[] nums=new int[] {-1,1,0,-3,3};
		int[] answer=aps.arrayProduct(nums);
		System.out.println(Arrays.toString(answer));

	}
	
	public int[] arrayProduct(int[] nums) {
		
		int prod=1;
		int zeroCount=0;
		int n=nums.length;
		int zeroIndex=0;
		
		for(int i=0;i<n;i++) {
			if(nums[i]==0) {
				zeroCount++;				
				if(zeroCount>1) {
					return new int[n];
				}
				zeroIndex=i;
			}
			else {
				prod*=nums[i];
			}

		}
		
		int[] answer=new int[n];
		if (zeroCount==1) {
			answer[zeroIndex]=prod;
			return answer;
		}
		
		for(int i=0;i<n;i++) {
			answer[i]=prod/nums[i];
		}
		
		return answer;
	}

}
