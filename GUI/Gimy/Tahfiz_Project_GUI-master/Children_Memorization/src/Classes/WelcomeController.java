package Classes;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class WelcomeController implements Initializable {

    public static Stage adminloginStage = new Stage();
    public static Stage teacherloginStage = new Stage();
    public static Stage parentloginStage = new Stage();

    public Hyperlink adminLink;
    public Button tBut;
    public Button pBut;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("View is now loaded!");
    }

    public void adminLinkClicked () throws IOException {

        //adminloginStage.initModality(Modality.APPLICATION_MODAL);

        javafx.scene.Parent root = FXMLLoader.load(getClass().getResource("Adminlogin.fxml"));
        adminloginStage.setTitle("Admin Login");
        adminloginStage.setScene(new Scene(root, 350, 200));
        adminloginStage.showAndWait();



    }


    public void tLogButClicked () throws IOException {

        //teacherloginStage.initModality(Modality.APPLICATION_MODAL);

        javafx.scene.Parent root = FXMLLoader.load(getClass().getResource("Teacherlogin.fxml"));
        teacherloginStage.setTitle("Teacher Login");
        teacherloginStage.setScene(new Scene(root, 350, 200));
        teacherloginStage.showAndWait();
    }

    public void pLogButClicked () throws IOException {

        //parentloginStage.initModality(Modality.APPLICATION_MODAL);

        javafx.scene.Parent root = FXMLLoader.load(getClass().getResource("Parentlogin.fxml"));
        parentloginStage.setTitle("Parent Login");
        parentloginStage.setScene(new Scene(root, 350, 200));
        parentloginStage.showAndWait();
    }
}