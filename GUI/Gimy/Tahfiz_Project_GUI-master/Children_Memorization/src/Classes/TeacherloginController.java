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
public class TeacherloginController {

    public Hyperlink goBackT;
    public TextField teacherID;
    public PasswordField pass;
    public Button login;


    public void goBack () {
        Stage stage = (Stage) goBackT.getScene().getWindow();
        stage.close();
    }

    public void login(ActionEvent actionEvent) throws Exception {
        Validator validator = new Validator();

        validator.TeacherID(teacherID,teacherID.getText(), Arrays.globalteachers);
        if (validator.TeacherID(teacherID,teacherID.getText(), Arrays.globalteachers)) {
            validator.teacherpass(pass, pass.getText(), Arrays.globalteachers, Validator.throwTeacherIndex(teacherID.getText(),Arrays.globalteachers));
        }
        if((validator.TeacherID(teacherID,teacherID.getText(), Arrays.globalteachers)) && (validator.teacherpass(pass, pass.getText(), Arrays.globalteachers, Validator.throwTeacherIndex(teacherID.getText(),Arrays.globalteachers)))){

            Validator.userIndex = Validator.throwTeacherIndex(teacherID.getText(),Arrays.globalteachers);
            WelcomeController.teacherloginStage.close();

            try{
                javafx.scene.Parent root = FXMLLoader.load(getClass().getResource("Teacherpanel.fxml"));
                Stages.Window.setTitle("Dashboard");
                Stages.Window.setScene(new Scene(root, 350, 200));
                Stages.Window.show();
            }catch (IOException e){

            }
        }

    }
}
