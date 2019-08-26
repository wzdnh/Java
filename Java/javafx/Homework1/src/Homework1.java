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
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;



public class Homework1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
            //创建网格
        pane.setAlignment(Pos.CENTER);
            //节点居中放在网格面板中央
        for (int column = 0; column < 10; column++) {
            for (int row = 0; row < 10; row++) {
                pane.add(getTextField(), column, row);
                    //将节点放在特定的列和行
            }
        }

        Scene scene = new Scene(pane);
            //将面板加入场景（没有设置面板大小）
        primaryStage.setTitle(" Homework1");
            //标题
        primaryStage.setScene(scene);
            //将场景设置到舞台
        primaryStage.show();
            //显示舞台
            
    }

    public TextField getTextField() {
        TextField f = new TextField();
            //新建文本框f
        f.setPrefColumnCount(1);
            //设置每个小框里面放置一个数字
        int i = (int) (Math.random() * 2);
            //随机生成0或1
        String j = String.valueOf(i);
             //将i赋值给String型的j
        f.setText(j);
        return f;
    }
}
