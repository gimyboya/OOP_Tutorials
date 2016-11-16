package Pkg;

import java.util.Date;

/**
 * Created by gimy on 11/16/2016.
 */
public class Faculty_member extends Employee {

    private String office_hours;
    private String rank;

    public Faculty_member(String n, String a, String p, String e, String o, double s, Date d, String oh, String r){
        super(n,a,p,e,o,s,d);
        this.office_hours = oh;
        this.rank = r;
    }

    public String getOffice_hours() {
        return office_hours;
    }

    public void setOffice_hours(String office_hours) {
        this.office_hours = office_hours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString(){
        String result = "Name : " + getName() + "\nAddress : " + getAddress() + "\nPhone : " + getPhone() + "\nE-mail : " + getEmail() + "\nOffice : " + getOffice() + "\nSallery : " + getSalary() + "\nOffice hours" + getOffice_hours() + "\nRank : " + getRank();
        return result;
    }
}
