

public class ArmstrongNumber {

	// 153 
	// 1*1*1=1  +   5*5*5=125  +   3*3*3 = 27
	// 1+125+27 = 153
	// 0 1 is Armstrong number 
	// 407 , 370 , 371 are Armstrong number 
	
	public static void isArmstrongnumber(int num)
	{
		int cube =0;
		int t;
		int r;
		t= num;
		
		while(num>0) {
			r = num %10; // 1. give remainder = 153%10= 3 // 2. remainder = 15%10= 5 //  3. remainder =1  
			num = num/10; //1.  153/10 = 15.3 (15) bcz its int so exclude 3 so num = 15 // 2. num =15/10 = 1 // 3. num 1/10= =0
			cube = cube+(r*r*r); //1.   0+(3*3*3) = 27 // 2.  27+(5*5*5)=152   // 3. 152+(1*1*1)=153  
		}
		
		if(cube==t) {
			System.out.println("This is armstrong number");
		}else {
			System.out.println("This is not  armstrong number");
		}
	}
	
	
	public static void main(String[] args) {
		isArmstrongnumber(153);	
		
	}

}
