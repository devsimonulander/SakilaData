package se.yalar.grupp5.sakiladata;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("start-view.fxml"));
        stage.setScene(new Scene(root, 750, 750));
        stage.setTitle("SakilaGUI");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}