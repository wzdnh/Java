package flashtext;


import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FlashText extends Application {
    
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        
        String urlTest = "http://images.chinaiiss.com/attachment/article/201711/24/105528_882.jpg";
        Image imageTest = new Image(urlTest);
        ImageView imageViewTest = new ImageView(imageTest);
        imageViewTest.setFitWidth(200);//宽
        imageViewTest.setFitHeight(200);//高
        
        Rectangle rectangle = new Rectangle(200, 200, 600, 10);
        Line line = new Line(200, 200, 500, 200);
        Rectangle rectangleA = new Rectangle(50, 50, 200, 0);
        Circle circle = new Circle(125, 100, 60);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLUE);
        pane.getChildren().add(rectangle);
        pane.getChildren().add(imageViewTest);
        
        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.millis(8000));
        pt.setPath(rectangle);
        pt.setNode(imageViewTest);
        pt.setOrientation(PathTransition.OrientationType.NONE);
        pt.setAutoReverse(false);
        pt.play();
        /*
        pt.setOnFinished(e -> {
            pt.pause();
        });
        */
        pt.setOnFinished(e -> {
            pt.play();
        });
        
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
