package main;

public class Fibonacci {

	public static void main(String[] args) {
	
		System.out.println(fib(10));
	}
	
	public static int fib(int n) {
		
		int[] fibArr=new int[n+1];
		fibArr[0]=0;
		fibArr[1]=1;
		
		for (int i=2;i<n+1;i++) {
			fibArr[i]=fibArr[i-1]+fibArr[i-2];
		}
		
		return fibArr[n];
	}
}
