package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("fxml/mineWindow.fxml"));
        primaryStage.setTitle("Password");
        primaryStage.setScene(new Scene(root, 580, 100));

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
