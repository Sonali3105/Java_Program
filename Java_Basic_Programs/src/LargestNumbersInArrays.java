
public class LargestNumbersInArrays {

	public static void main(String[] args) {
		
		int array[] = {2,5,1,10};
	
		int first_largest = array[0];
		int second_largest = array[0];
	
		for(int i=0; i<array.length;i++)
		{
			if(first_largest<array[i])
			{
				second_largest= first_largest;
				first_largest= array[i];	
			}
			else if (second_largest<array[i]) {
				second_largest= array[i];		
			}
		}
		System.out.println("first largest number is : "+ first_largest + " and Second largest number is "+ second_largest);
		// if we want to find second largest number in array 
		System.out.println(" Second largest number is "+ second_largest);
		
		// find largest and smallest numbers in array
		int array1[] = {6,8,1,33};
		
		int smallest = array[0];
		int largest = array[0];
		
		for(int i=0; i<array.length;i++)
		{
			if(largest<array[i])
			{
				largest= array[i];	
			}
			else if (smallest>array[i]) {
				smallest= array[i];		
			}
		}
		System.out.println(" largest number is : "+ largest + " and  Smallest number is "+ smallest);
		
	}
}

