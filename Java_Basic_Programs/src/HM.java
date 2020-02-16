import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HM {

	public static void main(String[] args) {
		Map<Integer, String> mapHttpErrors = new java.util.HashMap<>();
	
		 	mapHttpErrors.put(200, "OK");
	        mapHttpErrors.put(303, "Informational");
	        mapHttpErrors.put(404, "Not Found");
	        mapHttpErrors.put(500, "Internal Server Error");

	        System.out.println(mapHttpErrors);   
	        
	        /* Get values based on key*/
	        System.out.println(mapHttpErrors.get(303));
	        
	        // Traversing the loop with Iterator and it displays content using Iterator
	        Set<Entry<Integer, String>> set = mapHttpErrors.entrySet();
	        
	        Iterator iterator = set.iterator();
		      while(iterator.hasNext()) {
		         Map.Entry mentry = (Map.Entry)iterator.next();
		         System.out.println("Key is "+ " " + mentry.getKey()+ " & Value is : "+  " "+ mentry.getValue());
		      }
	        
		      mapHttpErrors.remove(500);
		      System.out.println("Map key and values after removal:");
		      System.out.println(mapHttpErrors);
		      
		      Set<Entry<Integer, String>> set2 = mapHttpErrors.entrySet();
		      
		      Iterator it = set2.iterator();
		      while(it.hasNext()) {
		    	  Map.Entry m = (Map.Entry)it.next();
		    	  System.out.println("Key is "+ " " + m.getKey()+ " & Value is : "+  " "+ m.getValue());
		      }
		      
	     
	
	}

}
