import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.text.*;
import javafx.scene.control.*;
public class Homework2 extends Application {
    @Override
    public void start(Stage primaryStage){
    Pane pane = new StackPane();
        
    Polygon polygon = new Polygon();
        //创建个多边形
    pane.getChildren().add(polygon);
        //将多边形放在中央，下面的节点依次位于最上面
    polygon.setFill(Color.GRAY);
        //设置图形填充色
    polygon.setStroke(Color.WHITE);
        //设置图形边框颜色
    ObservableList<Double> list = polygon.getPoints();
        //返还一个ObservableList<Double>
    final double WIDTH = 200, HEIGHT = 200;
        //声明宽和高
    double centerX = WIDTH / 2, centerY = HEIGHT / 2;
    double radius = Math.min(WIDTH, HEIGHT) * 0.4;
    for (int i = 0; i < 8; i++) {
        list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8));
        list.add(centerY - radius * Math.sin(2 * i * Math.PI / 8));
    }
    polygon.setRotate(25);
    
    Label label = new Label("STOP");
        //新建stop
    label.setFont(Font.font("Times New Roman" ,
        FontWeight.BOLD, FontPosture.ITALIC, 20));
            //设置字体
        
 
        //设置字体颜色
    pane.getChildren().add(label);
        //在舞台中显示字
    Scene scene = new Scene(pane, WIDTH, HEIGHT);
        //将面板设置到场景（并设置了场景大小）
    primaryStage.setTitle("Homework2");
        //设置标题
    primaryStage.setScene(scene);
        //将场景设置到舞台
    primaryStage.show();
        //显示舞台
    }    
}
