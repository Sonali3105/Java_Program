

public class Factorial {
	// fact(4) = 4*3*2*1 = 24
	// fact(5) = 5*4*3*2*1 = 120
	// fact(1) = 1 
	//fact(0) = 1
	
	// without recursive -- use for loop
	
	public static int fact(int num) {
		int fact= 1;
		if(num==0) 
			return 1; 
		for(int i=1; i<=num; i++) {
			fact = fact*i;
		}
		return fact;
	}
	
	// With recursive function = fun is calling itself (inside the fun body i am calling the same fun )
	public static int fact_recursive(int num) {
		if(num==0) {
			return 1;
		}
		else {
			return (num * fact_recursive(num-1)); // call the same fun fact_recursive
		}
	}
	
	public static void main(String[] args) {
		
//		System.out.println(fact(4));
//		System.out.println(fact(10));
//		System.out.println(fact(1 ));
//		System.out.println(fact(0));
		
		System.out.println(fact_recursive(4));
		System.out.println(fact_recursive(2));
		System.out.println(fact_recursive(1));
		System.out.println(fact_recursive(50));
	}

}
