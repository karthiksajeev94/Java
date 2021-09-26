package grokkingAlgos;

public class Factorial {

	public static void main(String[] args) {
		Factorial factorial= new Factorial();
		System.out.println(factorial.factorial(4));
		System.out.println(factorial.factorialRecursion(6));
	
	}
	
	public int factorial(int n) {
		
		int fact=n;
		for (int i=n-1;i>0;i--) {
			fact*=i;
		}
		
		return fact;
	}
	
	public int factorialRecursion(int n) {
		
		if (n>1) {
			return (n*factorialRecursion(n-1));
		}
		
		return 1;
	}

}
