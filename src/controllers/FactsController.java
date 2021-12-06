package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import dao.ConnectionDAO;
import dao.Constants;
import dao.FxDialogs;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * Class to control Dashboard screen widgets and activities
 * 
 * @author
 *
 */
public class FactsController implements Initializable {

	@FXML
	private Menu mainMenu;

	@FXML
	private MenuBar menuBar;

	@FXML
	private Label total;
	
	@FXML
	private Label car;

	@FXML
	private Label cycle;

	@FXML
	private Label bus;

	@FXML
	private Label male;

	@FXML
	private Label female;

	@FXML
	private Label rainy;
	
	@FXML
	private Label snowy;
	
	@FXML
	private Label foggy;
	
	@FXML
	private Label fact1;
	
	@FXML
	private Label fact2;
	
	@FXML
	private Label fact3;
	
	@FXML
	private Label fact4;
	
	@FXML
	private Label fact5;
	
	@FXML
	private Label fact6;

	@FXML
	private Label fact7;

	@FXML
	private Label fact8;

	@FXML
	private Label fact9;

	@FXML
	private Label fact10;

	@FXML
	private Label fact11;
	
	@FXML
	private Label fact12;
	
	@FXML
	private Label fact13;
	
	@FXML
	private Label fact14;
	
	@FXML
	private Label fact15;
	
	@FXML
	private Label fact16;
	
	@FXML
	private Label fact17;
	
	@FXML
	private Label fact18;
	
	@FXML
	private Label fact19;
	
	@FXML
	private Label fact20;
	
	@FXML
	private Label fact21;
	
	@FXML
	private Label fact22;
	
	@FXML
	private Label val1;
	
	@FXML
	private Label val2;
	
	@FXML
	private Label val3;
	
	@FXML
	private Label val4;
	
	@FXML
	private Label val5;
	
	@FXML
	private Label val6;

	@FXML
	private Label val7;

	@FXML
	private Label val8;

	@FXML
	private Label val9;

	@FXML
	private Label val10;

	@FXML
	private Label val11;
	
	@FXML
	private Label val12;
	
	@FXML
	private Label val13;
	
	@FXML
	private Label val14;
	
	@FXML
	private Label val15;
	
	@FXML
	private Label val16;
	
	@FXML
	private Label val17;
	
	@FXML
	private Label val18;
	
	@FXML
	private Label val19;
	
	@FXML
	private Label val20;
	
	@FXML
	private Label val21;
	
	@FXML
	private Label val22;
	
	@FXML
	private Label txtBox;

	/**
	 * This method is called by the FXMLLoader when initialization is complete
	 */
	@Override
	public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
		mainMenu.setGraphic(new ImageView("/Images/stackedlines.png"));
		populateFacts();
	}

	/**
	 * Method to populate charts
	 */
	private void populateFacts() {
		String totalAccidents = ConnectionDAO.getFact("");
		total.setText(totalAccidents);
		
		String carAccidents = ConnectionDAO.getFact("where lower(typeOfVehicle) like '%car%'");
		car.setText(carAccidents);
		
		String busAccidents = ConnectionDAO.getFact("where lower(typeOfVehicle) like '%bus%'");
		bus.setText(busAccidents);
		
		String cycleAccidents = ConnectionDAO.getFact("where lower(typeOfVehicle) like '% cycle%'");
		cycle.setText(cycleAccidents);
		
		String maleCasualties = ConnectionDAO.getFact("where lower(sexOfCasualty) like '%male%'");
		male.setText(maleCasualties);
		
		String femaleCasualties = ConnectionDAO.getFact("where lower(sexOfCasualty) like '%female%'");
		female.setText(femaleCasualties);
		
		String snow = ConnectionDAO.getFact("where lower(weatherConditions) like '%snowing%'");
		snowy.setText(snow);
		
		String rain = ConnectionDAO.getFact("where lower(weatherConditions) like '%raining%'");
		rainy.setText(rain);
		
		String fog = ConnectionDAO.getFact("where lower(weatherConditions) like '%fog%'");
		foggy.setText(fog);
		
		fact1.setText(Constants.dummy1);
		fact2.setText(Constants.dummy2);
		fact3.setText(Constants.dummy3);
		fact4.setText(Constants.dummy4);
		fact5.setText(Constants.dummy5);
		fact6.setText(Constants.dummy6);
		fact7.setText(Constants.dummy7);
		fact8.setText(Constants.dummy8);
		fact9.setText(Constants.dummy9);
		fact10.setText(Constants.dummy10);
		fact11.setText(Constants.dummy11);
		fact12.setText(Constants.dummy12);
		fact13.setText(Constants.dummy13);
		fact14.setText(Constants.dummy14);
		fact15.setText(Constants.dummy15);
		fact16.setText(Constants.dummy16);
		fact17.setText(Constants.dummy17);
		fact18.setText(Constants.dummy18);
		fact19.setText(Constants.dummy19);
		fact20.setText(Constants.dummy20);
		fact21.setText(Constants.dummy21);
		fact22.setText(Constants.dummy22);
		
		
		val1.setText(Constants.dummyVal1);
		val2.setText(Constants.dummyVal2);
		val3.setText(Constants.dummyVal3);
		val4.setText(Constants.dummyVal4);
		val5.setText(Constants.dummyVal5);
		val6.setText(Constants.dummyVal6);
		val7.setText(Constants.dummyVal7);
		val8.setText(Constants.dummyVal8);
		val9.setText(Constants.dummyVal9);
		val10.setText(Constants.dummyVal10);
		val11.setText(Constants.dummyVal11);
		val12.setText(Constants.dummyVal12);
		val13.setText(Constants.dummyVal13);
		val14.setText(Constants.dummyVal14);
		val15.setText(Constants.dummyVal15);
		val16.setText(Constants.dummyVal16);
		val17.setText(Constants.dummyVal17);
		val18.setText(Constants.dummyVal18);
		val19.setText(Constants.dummyVal19);
		val20.setText(Constants.dummyVal20);
		val21.setText(Constants.dummyVal21);
		val22.setText(Constants.dummyVal22);
		
		txtBox.setText(Constants.FACTS_TEXT_BOX);
	}

	
	
	@FXML
	private void loadCompare(ActionEvent ev) {
		// Hide this current window
        menuBar.getScene().getWindow().hide();
		
        Stage compare = new Stage();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/FXML/Compare.fxml"));
			Scene scene = new Scene(root);
			compare.setScene(scene);
			compare.show();
			compare.setResizable(false);
			compare.centerOnScreen();

		} catch (IOException ex) {
			ex.printStackTrace();
		}	
	}
	
	@FXML
	private void loadPredict(ActionEvent ev) {
		// Hide this current window
        menuBar.getScene().getWindow().hide();
        
		Stage predict = new Stage();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/FXML/Predict.fxml"));
			Scene scene = new Scene(root);
			predict.setScene(scene);
			predict.show();
			predict.setResizable(false);
			predict.centerOnScreen();

		} catch (IOException ex) {
			ex.printStackTrace();
		}	
	}
	
	@FXML
	private void loadMap(ActionEvent ev) {
		// Hide this current window
        menuBar.getScene().getWindow().hide();
        
		Stage map = new Stage();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/FXML/Map.fxml"));
			Scene scene = new Scene(root);
			map.setScene(scene);
			map.show();
			map.setResizable(false);
			map.centerOnScreen();

		} catch (IOException ex) {
			ex.printStackTrace();
		}	
	}
	
	@FXML
	private void loadScatter(ActionEvent ev) {
		// Hide this current window
        menuBar.getScene().getWindow().hide();
        
		Stage scatter = new Stage();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/FXML/Scatter.fxml"));
			Scene scene = new Scene(root);
			scatter.setScene(scene);
			scatter.show();
			scatter.setResizable(false);
			scatter.centerOnScreen();

		} catch (IOException ex) {
			ex.printStackTrace();
		}	
	}
	
	@FXML
	private void loadQuestions(ActionEvent ev) {
		// Hide this current window
        menuBar.getScene().getWindow().hide();
        
		Stage questions = new Stage();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/FXML/Questions.fxml"));
			Scene scene = new Scene(root);
			questions.setScene(scene);
			questions.show();
			questions.setResizable(false);
			questions.centerOnScreen();

		} catch (IOException ex) {
			ex.printStackTrace();
		}	
	}
	
	@FXML
	private void loadDashboard(ActionEvent ev) {
		// Hide this current window
        menuBar.getScene().getWindow().hide();
        
		Stage dashboard = new Stage();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/FXML/Dashboard.fxml"));
			Scene scene = new Scene(root);
			dashboard.setScene(scene);
			dashboard.show();
			dashboard.setResizable(false);
			dashboard.centerOnScreen();

		} catch (IOException ex) {
			ex.printStackTrace();
		}	
	}
	
	@FXML
	private void logout(ActionEvent ev) {

		Optional<ButtonType> response = FxDialogs.showConfirm("Road Accidents Leeds",
				"Would you like to Logout the application?");
		if (response.isPresent() && response.get().getText().equals("OK")) {
			// Hide this current window
			menuBar.getScene().getWindow().hide();

			Stage homepage = new Stage();
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/FXML/Homepage.fxml"));
				Scene scene = new Scene(root);
				homepage.setScene(scene);
				homepage.show();
				homepage.setResizable(false);
				homepage.centerOnScreen();

			} catch (IOException ex) {
				ex.printStackTrace();
			}
		} else {
			ev.consume();
		}
	}
}
