package Classes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Parent extends Account{
	
	private String relationship;
	private String childrenID;
	public Parent() {
		super();
		relationship = null ;
		childrenID = "";
	}
	public Parent(String ID, String pass, String name, String phone, String e_mail, String address,String ralationship, String childrenID) {
		super(pass, name, phone, e_mail, address);
		if(checkParentID(ID)){
			this.ID = ID;
		}
		else {
			OkAlert.display("Error", "Parent account can't be created check ID");
			throw new IllegalArgumentException();

		}
		this.relationship = ralationship;
		this.childrenID = childrenID;

	}
	

	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getChildrenID() {
		return childrenID;
	}

	public void setChildrenID(String childrenID) {
		this.childrenID = childrenID;
	}

	//overriding
	public void setID(String iD) {
        if(checkParentID(ID)){
            super.ID = ID;
        }
        else {
            OkAlert.display("Error", "Wrong ID, ID should start with 3");
            throw new IllegalArgumentException();

        }
		
	}

	public static boolean checkParentID (String id){

		return id.matches("[3]\\d{4}");
	}

}
