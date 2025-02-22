package controllers;

import helpers.DisplayFoodItems;
import helpers.InfoStore;
import helpers.ScreenHandler;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.List;
import database.models.FoodItem;
import database.models.Item;

/*
 * Controller for the new/edit list page
 */
public class NewListSceneController {

	@FXML
    private ListView<String> newListListView;

	InfoStore store = InfoStore.getInstance();
	List<Item> itemList = store.getList();

	@FXML
	public void initialize() {
		itemList = store.getList();

		List<String> foodNames = new ArrayList<String>();
		foodNames = DisplayFoodItems.ListFoodItems(itemList);
		newListListView.getItems().addAll(foodNames);
		// load stuff into labels
		// individualListSceneTitle.setText("HI");
		// individualListSceneDescription.setText("HI");
		// evaluationText.setText("HI");
		
	}

	// @FXML private Button gamesModuleButton = new Button();
	// @FXML private Button quitButton = new Button();
	// @FXML private ChoiceBox<String> topicChoiceBox = new ChoiceBox<>();
	// @FXML private Label achievementsLabel = new Label();
	// @FXML private Label helpLabel = new Label();

	// Runs when an item is pressed
	public void activateItemPopup(ActionEvent e) {
		 ScreenHandler.changeTo("searchScene");
	}

	// Runs when the search button is pressed
	public void activateSearchPopup(ActionEvent e) {
		// ScreenHandler.changeTo("gameTopic");
	}

	// Runs when the back button is pressed
	public void buttonBack(ActionEvent e) {
		ScreenHandler.changeTo("main");
	}

	/// Runs when the submit button is pressed
	public void buttonSubmit(ActionEvent e) {
		ScreenHandler.changeTo("main");
		//insert submission to database
	}

}
