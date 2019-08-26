/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author AI小政
 */

public class Calculator extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //创建网格
        GridPane gridPane = new GridPane();
        gridPane.setHgap(7);
        gridPane.setVgap(7);
        
        TextField tfFirstNumber = new TextField("");
        TextField tfSecendNumber = new TextField("");
                
        gridPane.setAlignment(Pos.CENTER);                
        gridPane.add(new Label("First number"), 0, 0);
        gridPane.add(tfFirstNumber, 1, 0);       
        gridPane.add(new Label("Secend number"), 0, 1);
        gridPane.add(tfSecendNumber, 1, 1);       
        
        Button btA = new Button("+");  
        Button btB = new Button("-");
        Button btC = new Button("*");
        Button btD = new Button("/");
        
        gridPane.add(btA, 1, 2);
        gridPane.add(btA, 1, 3);
        gridPane.add(btA, 1, 4);
        gridPane.add(btA, 1, 5);
                         
        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane, 350, 250);        
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    

        btA.setOnAction(e -> {
                 System.out.println(Double.parseDouble(tfFirstNumber.getText()) + 
                         Double.parseDouble(tfSecendNumber.getText())); 
            });
    
    
        btB.setOnAction(e -> {
                 System.out.println(Double.parseDouble(tfFirstNumber.getText()) - 
                         Double.parseDouble(tfSecendNumber.getText())); 
            });
    
        btC.setOnAction(e -> {
                 System.out.println(Double.parseDouble(tfFirstNumber.getText()) * 
                         Double.parseDouble(tfSecendNumber.getText())); 
            });
    
        btD.setOnAction(e -> {
                 System.out.println(Double.parseDouble(tfFirstNumber.getText()) / 
                         Double.parseDouble(tfSecendNumber.getText())); 
            });
    }
}


