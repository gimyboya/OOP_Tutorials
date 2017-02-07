package pakg;

import java.util.LinkedHashMap;
import java.util.LinkedList;


/**
 * Created by gimy on 12/12/2016.
 */
public class Table {

    private LinkedHashMap<String, LinkedList> Attributes; // column_name -> all column_values

    //private LinkedHashMap<Object, Tuple> Tuples; // (column_value| search_value) -> row_values

    public void initialize_Columns(LinkedList<String> Column_names){

        while (!Column_names.isEmpty()){
            Attributes.put(Column_names.getFirst(), new LinkedList());
            Column_names.pop();
        }
    }

    public void Insert_All(LinkedList values){

        for (String s : Attributes.keySet()) { //we get the column names
                Attributes.get(s).add(values.getFirst()); // we assign a value
                values.pop();

        }
    }

    public void Insert_Values_With_sp_Columns(LinkedList<String> Column_names, LinkedList values){

        while (!Column_names.isEmpty()){
            Attributes.get(Column_names.getFirst()) //we get the column names
                    .add(values.getFirst()); // we assign a value
            values.pop();
            Column_names.pop();
        }


    }

}
