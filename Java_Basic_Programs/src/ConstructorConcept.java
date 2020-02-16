

public class ConstructorConcept {
	
	String name;
	//String name1;
	int age;
	
	public ConstructorConcept()
	{
		System.out.println("default constructor");
	}
	
	public ConstructorConcept(String name, int age)
	{
		this.name=name; // this keyword is used for assigned global var with (instance variable) constructor value 
		this.age=age;
		//name1=name; // assigned global var with local var without this keyword (its right)
		
		System.out.println("name: "+name+" age:"+age);
	}
	
	

	public static void main(String[] args) {
		
		ConstructorConcept obj =new ConstructorConcept();// called default constructor
		ConstructorConcept obj1 = new ConstructorConcept("Sona",25); //called parameterized constructor
		
		
		System.out.println(obj.age + obj.name);
		System.out.println(obj1.age + obj1.name);
	}

}
