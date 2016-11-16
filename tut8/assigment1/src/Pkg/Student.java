package Pkg;

/**
 * Created by gimy on 11/16/2016.
 */
public class Student extends Person {

    private final String status;

    public Student(String n, String a, String p, String e, String status) {

        super(n,a,p,e);
        this.status = status;
    }


    public String getStatus() {
        return status;
    }
}
