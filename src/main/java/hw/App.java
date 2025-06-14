package hw;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Name: Ibigoni Inye-Tam
 * Username: Inyetp01
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("main.fxml"));
        Parent p = fxmlLoader.load();
        scene = new Scene(p);
        stage.setScene(scene);
        stage.setTitle("Lab5 - History Timeline");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}