package com.javaconcepts.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JavaFXApplicationDemo1 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void init() {
		System.out.println("Initializing the Application...");
	}

	@Override
	public void stop() {
		System.out.println("Terminating the Application...");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("Inside the start() method");

		// creating a root node (GridPane)
		GridPane rootGridPane = new GridPane();
		rootGridPane.setPrefHeight(600);
		rootGridPane.setPrefWidth(600);
		rootGridPane.setGridLinesVisible(false);
		rootGridPane.setVgap(10);
		rootGridPane.setHgap(10);

		// Adding a button
		Button myButton = new Button("Click Here");
		GridPane.setConstraints(myButton, 2, 2, 2, 2);
		rootGridPane.getChildren().add(myButton);
		Label myClickButtonLabel = new Label("Click on the button above");
		GridPane.setConstraints(myClickButtonLabel, 2, 4, 2, 2);
		rootGridPane.getChildren().add(myClickButtonLabel);
		

		// creating a scene and setting the stage
		primaryStage.setTitle("First JavaFX Application");
		Scene myScene = new Scene(rootGridPane, 240, 340);
		primaryStage.setScene(myScene);
		primaryStage.show();
	}

}
