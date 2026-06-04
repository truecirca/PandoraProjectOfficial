package circa.projectpandora.model;

import java.util.ArrayList;
import java.util.Random;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * A class to hold all games currently available for randomization
 * @author Circa
 * @version 5/18/2026
 */
public class GamesAvaliable {
	
	private Game aGame;
	private DataImporter dataReader;
	private CurrentCharacter aCharacter;
	private CurrentCharacter tempCharacter;
	private Random randomGenerator;
	
	private int randomIndex;
	
	private ArrayList<Game> theGames;
	
	/**
	 * The constructor for the GamesAvaliable class
	 * @precondition none
	 */
	public GamesAvaliable() {
		this.theGames = new ArrayList<Game>();
		this.aGame = new Game();
		this.dataReader = new DataImporter();
		this.aCharacter = new CurrentCharacter();
		this.tempCharacter = new CurrentCharacter();
		this.randomGenerator = new Random();
		this.randomIndex = 0;
		this.setGamesAndDetails();
	}
	
	/**
	 * A method to build the database for the program (Outsource to file later)
	 * @precondition none
	 */	
	public void setGamesAndDetails() {
		
		for (int index = 0; index < this.dataReader.getCharacterListSize(); index++) {
			this.aCharacter.setCharacterName(this.dataReader.getCharacter(index));
			for (String currentBuild: this.dataReader.getCharacterBuilds(index)) {
				this.aCharacter.addCharacterBuild(currentBuild);
			}
			this.aGame.addCharacter(aCharacter);
			this.aCharacter = new CurrentCharacter();
		}
		
		this.theGames.add(aGame);
	}
	
	public ObservableList<String> getGameNames() {
		ObservableList<String> gameNames = FXCollections.observableArrayList();
		
		for (Game currentGame: this.dataReader.getGames()) {
			System.out.println(currentGame.getGameName());
			gameNames.add(currentGame.getGameName());
		}
		
		return gameNames;
	}
	/**
	 * A method to get a randomized character
	 * @precondition none
	 * @return the random character pulled
	 */
	public String getRandomCharacter() {
		this.randomIndex = randomGenerator.nextInt(this.aGame.getCharacterRoster().size());
		
		
		ArrayList<CurrentCharacter> tempRoster = this.aGame.getCharacterRoster();
		
		this.tempCharacter = tempRoster.get(randomIndex);
		
		String characterPull = tempCharacter.getCharacterName();
		
		return characterPull;
	}
	
	/**
	 * Get the pulled characters build
	 * @precondition none
	 * @return the characters build based on the character puled
	 */
	public String getRandomCharacterBuild() {
		ArrayList<String> pulledCharacterBuild = this.aGame.getCharacterBuild(this.tempCharacter);
		
		this.randomIndex = randomGenerator.nextInt(pulledCharacterBuild.size());
		
		return pulledCharacterBuild.get(this.randomIndex);
	}
	
}
