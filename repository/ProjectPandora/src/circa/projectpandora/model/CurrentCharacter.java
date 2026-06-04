package circa.projectpandora.model;

import java.util.ArrayList;

/**
 * The character class used to store character name and build options for randomization
 * @author Circa
 * @version 5/16/2026
 */
public class CurrentCharacter {
	private String characterName;
	private ArrayList<String> characterBuilds;
	
	/**
	 * A constructor for the Character class to set up variables
	 * @precondition name may not be null
	 * @param name the characters name
	 */
	public CurrentCharacter(String name) {
		if (name == null) {
			throw new IllegalArgumentException("The character name was null.");
		} else {
			this.characterName = name;
			this.characterBuilds = new ArrayList<String>();
		}
	}
	
	/**
	 * A default constructor for the character class
	 * @precondition none
	 */
	public CurrentCharacter() {
		this.characterName = "noName";
		this.characterBuilds = new ArrayList<String>();
	}
	
	/**
	 * A method to set the characters name
	 * @precondition the characters name may not be null
	 * @param characterName the characters name
	 */
	public void setCharacterName(String characterName) {
		if (characterName == null) {
			throw new IllegalArgumentException("Character name may not be null.");
		} else {
			this.characterName = characterName;
		}
	}
	
	/**
	 * A method to return the characters name
	 * @precondition none
	 * @return the characters name
	 */
	public String getCharacterName() {
		return this.characterName;
	}
	
	/**
	 * A method to add a new build option to the character class
	 * @precondition the build may not be null
	 * @param characterBuild the character build to add
	 */
	public void addCharacterBuild(String characterBuild) {
		if (characterBuild == null) {
			throw new IllegalArgumentException("Character build was null.");
		} else {
			this.characterBuilds.add(characterBuild);
		}
	}
	
	public ArrayList<String> getCharacterBuilds() {
		return this.characterBuilds;
	}
	
	/**
	 * A toString method to return a description of the character object
	 * @precondition none
	 */
	public String toString() {
		String description = "Character Name: " + this.characterName + "\n";
		
		for (String currentBuild: this.characterBuilds) {
			description +="Build: " + currentBuild + "\n";
		}
		
		return description;
	}
}
