package Pkg;

import java.util.Date;

/**
 * Created by gimy on 11/16/2016.
 */
public class Employee extends Person {

    private String office;
    private double salary;
    private Date date_hired;

    public Employee(String n, String a, String p, String e, String o, double s, Date d){

        super(n,a,p,e);
        this.office = o;
        this.salary = s;
        this.date_hired = d;
    }





    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDate_hired() {
        return date_hired;
    }

    public void setDate_hired(Date date_hired) {
        this.date_hired = date_hired;
    }
}
