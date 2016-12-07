package Classes;

import java.util.ArrayList;

import static Classes.Parent.checkParentID;

public class Child {
	
	private String student_ID; //student ID must start with '4' and consist of 9 digits
	private String name ;
	private int age ;
	private String phone ;
	private float amount_of_hifz; //the totsl amount of memorization which counted with pages
	private String parentID;
	
	public Child(){
        student_ID = "";
		name = null;
		age = 0;
		phone = null;
		amount_of_hifz = 0; 
		//prombt "you have create an empty Child"
	}
	
	public Child(String student_ID, String name, int age, String phone, float amount_of_hifz, String  parentID) {

        if(checkchildID(student_ID)){
            this.student_ID = student_ID;
        }
        else {
            OkAlert.display("Error", "child account can't be created check ID");
            throw new IllegalArgumentException();

        }
        this.name = name;
		this.age = age;
		this.phone = phone;
		this.amount_of_hifz = amount_of_hifz;
        if(checkParentID(parentID)){
            this.parentID = parentID;
        }
        else {
            OkAlert.display("Error", "child account can't be created check ID");
            throw new IllegalArgumentException();

        }

		//prombt "you have create a (child's name ) child"
		
	}
	
	// get/set methods

	public String getStudent_ID() {
		return student_ID;
	}

	public void setStudent_ID(String student_ID) {
        if(checkchildID(student_ID)){
            this.student_ID = student_ID;
        }
        else {
            OkAlert.display("Error", "child account can't be created check ID");
            throw new IllegalArgumentException();

        }
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public float getAmount_of_hifz() {
		return amount_of_hifz;
	}

	public void setAmount_of_hifz(float amount_of_hifz) {
		this.amount_of_hifz = amount_of_hifz;
	}

    public String getParentID() {
        return parentID;
    }

    public void setParentID(String parentID) {
        this.parentID = parentID;
    }
    //other methods
	
	void add_pages(float pages){
		//Round the pages to just one or half page
		//need to complete 
	}
	//overloading 
	void add_pages(int pages){
		amount_of_hifz+=pages;
	}

    public boolean checkchildID (String id){

        return id.matches("[4]\\d{4}");
    }





}
