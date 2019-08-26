/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author AI小政
 */
public class Shiyan5 extends Application {
    
@Override
public void start(Stage primaryStage) {
//新建边界
BorderPane root = new BorderPane();

//新建网格
GridPane gridpane = new GridPane();
//设置填充，padding用来表示边界与舞台之间的间隔
gridpane.setPadding(new Insets(50));
//网格元素之间的间距
gridpane.setHgap(50);  //水平间距
gridpane.setVgap(50);  //垂直间距

//添加标签，文本框和按钮
Label label1  = new Label("First Number ：");        
Label label2  = new Label("Secend Number ：");
TextField tfNumber1 = new TextField();
TextField tfNumber2 = new TextField();
Label label3  = new Label("Result ：");
TextField tfNumber3 = new TextField();
Button btA = new Button("加");
Button btB = new Button("减");
Button btC = new Button("乘");
Button btD = new Button("除");

//将元素放入面板
// First name label
GridPane.setHalignment(label1, HPos.RIGHT);//标签右对齐
gridpane.add(label1, 0, 0);

// Last name label
GridPane.setHalignment(label2, HPos.RIGHT);
gridpane.add(label2, 0, 1);

GridPane.setHalignment(label3, HPos.RIGHT);
gridpane.add(label3, 0, 2);

// First name field
GridPane.setHalignment(tfNumber1, HPos.LEFT);
gridpane.add(tfNumber1, 1, 0);

// Last name field
GridPane.setHalignment(tfNumber2, HPos.LEFT);
gridpane.add(tfNumber2, 1, 1);

GridPane.setHalignment(tfNumber3, HPos.LEFT);
gridpane.add(tfNumber3, 1, 2);

//面板以横排列，元素间的间距是50
HBox hBox = new HBox(50); 
//居中排列
hBox.setAlignment(Pos.CENTER);
hBox.getChildren().addAll(btA, btB, btC, btD);


gridpane.add(hBox, 1, 3);              
root.setCenter(gridpane);       
//边界放入场景，并对场景进行设置
Scene scene = new Scene(root, 780, 450, Color.WHITE);
primaryStage.setScene(scene);
primaryStage.setTitle("Calculator");
primaryStage.show();

//方法注册
btA.setOnAction(e -> {
    Double one = Double.parseDouble(tfNumber1.getText()) + 
        Double.parseDouble(tfNumber2.getText());
    String two = String.valueOf(Double.parseDouble(tfNumber1.getText()) + 
        Double.parseDouble(tfNumber2.getText()));
    tfNumber3.setText(two);
});

btB.setOnAction(e -> {
    Double one = Double.parseDouble(tfNumber1.getText()) + 
        Double.parseDouble(tfNumber2.getText());
    String two = String.valueOf(Double.parseDouble(tfNumber1.getText()) + 
        Double.parseDouble(tfNumber2.getText()));
    tfNumber3.setText(two);
});

btC.setOnAction(e -> {
    Double one = Double.parseDouble(tfNumber1.getText()) + 
        Double.parseDouble(tfNumber2.getText());
    String two = String.valueOf(Double.parseDouble(tfNumber1.getText()) + 
        Double.parseDouble(tfNumber2.getText()));
    tfNumber3.setText(two);
});

btD.setOnAction(e -> {
    Double one = Double.parseDouble(tfNumber1.getText()) + 
        Double.parseDouble(tfNumber2.getText());
    String two = String.valueOf(Double.parseDouble(tfNumber1.getText()) + 
        Double.parseDouble(tfNumber2.getText()));
    tfNumber3.setText(two);
});
  }
}







