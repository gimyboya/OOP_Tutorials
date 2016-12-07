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
public class ParentloginController {


    public Hyperlink goBackP;
    public TextField parentID;
    public PasswordField pass;
    public Button login;




    public void goBack () {
        Stage stage = (Stage) goBackP.getScene().getWindow();
        stage.close();
    }

    public void login(ActionEvent actionEvent) throws Exception {
        Validator validator = new Validator();

        validator.ParentID(parentID,parentID.getText(), Arrays.globalparents);
        if (validator.ParentID(parentID,parentID.getText(), Arrays.globalparents)) {
            validator.parentpass(pass, pass.getText(), Arrays.globalparents, Validator.throwParentIndex(parentID.getText(),Arrays.globalparents));
        }
        if((validator.ParentID(parentID,parentID.getText(), Arrays.globalparents)) && (validator.parentpass(pass, pass.getText(), Arrays.globalparents, Validator.throwParentIndex(parentID.getText(),Arrays.globalparents)))){

           //if the login is succesful store the index of the user
            Validator.userIndex = Validator.throwParentIndex(parentID.getText(),Arrays.globalparents);
            WelcomeController.parentloginStage.close();

            try{
                javafx.scene.Parent root = FXMLLoader.load(getClass().getResource("Parentpanel.fxml"));
                Stages.Window.setTitle("Dashboard");
                Stages.Window.setScene(new Scene(root, 350, 200));
                Stages.Window.show();
            }catch (IOException e){

            }
        }

    }
}
