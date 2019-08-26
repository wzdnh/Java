/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author 帅帅的阿政
 */
public class Calculatorabc extends Application {
        
    @Override
    public void start(Stage primaryStage) {
        FlowPane pane = new FlowPane();
        pane.setHgap(2);                               
        
        TextField tfNumber1 = new TextField();
        TextField tfNumber2 = new TextField();
    
        tfNumber1.setPrefColumnCount(3);
        tfNumber2.setPrefColumnCount(3);
                                    
        pane.getChildren().addAll(new Label("Number 1: "), tfNumber1,
        new Label("Number 2: "), tfNumber2);
         
        HBox hBox = new HBox(5);
        Button btA = new Button("+");  
        Button btB = new Button("-");
        Button btC = new Button("*");
        Button btD = new Button("/");
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(btA, btB, btC, btD);
        
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.TOP_CENTER);
        
        Scene scene = new Scene(borderPane, 400, 250);        
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
