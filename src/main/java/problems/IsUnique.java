package problems;

import java.util.HashMap;

public class IsUnique {
	
	public Boolean uniqueCharactersString(String word) {
		
		for(int i=0; i<word.length(); i++){
			for(int j=i+1; j<word.length()-1; j++){
				char a = word.charAt(i);
				char b = word.charAt(j);
				
				if(a == b) {
					return false;
				}
			}
		}
		
		return true;
	}
	//time complexity: O(n^2), where n is number of letters in the word
	//space complexity: O(1)
	
	public Boolean uniqueCharactersStringWithMap(String word) {
		HashMap<Character, Boolean> uniqueCharactersHashMap = new HashMap<Character, Boolean>();
		
		for(int i=0; i<word.length(); i++) {
			char a = word.charAt(i);
			
			if (uniqueCharactersHashMap.get(a) == null) {
				uniqueCharactersHashMap.put(a, true);
			} else {
				return false;
			}
		}
		
		return true;
	}

}
