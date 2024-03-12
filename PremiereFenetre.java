package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
 import javafx.scene.shape.Rectangle;

public class PremiereFenetre extends Application{
	
	public void start(Stage primaryStage) {
		 Group root = new Group();
	
		 Scene scene = new Scene(root, 300, 250, Color.WHITE);
		 primaryStage.setTitle("Ma première fenêtre");
		 
		Line line = new Line(50, 50, 200, 50); 
		Rectangle rectangle = new Rectangle(50, 100, 100, 50); 
		Circle circle = new Circle(200, 150, 30);
		root.getChildren().addAll(line, rectangle, circle);
		
	
		
		 primaryStage.setScene(scene);
		 primaryStage.show();
	 }
	 public static void main(String[] args) {
		 launch(args);
	 }
	

}
