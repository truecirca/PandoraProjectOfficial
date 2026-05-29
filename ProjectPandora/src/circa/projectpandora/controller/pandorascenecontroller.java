package circa.projectpandora.controller;

import circa.projectpandora.model.CurrentCharacter;
import circa.projectpandora.model.DataImporter;
import circa.projectpandora.model.Game;
import circa.projectpandora.model.GamesAvaliable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class pandorascenecontroller {
	
	private Game theGame;
	
	private DataImporter data;

	private CurrentCharacter theCharacter;
	
	private GamesAvaliable avaliableGames;
	
	private String characterName;
	
	private String characterBuild;

    @FXML
    private Label characterBuildLbl;

    @FXML
    private Label characterNameLbl;
    
    
    @FXML
    private Button randomizeBtn;
    

    @FXML
    private ComboBox<?> gameComboBox;

    
    @FXML
    private void initialize() {
    	this.theGame = new Game();
    	this.theCharacter = new CurrentCharacter();
    	this.avaliableGames = new GamesAvaliable();
    	
    	this.characterName = this.avaliableGames.getRandomCharacter();
    	this.characterNameLbl.setText(this.characterName);
    	
    	this.characterBuild = this.avaliableGames.getRandomCharacterBuild();
    	this.characterBuildLbl.setText(this.characterBuild);
    	
    	this.data = new DataImporter();
    	this.data.getFileData();
    	
    }
 

    @FXML
    void randomize(ActionEvent event) {
    	this.characterName = this.avaliableGames.getRandomCharacter();
    	this.characterNameLbl.setText(this.characterName);
    	
    	this.characterBuild = this.avaliableGames.getRandomCharacterBuild();
    	this.characterBuildLbl.setText(this.characterBuild);
    }
    
    
}

