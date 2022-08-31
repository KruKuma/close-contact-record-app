package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
	private Label enterFirstName;
	private Label enterLastName;
	private Label enterID;
	private Label enterPhoneNo;
	private TextField firstName;
	private TextField lastName;
	private TextField id;
	private TextField phone;
	private TextArea allPeople;
	private Button addButton, removeButton, listButton, loadButton, saveButton, exitButton;
	
	private static PeopleController peopleControl = new PeopleController();
	private static ConfirmBox confirm = new ConfirmBox();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			enterFirstName = new Label("Enter First Name");
			firstName = new TextField();
			enterLastName = new Label("Enter Last Name");
			lastName = new TextField();
			enterID = new Label("Enter Unique ID");
			id = new TextField();
			enterPhoneNo = new Label("Enter Phone Number");
			phone = new TextField();
			addButton = new Button("Add");
			removeButton = new Button("Remove");
			listButton = new Button("List");
			exitButton =  new Button("Exit");
			allPeople = new TextArea("People in this Application");
			loadButton = new Button("Load");
			saveButton = new Button("Save");
			exitButton = new Button("Exit");
			
			addButton.setOnAction(e->
				peopleControl.addPeopleToList(firstName.getText(), lastName.getText(),
						id.getText(), phone.getText())
					);
			
			removeButton.setOnAction(e->
				peopleControl.removePeopleFromList(firstName.getText(), lastName.getText())
					);
			
			listButton.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					String peoples=peopleControl.getPeopleList();
					allPeople.setText(peoples);
				}
			});
			
			loadButton.setOnAction(e->
				peopleControl.readFile()
					);
			
			saveButton.setOnAction(e->
				peopleControl.writeToFile()
					);
			
			exitButton.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					boolean answer = confirm.display();
					
					if(answer == true) {
						peopleControl.writeToFile();
						System.exit(0);
					}
					
					else {
						System.exit(0);
					}
				}
			});
			
			HBox r1 = new HBox(10);
			r1.getChildren().addAll(enterFirstName, firstName);
			
			HBox r2 = new HBox(10);
			r2.getChildren().addAll(enterLastName, lastName);
			
			HBox r3 = new HBox(10);
			r3.getChildren().addAll(enterID, id);
			
			HBox r4 = new HBox(10);
			r4.getChildren().addAll(enterPhoneNo, phone);
			
			HBox r5 = new HBox(10);
			r5.getChildren().addAll(addButton, removeButton, listButton);
			
			HBox r6 = new HBox(10);
			r6.getChildren().addAll(loadButton, saveButton);
			
			BorderPane bp = new BorderPane();
			bp.setRight(exitButton);
			
			VBox v1 = new VBox(10);
			v1.getChildren().addAll(r1, r2, r3, r4, r5, allPeople, r6, bp);
			
			Scene scene = new Scene(v1,600,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
