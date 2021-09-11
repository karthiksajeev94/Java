package main;

public class Stock {

	public static void main(String[] args) {
		int[] prices={7,1,5,3,6,4};
		int profit=stock(prices);
		
		System.out.println(profit);
		
	}
	
	public static int stock(int[] prices) {
	
		int min=Integer.MAX_VALUE;
		int maxP=0;
		for (int i=0;i<prices.length;i++) {
			if(prices[i]<min) {
				min=prices[i];
			}
			int profit=prices[i]-min;
			if(profit > maxP) {
				maxP=profit;
			}
		}
		
		return maxP;
	}

}
