package circa.projectpandora.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import circa.projectpandora.model.CurrentCharacter;

class TestCurrentCharacterClass {

	@Test
	void testCurrentCharacterDefaultConstructor() {
		CurrentCharacter testCharacter = new CurrentCharacter();
		
		String actual = testCharacter.toString();
		
		assertEquals("Character Name: noName\n", actual);
	}
	
	@Test
	void testCurrentCharacterConstructor() {
		CurrentCharacter testCharacter = new CurrentCharacter("Silent");
		
		String actual = testCharacter.toString();
		
		assertEquals("Character Name: Silent\n", actual);
	}
	
	@Test
	void testCurrentCharacterAddABuild() {
		CurrentCharacter testCharacter = new CurrentCharacter("Silent");
		
		testCharacter.addCharacterBuild("Shiv");
		
		String actual = testCharacter.toString();
		
		assertEquals("Character Name: Silent\nBuild: Shiv\n", actual);
	}
	
	@Test
	void testCurrentCharacterAddMultipleBuilds() {
		CurrentCharacter testCharacter = new CurrentCharacter("Silent");
		
		testCharacter.addCharacterBuild("Shiv");
		testCharacter.addCharacterBuild("Discard");
		testCharacter.addCharacterBuild("Finisher");
		
		String actual = testCharacter.toString();
		
		assertEquals("Character Name: Silent\nBuild: Shiv\nBuild: Discard\nBuild: Finisher\n", actual);
	}
	

}
