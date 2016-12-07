package Classes;

import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import java.util.ArrayList;

/**
 * Created by gimy on 12/05/2016.
 */
public class Validator {

    
    public static int userIndex;


    public boolean AdminID (TextField field, String id, ArrayList<Admin> admins) {

        field.setStyle("-fx-control-inner-background: #FFFFFF");
        boolean result = false;

        if (id.matches("[1]\\d{4}")) {

            for (int i = 0; i < admins.size(); i++) {
                if (id.equals(admins.get(i).getAdmin_ID())) {
                    result = true;
                }
            }
            return result;
        } else {
            field.setStyle("-fx-control-inner-background: #FA5064");
            return false;
        }

    }


    public boolean TeacherID (TextField field, String id, ArrayList<Teacher> teachers){

        field.setStyle("-fx-control-inner-background: #FFFFFF");
        boolean result = false;

        if (id.matches("[2]\\d{4}")) {

            for (int i = 0; i < teachers.size(); i++) {
                if (id.equals(teachers.get(i).getID())) {
                    result = true;
                }
            }
            return result;
        } else {
            field.setStyle("-fx-control-inner-background: #FA5064");
            return false;
        }

    }

    public boolean ParentID (TextField field, String id, ArrayList<Parent> parents){

        field.setStyle("-fx-control-inner-background: #FFFFFF");
        boolean result = false;

        if (id.matches("[3]\\d{4}")) {

            for (int i = 0; i < parents.size(); i++) {
                if (id.equals(parents.get(i).getID())) {
                    result = true;
                }
            }
            return result;
        } else {
            field.setStyle("-fx-control-inner-background: #FA5064");
            return false;
        }

    }
    
    public boolean adminpass (PasswordField field, String pass, ArrayList<Admin> admins, int index){

        field.setStyle("-fx-control-inner-background: #FFFFFF");
        boolean result = false;


            if(pass.equals(admins.get(index).getPass())) {
                result = true;
            }
            else{
                field.setStyle("-fx-control-inner-background: #FA5064");
                result = false;
            }

        return result;
    }


    public boolean teacherpass (PasswordField field, String pass, ArrayList<Teacher> teachers, int index){

        field.setStyle("-fx-control-inner-background: #FFFFFF");
        boolean result = false;


        if(pass.equals(teachers.get(index).getPass())) {
            result = true;
        }
        else{
            field.setStyle("-fx-control-inner-background: #FA5064");
            result = false;
        }

        return result;
    }


    public boolean parentpass (PasswordField field, String pass, ArrayList<Parent> parents, int index){

        field.setStyle("-fx-control-inner-background: #FFFFFF");
        boolean result = false;


        if(pass.equals(parents.get(index).getPass())) {
            result = true;
        }
        else{
            field.setStyle("-fx-control-inner-background: #FA5064");
            result = false;
        }

        return result;
    }

    public static int throwAdminIndex(String id, ArrayList<Admin> admins){

        int index = 0;

        for (int i = 0; i < admins.size(); i++) {
            if (id.equals(admins.get(i).getAdmin_ID())) {
                index = i;
            }
        }

        return index;
    }

    public static int throwTeacherIndex(String id, ArrayList<Teacher> teachers){

        int index = 0;

        for (int i = 0; i < teachers.size(); i++) {
            if (id.equals(teachers.get(i).getID())) {
                index = i;
            }
        }

        return index;
    }

    public static int throwParentIndex(String id, ArrayList<Parent> parents){

        int index = 0;

        for (int i = 0; i < parents.size(); i++) {
            if (id.equals(parents.get(i).getID())) {
                index = i;
            }
        }

        return index;
    }



}
