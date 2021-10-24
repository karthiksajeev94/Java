package main;

import java.util.Arrays;

public class MaxProdSubarray {

	public static void main(String[] args) {
		
		MaxProdSubarray mps=new MaxProdSubarray();
		
		int[] nums= {1,-2,3,-1};
		
		System.out.println(mps.maxProdSA(nums));

	}
	
	public int maxProdSA(int[] nums) {
		
		int n=nums.length;
		int maxProd=nums[0];
		int maxProdUptoHere=maxProd;
		int minProdUptoHere=maxProd;
		
		for(int i=1;i<n;i++) {
			int tempMaxPUH=maxProdUptoHere;
			maxProdUptoHere=Math.max(nums[i],Math.max(nums[i]*maxProdUptoHere,nums[i]*minProdUptoHere));
			minProdUptoHere=Math.min(nums[i],Math.min(nums[i]*tempMaxPUH,nums[i]*minProdUptoHere));
			maxProd=Math.max(maxProd, maxProdUptoHere);
			System.out.println("maxProd: "+maxProd);
		}
		
		return maxProd;
	}
	
	// n^3
	public int contiguousSubarrays(int[] arr) {
		
		int n=arr.length;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					sum+=arr[k];
				}
				if(sum>maxSum) {
					maxSum=sum;
				}
			}
		}
		
		return maxSum;
	}
	
	// n^2
	public int contiguousSubarrays2(int[] arr) {
		
		int n=arr.length;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum+=arr[j];
				if(sum>maxSum) {
					maxSum=sum;
				}
			}
		}
		
		return maxSum;
	}
	
	public int contiguousSubarraysProduct(int[] arr) {
		
		int n=arr.length;
		int maxProd=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			int prod=1;
			for(int j=i;j<n;j++) {
				prod*=arr[j];
				maxProd=Math.max(maxProd, prod);
			}
		}
		
		return maxProd;
	}

	

}
