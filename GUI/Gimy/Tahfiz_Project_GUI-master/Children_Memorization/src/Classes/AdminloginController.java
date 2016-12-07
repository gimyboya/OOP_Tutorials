package Classes;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


/**
 * Created by gimy on 11/05/2016.
 */
public class AdminloginController {

    public static Stage adminStage = new Stage();

    public Hyperlink goBackA;
    public Button login;
    public TextField adminID;
    public PasswordField pass;



    public void goBack () {

        Stage stage = (Stage) goBackA.getScene().getWindow();
        stage.close();
    }

    public void login(ActionEvent actionEvent) throws Exception {
        Validator validator = new Validator();

        validator.AdminID(adminID,adminID.getText(), Arrays.globaladmins);

        if (validator.AdminID(adminID,adminID.getText(), Arrays.globaladmins)) {
            validator.adminpass(pass, pass.getText(), Arrays.globaladmins, Validator.throwAdminIndex(adminID.getText(),Arrays.globaladmins));
        }
        if((validator.AdminID(adminID,adminID.getText(), Arrays.globaladmins)) && (validator.adminpass(pass, pass.getText(), Arrays.globaladmins, Validator.throwAdminIndex(adminID.getText(),Arrays.globaladmins)))){
            WelcomeController.adminloginStage.close();

            try{
                javafx.scene.Parent root = FXMLLoader.load(getClass().getResource("Adminpanel.fxml"));
                Stages.Window.setTitle("Dashboard");
                Stages.Window.setScene(new Scene(root, 350, 200));
                Stages.Window.show();
            }catch (IOException e){

            }
        }

    }
}
