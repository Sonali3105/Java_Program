import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class DuplicateElementsInArray {

	public static void main(String[] args) {

		String names[]= {"Java", "Selenium", "Java" , "POM", "PHP"};

		//compare each element : time complexity is o(n*n) : worst solution 
	for(int i=0; i<names.length;i++) 
	{
		for(int j=i+1;j<names.length;j++)
		{
			if(names[i].equals(names[j])) {
		System.out.println("Duplicate elements is :"+ names[i]);}
		}
	}
	
	
	System.out.println("*********************");
	
	// using hasSet : store only unique values not duplicate values : o(n) 
	
	Set<String> store = new HashSet<String>();
	for(String val: names) {
		if(store.add(val) == false) {
			System.out.println("Duplicate elements is :"+ val);
		}
	}
	
	System.out.println("*********************");
	
	// using hashMap 
	Map<String,Integer> storemap = new HashMap<String,Integer>();
	
	for(String name : names) {
		Integer count = storemap.get(name);
		if(count == null) {
			storemap.put(name, 1);
		}
		else {
			storemap.put(name, ++count);
		}
	}
	
	 // To get duplicate element we have to use entrySet() and iterate the values by for loop 	
    Set<Entry<String,Integer>> entryset = storemap.entrySet();	
    for(Entry<String,Integer> entry : entryset) {
   	 if(entry.getValue()>1) {
			System.out.println("Duplicate element is : "+entry.getValue() +" "+ entry.getKey());
   	 }
    }
	
	System.out.println("*********************");
	
//		// get the values from HashMap by using Iterator
//	 	Set<Entry<String,Integer>> set = storemap.entrySet();	
//	
//	 	Iterator iterator = set.iterator();
//     	while(iterator.hasNext()) {
//        Map.Entry mentry = (Map.Entry)iterator.next();
//        if(((Entry<String, Integer>) set).getValue()>1) {
//        System.out.println("Key is "+ " " + mentry.getKey()+ " & Value is : "+  " "+ mentry.getValue());
//    	 	}
//     		}

	}
}

