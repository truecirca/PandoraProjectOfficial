package circa.pandora.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import circa.pandora.model.SlayTheSpireHandler;

class TestSpireHandler {

	@Test
	void testGameNameIsSet() {
		SlayTheSpireHandler theHandler = new SlayTheSpireHandler();
		
		String actual = theHandler.getGameName();
		
		assertEquals("Slay the Spire II", actual);
	}
	
	@Test
	void testIronCladAddedToHashMap() {
		SlayTheSpireHandler theHandler = new SlayTheSpireHandler();
		
		ArrayList<String> actual = theHandler.getMap().get("Iron Clad");
		
		ArrayList<String> expected = new ArrayList<String>();
		
		expected.add("Armor");
		expected.add("Strike");
		expected.add("Combo");
		expected.add("Vulnerable");
		expected.add("No Cost");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testDefectAddedToHashMap() {
		SlayTheSpireHandler theHandler = new SlayTheSpireHandler();
		
		ArrayList<String> actual = theHandler.getMap().get("Defect");
		
		ArrayList<String> expected = new ArrayList<String>();
		
		expected.add("Lightning");
		expected.add("Darkness");
		expected.add("Glass");
		expected.add("Ice");
		expected.add("No Orbs");
		expected.add("Max Orbs");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testRegentAddedToHashMap() {
		SlayTheSpireHandler theHandler = new SlayTheSpireHandler();
		
		ArrayList<String> actual = theHandler.getMap().get("The Regent");
		
		ArrayList<String> expected = new ArrayList<String>();
		
		expected.add("Sword Summon");
		expected.add("Card Creation");
		expected.add("Deck Minipulation");
		expected.add("Combo");
		
		assertEquals(expected, actual);
	}

	@Test
	void testNecrobunderAddedToHashMap() {
		SlayTheSpireHandler theHandler = new SlayTheSpireHandler();
		
		ArrayList<String> actual = theHandler.getMap().get("The Necrobinder");
		
		ArrayList<String> expected = new ArrayList<String>();
		
		expected.add("Summon");
		expected.add("Block and Doom");
		expected.add("Hand Combo");
		expected.add("Doom");
		expected.add("Sacrifice Hand");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testSilentAddedToHashMap() {
		SlayTheSpireHandler theHandler = new SlayTheSpireHandler();
		
		ArrayList<String> actual = theHandler.getMap().get("Silent");
		
		ArrayList<String> expected = new ArrayList<String>();
		
		expected.add("Shiv");
		expected.add("Poisin");
		expected.add("Discard");
		expected.add("0 Cost");
		expected.add("Finisher");
		
		assertEquals(expected, actual);
	}
	
}
