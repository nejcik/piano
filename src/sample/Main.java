package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Piano");
        String image = this.getClass().getResource("background.jpg").toExternalForm();
        root.setStyle(" -fx-background-image: url('" + image + "');  "
                + "-fx-background-position: center center; "
                + "-fx-background-repeat: stretch;");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setMinHeight(400);
        primaryStage.setMaxHeight(400);
        primaryStage.setMinWidth(600);
        primaryStage.setMaxWidth(600);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

