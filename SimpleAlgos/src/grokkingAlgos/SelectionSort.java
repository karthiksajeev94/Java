package grokkingAlgos;

public class SelectionSort {

	public static void main(String[] args) {

		int[] originalArray=new int[] {4,6,2,7,1,3};
		System.out.println("Original array:");
		for(int i=0;i<originalArray.length;i++) { 
			System.out.println(originalArray[i]);
		}
		
		int[] sortedArray=selectionSort(originalArray);
		System.out.println("Sorted array:");
		for(int i=0;i<originalArray.length;i++) { 
			System.out.println(sortedArray[i]);
		}
		
	}
	
	public static int[] selectionSort(int[] originalArray) {
		
		int[] sortedArray=new int[originalArray.length];
	
		for(int i=0;i<originalArray.length;i++) {
			int min=Integer.MAX_VALUE;
			int min_index=Integer.MAX_VALUE;
			for(int j=0;j<originalArray.length;j++) {
				if(originalArray[j]<min) {
					min=originalArray[j];
					min_index=j;
				}
			}
			originalArray[min_index]=Integer.MAX_VALUE;
			sortedArray[i]=min;
		}

		return sortedArray;
	}

}
