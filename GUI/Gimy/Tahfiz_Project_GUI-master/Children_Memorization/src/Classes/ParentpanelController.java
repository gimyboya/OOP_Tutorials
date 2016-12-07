package Classes;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;

import java.util.ArrayList;

import static Classes.Validator.userIndex;

/**
 * Created by gimy on 11/05/2016.
 */
public class ParentpanelController {


    @FXML
    private ListView<String> listView;
    public Menu logout;

    //Loading children
    /*public static ObservableList<Child> getchild (){
        ObservableList<Child> children = FXCollections.observableArrayList();

        children.add(Arrays.globalchildren.get(searchChildIndex()));

        return children;

    }*/




    public static Child getchild (){

        return  Arrays.globalchildren.get(searchChildIndex());

    }


    public static int searchChildIndex (){

        int index = 0;

        for (int i = 0; i < Arrays.globalchildren.size(); i++) {
            if (Arrays.globalparents.get(userIndex).getChildrenID().equals(Arrays.globalchildren.get(i).getStudent_ID())) {
                    index = i;
            }
        }
       return index;
    }


}
