package circa.pandora.model;

import java.util.Random;

/**
 * A class to randomize choice selection
 * @author Circa
 * @version 6/4/2026
 */
public class Randomizer {
	private Random randomize;
	private String randomCharacter;
	private String randomBuild;
	private int randomNumber;
	
	private SlayTheSpireHandler slayTheSpire;
	
	/**
	 * The constructor for the Randomizer class
	 * @precondition none
	 */
	public Randomizer() {
		this.randomize = new Random();
		this.randomCharacter = "";
		this.randomBuild = "";
		this.slayTheSpire = new SlayTheSpireHandler();
	}
	
	/**
	 * A class to get a randomly chosen character
	 * @precondition none
	 * @return the randomly chosen character
	 */
	public String getRandomCharacter() {
		this.randomNumber = this.randomize.nextInt(this.slayTheSpire.getMap().size());
		
		this.randomCharacter = this.slayTheSpire.getCharacterRandom(this.randomNumber);

		return this.randomCharacter;
	}
	
	/**
	 * A method to get a randomly chosen build for the randomly chosen character
	 * @precondition none
	 * @return the randomly chosen build for the randomly chosen character
	 */
	public String getRandomBuild() {
		this.randomNumber = this.randomize.nextInt(this.slayTheSpire.getCharacterBuilds(randomCharacter).size());
		
		this.randomBuild = this.slayTheSpire.getBuildRandom(this.randomNumber, this.randomCharacter);
		
		return this.randomBuild;
	}
}
