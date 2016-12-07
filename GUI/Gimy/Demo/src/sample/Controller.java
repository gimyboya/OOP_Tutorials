package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    public void warningWindow() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("alert.fxml"));
        Stage Alert = new Stage();

        Alert.initModality(Modality.APPLICATION_MODAL);
        Alert.setTitle("Title");
        Alert.setScene(new Scene(root));
        Alert.showAndWait();


    }
}
