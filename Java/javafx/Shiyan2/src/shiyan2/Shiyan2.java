/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiyan2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author AI小政
 */

public class Shiyan2 extends Application {
@Override
  public void start(Stage primaryStage) {
    FlowPane pane = new FlowPane();
    pane.setHgap(2);
    
    TextField tfNumber1 = new TextField();
    TextField tfNumber2 = new TextField();
    TextField tfResult = new TextField();
    
    tfNumber1.setPrefColumnCount(3);
    tfNumber2.setPrefColumnCount(3);
    tfResult.setPrefColumnCount(3);
    
    pane.getChildren().addAll(new Label("Number 1: "), tfNumber1,
      new Label("Number 2: "), tfNumber2, new Label("Result: "), tfResult);
    
    // Create four buttons
    HBox hBox = new HBox(5);
    Button btAdd = new Button("+");
    Button btSubtract = new Button("-");
    Button btMultiply = new Button("*");
    Button btDivide = new Button("/");
    hBox.setAlignment(Pos.CENTER);
    hBox.getChildren().addAll(btAdd, btSubtract, btMultiply, btDivide);
    
    BorderPane borderPane = new BorderPane();
    borderPane.setCenter(pane);
    borderPane.setBottom(hBox);
    BorderPane.setAlignment(hBox, Pos.TOP_CENTER);

    // Create a scene and place it in the stage
    Scene scene = new Scene(borderPane, 425, 80);
    primaryStage.setTitle("Exercise15_04"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
    btAdd.setOnAction(e -> {
      tfResult.setText(Double.parseDouble(tfNumber1.getText()) + 
        Double.parseDouble(tfNumber2.getText()) + "");
    });

    btSubtract.setOnAction(e -> {
      tfResult.setText(Double.parseDouble(tfNumber1.getText()) -
        Double.parseDouble(tfNumber2.getText()) + "");
    });
    
    btMultiply.setOnAction(e -> {
      tfResult.setText(Double.parseDouble(tfNumber1.getText()) *
       Double.parseDouble(tfNumber2.getText()) + "");
    });

    btDivide.setOnAction(e -> {
      tfResult.setText(Double.parseDouble(tfNumber1.getText()) /
        Double.parseDouble(tfNumber2.getText()) + "");
    });
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
} 
