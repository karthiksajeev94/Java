package grokkingAlgos;

public class SelectionSort2 {

	public static void main(String[] args) {
		
		int[] OriginalArray= {5,1,2,6,4};
		SelectionSort2 ss2= new SelectionSort2();

		System.out.println("OriginalArray: ");
		for(int i:OriginalArray) {
			System.out.println(i);
		}

		ss2.SelectionSort(OriginalArray);
		
		System.out.println("Changed array: ");
		for(int i:OriginalArray) {
			System.out.println(i);
		}

	}
	
	public int[] SelectionSort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			
			int min_index=getMinIndex(arr,i);
			
			swap(arr,i,min_index);
		}
		
		return arr;
	}
	
	public int getMinIndex(int[] arr, int i) {
		int min=arr[i];
		int min_index=i;
		for(int j=i+1;j<arr.length;j++) {
			
			if(arr[j]<min) {
				min=arr[j];
				min_index=j;
			}
		}
		
		return min_index;
	}

	public void swap(int[] arr, int m, int n) {
		if(m!=n) {
			int temp=arr[m];
			arr[m]=arr[n];
			arr[n]=temp;
		}
	}
 	
}
