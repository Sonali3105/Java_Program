// Program for string concatenation  // documentation

						// import statement (but here no need)
public class StringConcat {

	public static void main(String[] args) // main method to execute statements
	{
		int a=100 , b= 200; // variable declaration
		String x="Selenium" , y="Webdriver";
		
		double d=11.22 , e=55.99;
		
		
		
		System.out.println(a+b); //Here "+" is arithmetic Operator for integers variables
		
		System.out.println(x+y); // Here "+" is Concatenation Operator for string variables
		
		// to print the statement use System.out.println(statements / variables);
		
		System.out.println(a+b+x+y);

		System.out.println(x+y+a+b);

		System.out.println(x+y+(a+b));
		
		System.out.println(a+b+x+y+a+x+b+y);
		
		System.out.println(a+b+x+y+a+b);
		
		System.out.println(x+y+d+e);
		
		System.out.println(d+e+x+y);
		
		System.out.println(d+e+a+b);
		
		System.out.println(x+y+d+e);
		
		System.out.println("SonaliPatel");
		
		System.out.println(b);
		
		System.out.println("Decimal value of d is :"+d);
		
		System.out.println("Integer value of b is :"+b);
		
		System.out.println("Decimal value of addition is : "+d+e);
		
		// Println(used to print with a new line) & print (is just used to print)
		System.out.print("Hello");// ln (Line New) is not write here so "Hello" will not print on new line and next Statement will be print with "Hello" 
		System.out.println("Software"); // create New line for print "World"
		System.out.println("Tester");
		
		
		//Remove Junk characters with Reg Expression : [^a-zA-Z0-9]
		String s1 ="657678Sonali&*^&*";
		
		s1= s1.replaceAll("[^a-zA-Z0-9]","" );
		System.out.println(s1);
		
		
	}

}
