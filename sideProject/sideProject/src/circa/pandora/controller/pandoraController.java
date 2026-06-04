package circa.pandora.controller;

import circa.pandora.model.Randomizer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class pandoraController {

	private Randomizer randomizer;
	
    @FXML
    private Label buildLbl;

    @FXML
    private Label characterLbl;

    @FXML
    private Button randomBtn;

    @FXML
    public void initialize() {
    	this.randomizer = new Randomizer();
    	
    	this.characterLbl.setText(this.randomizer.getRandomCharacter());
    }
    
    @FXML
    void randomize(ActionEvent event) {
    	this.characterLbl.setText(this.randomizer.getRandomCharacter());
    	this.buildLbl.setText(this.randomizer.getRandomBuild());
    }
}

