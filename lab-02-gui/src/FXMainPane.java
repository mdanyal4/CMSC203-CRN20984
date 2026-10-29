import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	
	//  declare five buttons, a label, and a textfield
	private Button buttonHello, buttonHowdy, buttonChinese, buttonArabic, buttonClear, buttonExit;
	private Label labelFeedback;
	private TextField textFieldHelloWorld;
	
	//  declare two HBoxes
	private HBox hboxOne, hboxTwo;
	
	//student Task #4:
	//  declare an instance of DataManager
			DataManager dataManager = new DataManager();
	
	
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
			
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		
		// Buttons
	   buttonHello = new Button("Hello");
	   buttonHowdy = new Button("Howdy");
	   buttonChinese = new Button("Chinese");
	   buttonArabic = new Button("Arabic"); // extra button - just for fun
	   buttonClear = new Button("Clear");
	   buttonExit = new Button("Exit");
	    
	   // Label
	   labelFeedback = new Label("Feedback");
	   
	   // TextField
	   textFieldHelloWorld = new TextField("HelloWorld");
	   
	   
		//  instantiate the HBoxes
	   hboxOne = new HBox();
	   hboxTwo = new HBox();
		
		//student Task #4:
		//  instantiate the DataManager instance
	   dataManager = new DataManager();
	   
		//  set margins and set alignment of the components
	   
	   // margins
		HBox.setMargin(buttonHello, getInsets());
		HBox.setMargin(buttonHowdy, getInsets());
	    HBox.setMargin(buttonChinese, getInsets());
	    HBox.setMargin(buttonArabic, getInsets());
	    HBox.setMargin(buttonClear, getInsets());
	    HBox.setMargin(buttonExit, getInsets());
	   
	    // alignmnets
	    hboxOne.setAlignment(Pos.CENTER);
	    hboxTwo.setAlignment(Pos.CENTER);
	    
	    // setOnAction for each button
	    buttonHello.setOnAction(new ButtonHandler());
	    buttonHowdy.setOnAction(new ButtonHandler());
	    buttonChinese.setOnAction(new ButtonHandler());
	    buttonArabic.setOnAction(new ButtonHandler());
	    buttonClear.setOnAction(new ButtonHandler());
	    buttonExit.setOnAction(new ButtonHandler());
	    
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
	    hboxOne.getChildren().addAll(labelFeedback, textFieldHelloWorld); // adding label & textfield to hboxOne
	   
		//  add the buttons to the other HBox
	    hboxTwo.getChildren().addAll(buttonHello, buttonHowdy, buttonChinese, buttonArabic, buttonClear, buttonExit); // adding buttons to hboxTwo
	   
		//  add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(hboxOne, hboxTwo);
	   
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	private class ButtonHandler implements EventHandler<ActionEvent> {
		
		@Override
		public void handle(ActionEvent event) { // this method check what button has been pressed and gives output accordingly
			
			if (event.getTarget() == buttonHello) { // default
				textFieldHelloWorld.setText(dataManager.getHello());
			}
			
			else if (event.getTarget() == buttonHowdy) { // Howdy
				textFieldHelloWorld.setText(dataManager.getHowdy());
			}
			
			else if (event.getTarget() == buttonChinese) { // in Chinese
				textFieldHelloWorld.setText(dataManager.getChinese());
			}
			
			else if (event.getTarget() == buttonArabic) { // in Arabic
				textFieldHelloWorld.setText(dataManager.getArabic());
			}
			
			else if (event.getTarget() == buttonClear) { // clears the TextField
				textFieldHelloWorld.setText("");
			}
			
			else if (event.getTarget() == buttonExit) { // exits the program
				Platform.exit();
				System.exit(0);
			}
		}
		
	}
}