package vaniercollege.zyd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author Yu Duo Zhang (2480549)
 * https://github.com/zyd-074/Vanier_F25_420-SF3-RE_Lab10.git
 */
public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Load FXML
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainView.fxml"));

        // Initialize Scene
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Lab10");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
