

public class primeNumber 
{
	// prime number can be divided by number itself or divided by 1 only
	//Lowest prime number is 2
	// 10 is not prime number bcz 10 can divided by 2 and 5 
	// 17 is not prime number bcz 17 can divide by 1 or 17 itself 
	
	
	public static boolean isPrimeNumber(int num)
	{
		if(num<=1)
		{
			return false;
		}
		
		for(int i = 2; i<num ; i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		
		}
		return true; 
	}
	
	public static void getprimeNumber(int num)
	{

		for(int i = 2; i<=num ; i++)
		{
			if (isPrimeNumber(num))
			{
				System.out.println(i + "");
			}
		}
	}
	public static void main (String args[])
	{
		System.out.println("3 is prime number? "+ isPrimeNumber(3));
		System.out.println("2 is prime number? "+ isPrimeNumber(2));
		System.out.println("1 is prime number? "+ isPrimeNumber(1));
		System.out.println("0 is prime number? "+isPrimeNumber(0));
		System.out.println("13 is prime number? "+isPrimeNumber(13));
		System.out.println("10 is prime number? "+ isPrimeNumber(10));
		
		System.out.println("-5 is prime number? "+isPrimeNumber(-5));
		
		// getting prime numbers from 2 to 20 
		getprimeNumber(20);
		
	}

}
