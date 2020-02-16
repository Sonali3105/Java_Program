

public class ReverseInt {

	public static void main(String[] args) {
	
		// Using algo
		long num = 12345;
		long rev=0;
		
		while(num!= 0)
		{
			rev = rev * 10 + num % 10;//1. rev = 0+5=5 // 2.rev = 50+4=54 // 3. rev= 540+3 =543 // 4. rev=5430+2= 5432 // 5. rev=54320+1 =54321 
			num = num/10; //1. num = 12345/10=1234 (1234.5) // 2. num= 1234/10=123(123.4) // 3.num = 12 // 4. num= 1 // 5. num= 0
		}
		System.out.println("Reverse number is"+ rev);
		
		
		// using StringBuffer Class 
		
		long num1= 123456;
		StringBuffer str = new StringBuffer(String.valueOf(num1)).reverse();
		
		System.out.println(str);
	}

}
