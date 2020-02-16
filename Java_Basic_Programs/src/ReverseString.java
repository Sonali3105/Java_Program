

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	
		
				System.out.println("Enter string to reverse:");
		      
				 Scanner read = new Scanner(System.in);
			     String str = read.nextLine();
			     String reverse = "";

			     // Reverse String by using for loop and without reverse() method
			     
//			     for(int i=str.length()-1; i>=0; i--)
//			     {
//			    	 reverse = reverse + str.charAt(i); // append with reverse variable 
//			     }
//			     System.out.println("Reversed string is:"+ reverse);
//			      
			     
				// Reverse String with StringBuilder class with append() method 
			  
//					StringBuilder sb = new StringBuilder();
//					
//					for(int i = str.length() - 1; i >= 0; i--)
//					{
//						sb.append(str.charAt(i));
//					}
//					
//					System.out.println("Reversed string is:");
//					System.out.println(sb.toString());
					
					
					// Reverse String with StringBuffer class with reverse() method 
					
						StringBuffer sf = new StringBuffer();			
						System.out.println("Reversed string is:" + sf.reverse());
					     
			}

}

	


