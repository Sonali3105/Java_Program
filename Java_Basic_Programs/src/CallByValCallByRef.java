

public class CallByValCallByRef {
	//Global variables
	int j;
	int k;
	
	public static void main(String[] args) {
		
		
	CallByValCallByRef obj=new CallByValCallByRef();
		double p=77.77;
		double q=66.66;
		double val= obj.div(p, q);// call by value / pass by value 
									//( copy of p and q is given to the c and d ) 
		System.out.println(val); 
		
		obj.j=10;
		obj.k=20;
		
		obj.swap(obj);

		// after swap 
		System.out.println(obj.j); //j=20
		System.out.println(obj.k);  //k=10
	}
	
	//method for call by value 
	public double div(double c,double d)
	{
		
		return c/d;
		
	}
	
	
	//method for call by ref
	public void swap(CallByValCallByRef ref)
	{
		int temp;
		temp=ref.j; //temp=10
		ref.j=ref.k; //j=20
		ref.k=temp; //k=10
		
	}

}
