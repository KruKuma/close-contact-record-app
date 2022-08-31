package application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmBox {
	
	static boolean answer;
	
	public boolean display() {
		
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle("Exit Confirmation");
		window.setMinWidth(300);
		Label label = new Label();
		label.setText("Save Change?");
		
		Button yesButton = new Button("Yes");
		Button noButton = new Button("No");
	
		yesButton.setOnAction(e -> {
				answer = true;
				window.close();
			
		});
		
		noButton.setOnAction(e -> {
			answer = false;
			window.close();
			
		});
		
		HBox r1 = new HBox(10);
		r1.getChildren().addAll(label);
		
		HBox r2 = new HBox(10);
		r2.getChildren().addAll(yesButton, noButton);
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(r1, r2);
		
		r1.setAlignment(Pos.CENTER);
		r2.setAlignment(Pos.CENTER);
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();
		
		return answer;
		
	}
}
