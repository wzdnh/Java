/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiyan4;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author AI小政
 */
public class Shiyan4 extends Application {
    public static void main(String[] args) {
    Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //新建边界
        BorderPane root = new BorderPane();
        //边界放入场景，并对场景进行设置
        Scene scene = new Scene(root, 380, 250, Color.WHITE);
        //新建网格
        GridPane gridpane = new GridPane();
        //设置填充，padding用来隔开元素和内容的间隔
        gridpane.setPadding(new Insets(50));
        //网格元素之间的间距
        gridpane.setHgap(50);  //水平间距
        gridpane.setVgap(50);  //垂直间距
        //列约束
        ColumnConstraints column1 = new ColumnConstraints(50, 150, 300);
        ColumnConstraints column2 = new ColumnConstraints(50, 150, 300);
        column2.setHgrow(Priority.ALWAYS);
        gridpane.getColumnConstraints().addAll(column1, column2);
        
        //添加标签，文本框和按钮
        Label fNameLbl = new Label("First Name");
        TextField fNameFld = new TextField();
        Label lNameLbl = new Label("Last Name");
        TextField lNameFld = new TextField();
        Button saveButt = new Button("Save");
        
     //将元素放入面板
        // First name label
        GridPane.setHalignment(fNameLbl, HPos.RIGHT);//标签右对齐
        gridpane.add(fNameLbl, 0, 0);

        // Last name label
        GridPane.setHalignment(lNameLbl, HPos.RIGHT);
        gridpane.add(lNameLbl, 0, 1);

        // First name field
        GridPane.setHalignment(fNameFld, HPos.LEFT);
        gridpane.add(fNameFld, 1, 0);

        // Last name field
        GridPane.setHalignment(lNameFld, HPos.LEFT);
        gridpane.add(lNameFld, 1, 1);

        // Save button
        GridPane.setHalignment(saveButt, HPos.RIGHT);
        gridpane.add(saveButt, 1, 2);

        root.setCenter(gridpane);
        primaryStage.setScene(scene);
        primaryStage.show();
  }
}







