package pakg;

import java.util.HashMap;

/**
 * Created by gimy on 12/13/2016.
 */
public class Schema {
    HashMap<String, Table > TableSheme = new HashMap<>(); // tb_name -> table

    public void creat_table(String tb_name){
        TableSheme.put(tb_name, new Table());
        System.out.println("Table '" + tb_name + "' created!");
    }


    public void drop_table(String tb_name){
        TableSheme.remove(tb_name);
        System.out.println("Table '" + tb_name + "' deleted!");
    }

    public void PrintTablSheme(){
        for(String tb_name: TableSheme.keySet()){
            System.out.println(tb_name);
        }
    }
}
