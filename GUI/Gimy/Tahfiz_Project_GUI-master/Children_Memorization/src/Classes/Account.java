package Classes;

import java.util.Date;

public class Account {


	protected String ID ;// Admin ID must start with '2' for teacher or '3' for parent , and consist of 5 digits
    private String pass;
    private String name ;
    private String phone ;
    private String e_mail;
    private String address;
	
	public Account() {
		ID = null;
		pass = null;
		name = null;
		phone = null;
		e_mail = null;
		address = null;
	}
	
	
	public Account( String pass, String name, String phone, String e_mail, String address) {
		this.pass = pass;
		this.name = name;
		this.phone = phone;
		this.e_mail = e_mail;
		this.address = address;
	}

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
