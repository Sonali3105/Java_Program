

public class palindromeNumber {
	// original number and reverse number can be same 
	// 151 454 78987 35453 161 
	
	public static void isPalindrome(int num)
	{
		System.out.println("Given number is "+ num);
		int r=0;
		int sum=0; 
		int t;
		t=num;
		
		while(num>0)
		{
			r = num % 10; // 1. give remainder = 151 % 10= 1 // 2. r = 15%10 = 5 // 3. r= 1%10 = 1
			sum = (sum * 10)+r; //1. (0*10)+1 =1 // 2. sum = (1*10)+5 = 15 // 3. sum = (15*10)+1 =151
			num = num /10;// 1. num = 151/10 = 15.1(15) // 2. num = 15/10 = 1 //3. num = 1/10 =0
		}
		
		if (t==sum) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
	}

	public static void main(String[] args) {
		isPalindrome(151);
		isPalindrome(222);
		isPalindrome(353);
		
		
	}

}
