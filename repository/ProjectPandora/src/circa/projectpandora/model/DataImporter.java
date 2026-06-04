package circa.projectpandora.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class to interact with the file and read and store the data from it for use
 * @author Circa
 * @version 5/27/2026
 */
public class DataImporter {
	private Scanner fileScanner;
	private ArrayList<String> fileContent;
	private ArrayList<CurrentCharacter> characters;
	private ArrayList<Game> games;
	private int gameCount;
	
	private Game AnotherGame;
	private CurrentCharacter character;
	
	/**
	 * A constructor for the DataImprter class
	 * @precondition none
	 */
	public DataImporter() {
		this.AnotherGame = new Game();
		this.character = new CurrentCharacter();
		this.characters = new ArrayList<CurrentCharacter>();
		this.games = new ArrayList<Game>();
		this.gameCount = 0;
		
		this.getFileData();
		this.buildDataBase();
	}
	
	/**
	 * A method to interact with the file and get the data from it
	 * @precondition none
	 */
	public void getFileData() {
		try {
			File inputFile = new File("gameData.txt");
			this.fileScanner = new Scanner(inputFile);
			this.fileContent = new ArrayList<String>();
			
			while (this.fileScanner.hasNextLine()) {
				String tempInput = this.fileScanner.nextLine();
				this.fileContent.add(tempInput);
			}
			
			this.fileScanner.close();
			
//			for (String currentLine: this.fileContent) {
//				System.out.println(currentLine);
//			}
			
		
		} catch (FileNotFoundException theException) {
			System.out.println("The file failed to open.");
		}
	
	}
	
	/**
	 * A to string method to get the data from the class
	 * @precondition none
	 * @return the data from the class
	 */
	public String toString() {
		String toReturn = "";
		
		for (String currentData: this.fileContent) {
			toReturn += currentData + "\n";
		}
		
		return toReturn;
		
	}
	
	/**
	 * A method to get the data from the file 
	 * @precondition none
	 */
	public void buildDataBase() {
		String temp = "";
		
		for (String currentData: this.fileContent) {
			if (currentData.charAt(0) == '*') {
				temp = currentData;
				temp = temp.substring(1);
				this.AnotherGame.setGameName(temp);
				this.gameCount++;
			} else {
			String[] data = {""};
			data = currentData.split(",");
			
			String characterToBe = "";
			
			this.character = new CurrentCharacter();
			for (int index = 0; index < data.length; index++) {
				if (index == 0) {
					characterToBe = data[index];
					this.character.setCharacterName(characterToBe);;
				} else {
					this.character.addCharacterBuild(data[index]);
				}
			}
			this.characters.add(character);
			}
			
			this.games.add(AnotherGame);
		}
		
		System.out.println(this.characters.toString());
	}
	
	public ArrayList<Game> getGames() {
		return this.games;
	}
	
	/**
	 * A method to get the desired character
	 * @param theIndex the index for the desired character in the list
	 * @return the characters name
	 */
	public String getCharacter(int theIndex) {
		return this.characters.get(theIndex).getCharacterName();
	}
	
	/**
	 * A method to return the current characters build options
	 * @precondition none
	 * @param theIndex the index of the desired character in the list
	 * @return the current characters build options
	 */
	public ArrayList<String> getCharacterBuilds(int theIndex) {
		return this.characters.get(theIndex).getCharacterBuilds();
	}
	
	/**
	 * A method to get the amount of games being added
	 * @precondition none
	 * @return the count of games to be added
	 */
	public int getGameCount() {
		return this.gameCount;
	}
	
	/**
	 * A method to get the size of the character list
	 * @precondition none
	 * @return the size of the character array list
	 */
	public int getCharacterListSize() {
		return this.characters.size();
	}

}
