package circa.pandora.model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * A class to build the data for Slay the SpireII
 * @author Circa
 * @version 6/1/2026
 */
public class SlayTheSpireHandler {
	private String gameName;
	private String tempCharacter;
	
	private ArrayList<String> tempBuilds;
	
	private String[] characters;
	
	private HashMap<String, ArrayList<String>> characterBuilds;
	
	/**
	 * Default constructor for this handler class
	 * @precondition none
	 */
	public SlayTheSpireHandler() {
		this.gameName = "Slay the Spire II";
		this.tempCharacter = "";
		this.characters = new String[5];
		this.tempBuilds = new ArrayList<String>();
		this.characterBuilds = new HashMap<String, ArrayList<String>>();
		
		
		this.characterRosterInitializer();
		this.tempBuildsHandler();
	}
	
	/**
	 * A method to create the character list
	 * @precondition none
	 */
	private void characterRosterInitializer() {
		this.characters[0] = "Iron Clad";
		this.characters[1] = "Defect";
		this.characters[2] = "The Regent";
		this.characters[3] = "The Necrobinder";
		this.characters[4] = "Silent";
	}
	
	/**
	 * A method to build the hashmap for combos linked to characters
	 * @precondition none
	 */
	private void tempBuildsHandler() {
		this.tempBuilds.add("Armor");
		this.tempBuilds.add("Strike");
		this.tempBuilds.add("Combo");
		this.tempBuilds.add("Vulnerable");
		this.tempBuilds.add("No Cost");
		
		this.characterBuilds.put(this.characters[0], this.tempBuilds);
		
		ArrayList<String> defect = new ArrayList<String>();
				
		defect.add("Lightning");
		defect.add("Darkness");
		defect.add("Glass");
		defect.add("Ice");
		defect.add("No Orbs");
		defect.add("Max Orbs");
		
		this.characterBuilds.put(this.characters[1], defect);
		
		ArrayList<String> regent = new ArrayList<String>();
		
		regent.add("Sword Summon");
		regent.add("Card Creation");
		regent.add("Deck Minipulation");
		regent.add("Combo");
		
		this.characterBuilds.put(this.characters[2], regent);
		
		ArrayList<String> necrobinder = new ArrayList<String>();
		
		necrobinder.add("Summon");
		necrobinder.add("Block and Doom");
		necrobinder.add("Hand Combo");
		necrobinder.add("Doom");
		necrobinder.add("Sacrifice Hand");
		
		this.characterBuilds.put(this.characters[3], necrobinder);
		
		ArrayList<String> silent = new ArrayList<String>();
		
		silent.add("Shiv");
		silent.add("Poisin");
		silent.add("Discard");
		silent.add("0 Cost");
		silent.add("Finisher");
		
		this.characterBuilds.put(this.characters[4], silent);
	}
	
	/**
	 * A method to get the desired characters build option
	 * @param characterName the character to find
	 * @return the characters build options
	 */
	public ArrayList<String> getCharacterBuilds(String characterName) {
		
		ArrayList<String> tempList = new ArrayList<String>();
		
		if (this.characterBuilds.containsKey(characterName)) {
			tempList = this.characterBuilds.get(characterName);
		} else {
			tempList.add("Character not found.");
		}
		
		return tempList;
	}
	
	/**
	 * A method to get the class hashmap containing characters and their build options
	 * @precondition none
	 * @return the hashmap of the characters and their builds
	 */
	public HashMap<String, ArrayList<String>> getMap() {
		return this.characterBuilds;
	}
	
	/**
	 * A method to get the list of characters for this game
	 * @precondition none
	 * @return the list of characters
	 */
	public String getCharacterRandom(int randomNumber) {
		return this.characters[randomNumber];
	}
	
	public String getBuildRandom(int randomNumber, String key) {
		return this.characterBuilds.get(key).get(randomNumber);
	}
	
	/**
	 * A getter method for the game name
	 * @precondition none
	 * @return the games name
	 */
	public String getGameName() {
		return this.gameName;
	}
}
