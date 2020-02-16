

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;



public class ArrayList_UserInfo {
	
	public static void main(String args[])
	{
		// By User defined class object arraylist 
		
		// add data in different object like user1 , user2, and user3  
		UserInfo user1 = new UserInfo(1, 42, "apple", "3/1/2020");
		UserInfo user2 = new UserInfo(2, 22, "milk", "25/1/2020");
		UserInfo user3 = new UserInfo(3, 88, "banana", "6/2/2020");
		
		//Create arraylist with class object 	
		// add data in arraylist
		ArrayList<UserInfo> ar2 = new ArrayList<UserInfo>();
		ar2.add(user1);
		ar2.add(user2);
		ar2.add(user3);
		
		//Iterator to traverse the values 
		java.util.Iterator<UserInfo> it= ar2.iterator();
		
		
		// we can not use for because we can not find the val from indexes
		
		while(it.hasNext()) // it.hasNext() method check that iterator having value in  next (first) element ?
		{
			UserInfo val= it.next(); // it. next method point to the first element
			System.out.println(val.productNo);
			System.out.println(val.userid);
			System.out.println(val.productName);
			System.out.println(val.expDate);
		}

		
		
		// Use arraylist by non- primitive datatype as String 
		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("Amit");
		ar3.add("Sonali");
		ar3.add("Tejas");
		
		ArrayList<String> ar4 = new ArrayList<String>();
		ar4.add("Tom");
		ar4.add("Harry");
		ar4.add("Meghan");
		
		// add all the data of ar4 is adding in to the ar3 arraylist 
		ar3.addAll(ar4);
		
		for(int i = 0; i<ar3.size(); i++)
		{
		System.out.println(ar3.get(i));
		}
		
		// remove all the data of ar4 is adding in to the ar3 arraylist 
		ar3.removeAll(ar4);
		
		for(int i = 0; i<ar3.size(); i++)
		{
		System.out.println(ar3.get(i));
		}
		
		
				// Use arraylist by primitive datatype as Integer 
				ArrayList<Integer> ar5 = new ArrayList<Integer>();
				ar5.add(10);
				ar5.add(20);
				
				
				ArrayList<Integer> ar6 = new ArrayList<Integer>();
				ar6.add(20);
				ar6.add(30);
				
				
				// retrive common values from both arraylist  
				ar5.retainAll(ar6);
				
				for(int i = 0; i<ar5.size(); i++)
				{
				System.out.println(ar5.get(i));
				}
				
	}

}
