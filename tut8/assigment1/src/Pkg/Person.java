package Pkg;

/**
 * Created by gimy on 11/16/2016.
 */
public class Person {

    private String name;
    private String address;
    private String phone;
    private String email;

    public Person(String n, String a, String p, String e){
        this.name = n;
        this.address = a;
        this.phone = p;
        this.email = e;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
