package Pkg;

import java.util.Date;

/**
 * Created by gimy on 11/16/2016.
 */
public class Stuff extends Employee {

    private String title;

    public Stuff(String n, String a, String p, String e, String o, double s, Date d, String t){
        super(n,a,p,e,o,s,d);
        this.title = t;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
