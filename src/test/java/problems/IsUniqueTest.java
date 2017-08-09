package problems;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsUniqueTest {

	@Test
	public void isUniqueTest_uniqueCharactersString_returnsTrue() {
		 String uniqueCharacters= "donkey";
		 
		 IsUnique isUnique = new IsUnique();
		 
		 assertTrue(isUnique.uniqueCharactersString(uniqueCharacters));
		
		
	}
	
	@Test
	public void isUniqueTest_notUniqueCharactersString_retunrsFalse() {
		String notUniqueCharacters = "madam";
		
		IsUnique notUnique = new IsUnique();
		
		assertFalse(notUnique.uniqueCharactersString(notUniqueCharacters));
		
	}
	
	@Test
	public void isUniqueTest_uniqueCharactersStringWithMap_returnsTrue() {
		 String uniqueCharacters= "donkey";
		 
		 IsUnique isUnique = new IsUnique();
		 
		 assertTrue(isUnique.uniqueCharactersStringWithMap(uniqueCharacters));
		
		
	}
	
	@Test
	public void isUniqueTest_notUniqueCharactersStringWithMap_retunrsFalse() {
		String notUniqueCharacters = "madam";
		
		IsUnique notUnique = new IsUnique();
		
		assertFalse(notUnique.uniqueCharactersStringWithMap(notUniqueCharacters));
		
	}

}
