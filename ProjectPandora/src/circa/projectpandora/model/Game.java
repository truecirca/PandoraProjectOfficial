package circa.projectpandora.model;

import java.util.ArrayList;

/**
 * A game class to hold character objects for randomization
 * @author Circa
 * @version 5/16/2026
 */
public class Game {
	private String gameName;
	private ArrayList<CurrentCharacter> characterRoster;
	
	/**
	 * A default constructor for the Game class
	 * @precondition none
	 */
	public Game() {
		this.gameName = "";
		this.characterRoster = new ArrayList<CurrentCharacter>();
	}
	
	/**
	 * A method to set the game name
	 * @precondition the game name may not be null
	 * @param gameName the games name
	 */
	public void setGameName(String gameName) {
		if (gameName == null) {
			throw new IllegalArgumentException("The game name may not be null.");
		} else {
			this.gameName = gameName;
		}
	}
	
	/**
	 * A method to get the games name
	 * @precondition none
	 * @return the games name
	 */
	public String getGameName() {
		return this.gameName;
	}
	
	/**
	 * A method to add a character to the roster for the given game
	 * @precondition the character object may not be null
	 * @param newCharacter the character to be added
	 */
	public void addCharacter(CurrentCharacter newCharacter) {
		if (newCharacter == null) {
			throw new IllegalArgumentException("The character may not be null.");
		} else {
			this.characterRoster.add(newCharacter);
			
		}
	}
	
	/**
	 * A method to add a build for the current character
	 * @precondition the build can't be null
	 * @param buildOptiont the build option to be added
	 * @param theCharacter the character to add the build to
	 */
	public void addBuild(String buildOption, CurrentCharacter theCharacter) {
		if (buildOption == null) {
			throw new IllegalArgumentException("Build can't be null.");
		} else {
			for (CurrentCharacter aCharacter: this.characterRoster) {
				if (aCharacter.equals(theCharacter)) {
					aCharacter.addCharacterBuild(buildOption);
				}
			}
		}
	}
	
	public ArrayList<String> getCharacterBuild(CurrentCharacter theCharacter) {
		ArrayList <String> theOutput = new ArrayList<String>();
		for (CurrentCharacter character: this.characterRoster) {
			if (character.equals(theCharacter)) {
				theOutput = character.getCharacterBuilds();
			}
		}
		
		return theOutput;
	}
	
	/**
	 * A method to get the current roster of characters 
	 * @precondition none
	 * @return the character roster
	 */
	public ArrayList<CurrentCharacter> getCharacterRoster() {
		return this.characterRoster;
	}

}
