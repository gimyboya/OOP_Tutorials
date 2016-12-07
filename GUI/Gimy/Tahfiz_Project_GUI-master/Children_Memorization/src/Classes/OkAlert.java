package Classes;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;


/**
 * Created by gimy on 11/05/2016.
 */
public class OkAlert {

    public static void display(String title, String message) {

        Stage Alert = new Stage();

        //Block events to other windows
        Alert.initModality(Modality.APPLICATION_MODAL);
        Alert.setTitle(title);
        Alert.setMinWidth(300);

        Label label = new Label();
        label.setText(message);
        Button closeButton = new Button("OK");
        closeButton.setOnAction(e -> Alert.close());

        VBox layout = new VBox(20);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);

        //Display window and wait for it to be closed before returning
        Scene scene = new Scene(layout);
        Alert.setScene(scene);
        Alert.showAndWait();
    }
}
