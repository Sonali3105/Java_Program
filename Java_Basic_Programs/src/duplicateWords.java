

import java.util.HashMap;
import java.util.Set;

public class duplicateWords {

	//hey java is not too good but java is too best language  
	// java : 2
	//too : 2
	//is : 2

	public static void findDuplicateWords(String inputString)
	{
		// split the words in words array 
		String words[]= inputString.split(" ");
		
		//Create HashMap for count the words 
		HashMap<String, Integer> wordcount = new HashMap<String, Integer>();
		
		// to check each word in given array 
		
		for(String word: words )
		{
			//if word is present 
			if(wordcount.containsKey(word)) {
				wordcount.put(word.toLowerCase(), wordcount.get(word)+1);
			}
			else {
				wordcount.put(word,1);
			}
		}
		
		//extracting all the keys of map : wordcount
		Set<String> wordInString = wordcount.keySet();
		
		// iterate the loop through all the wors in wordCount 
		for(String word : wordInString)
		{
			if(wordcount.get(word)>1)
			{
				System.out.println(word+ " : " + wordcount.get(word));
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		findDuplicateWords("hey java is not too good but java is too best language ");
		findDuplicateWords("Hey Hey Hey Hey ");
		findDuplicateWords("Hey "); // its not printing anything  
	}

}
