/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AI小政
 */
import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Administrator
 */
public class Calculator extends Application {
    private final TextField tfFirstNumber = new TextField();
    private final TextField tfSecendNumber = new TextField();
    double m = Double.parseDouble(tfFirstNumber.getText());
    double n = Double.parseDouble(tfSecendNumber.getText());
    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.setAlignment(Pos.CENTER);                
        gridPane.add(new Label("First number"), 0, 0);
        gridPane.add(tfFirstNumber, 1, 0);       
        gridPane.add(new Label("Secend number"), 0, 2);
        gridPane.add(tfSecendNumber, 1, 2);
        gridPane.add(new TextField(), 1, 3);
        
        Button btA = new Button("+");  
        Button btB = new Button("-");
        Button btC = new Button("*");
        Button btD = new Button("/");
        
        gridPane.add(btA, 1, 4);
        gridPane.add(btB, 1, 5);
        gridPane.add(btC, 1, 6);
        gridPane.add(btD, 1, 7); 
        
        Scene scene = new Scene(gridPane, 300, 250);        
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
