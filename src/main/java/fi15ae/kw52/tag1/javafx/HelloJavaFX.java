package fi15ae.kw52.tag1.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {


  static void main() {
    launch();
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    Label label = new Label("Hello JavaFX");
    Button button = new Button("Click me");

    button.setOnAction(e -> System.out.println("Hello World!"));


    VBox root = new VBox(10);
    root.getChildren().addAll(label, button);

    primaryStage.setScene(new Scene(root, 300, 250));
    primaryStage.show();
  }
}
