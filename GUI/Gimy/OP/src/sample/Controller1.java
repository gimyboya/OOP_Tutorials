package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;


import java.awt.*;
import java.io.IOException;

public class Controller1 {

    public TextField Push;
    public TextField pull;
    public TextField squat;
    public TextField km;



    public void scean2() throws IOException {

        Stage window = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Workout2.fxml"));


        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Why you didn't workout?");
        window.setScene(new Scene(root));
        window.showAndWait();

    }

    public void scean3() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Workout3.fxml"));
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Lets check it out?");
        window.setScene(new Scene(root));
        window.showAndWait();
    }

    public void scean4() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Workout4.fxml"));
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("You can be my disciple");
        window.setScene(new Scene(root));
        window.showAndWait();
    }

    public void checkOut (){
        try{
            int pushup = Integer.parseInt(Push.getText());
            int pullup = Integer.parseInt(pull.getText());
            int squats = Integer.parseInt(squat.getText());
            int distance = Integer.parseInt(km.getText());

            if(pushup >= 100 && pullup >= 100 && squats >= 100 && distance >= 10){
                scean4();
            }else{
                scean2();
            }

        }catch(NumberFormatException e){
            System.out.println("Please enter only numbers");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
