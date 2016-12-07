package Classes;


public class Teacher extends Account{

    private boolean ijaza ;
	private int classes_in_charge ;

	public Teacher() {
		super();
		ijaza= false ;
		classes_in_charge = 0 ;
	}
	public Teacher(String ID, String pass, String name, String phone, String e_mail, String address, boolean ijaza , int classes_in_charge) {
		super(pass, name, phone, e_mail, address);
        if(checkTeacherID(ID)){
			this.ID = ID;
		}
		else {
			OkAlert.display("Error", "Teacher account can't be created check ID");
			throw new IllegalArgumentException();

		}
        this.ijaza = ijaza;
		this.classes_in_charge = classes_in_charge;
		
	}
	
	public boolean getijaza() {
		return ijaza;
	}
	public void setijaza(boolean ijaza) {
		this.ijaza = ijaza;
	}
	public int getClasses_in_charge() {
		return classes_in_charge;
	}
	public void setClasses_in_charge(int classes_in_charge) {
		this.classes_in_charge = classes_in_charge;
	}




	
	//overriding
	public void setID(int iD) {
		if(checkTeacherID(ID)){
			this.ID = ID;
		}
		else {
			OkAlert.display("Error", "Wrong ID, ID should start with 3");
			throw new IllegalArgumentException();

		}
	}

    public String getID() {
        return ID;
    }

    public boolean isIjaza() {
        return ijaza;
    }

    public boolean checkTeacherID (String id){

		return id.matches("[2]\\d{4}");
	}


}
