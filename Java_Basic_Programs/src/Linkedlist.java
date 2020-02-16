

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args)
	{
	
		LinkedList<String> ll= new LinkedList<String>();
		
		//add:
		ll.add("test");
		ll.add("Selenium");
		ll.add("Webdriver");
		ll.add("and");
		ll.add("qtp");
		
		System.out.println("Content of Linkedlist: "+ll);
		//addfirst:
		ll.addFirst("Sonali");
		//addlast:
		ll.addLast("QC");
		System.out.println("Content of Linkedlist: "+ll);
		
		//get:
		System.out.println(ll.get(0));
		//set: 
		ll.set(0, "Sonu");
		System.out.println(ll.get(0));
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Content of Linkedlist: "+ll);
		
		ll.remove(2);
		System.out.println("Content of Linkedlist: "+ll);
		
		System.out.println("*****Using for loop");
		for(int n=0;n<ll.size();n++)
		{
			System.out.println(ll.get(n));
		}
		
		System.out.println("*****Using for advanced loop");
		for(String str:ll)
		{
			System.out.println(str);
		}
		
		//iterator  
		
		/*System.out.println("*****Using iterator");
		
		Iterator<String> ie=ll.iterator();
		
		while(ie.hasNext())
		{
			System.out.println(ie.next());
		}*/
		
		//while loop 
		
		System.out.println("*****Using while loop");
		int num=0;
		while(ll.size()>num)
		{
			System.out.println(ll.get(num));
			num++;
		}
	}

}
