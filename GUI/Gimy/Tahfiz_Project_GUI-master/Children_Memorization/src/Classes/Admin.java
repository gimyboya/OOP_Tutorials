package Classes;

public class Admin {

    private String admin_ID ;// Admin ID must start with '1' and consist of 5 digits
    private String name ;
	private String pass ;
	
	//no default constructor for security purpose
	
	public Admin(String admin_ID, String name, String pass) {
		super();
		this.name = name;
		if(checkAdminID(admin_ID)){
			this.admin_ID = admin_ID;
		}
		else {
            OkAlert.display("Error", "Admin account can't be created check ID");
            throw new IllegalArgumentException();

		}
		this.pass = pass;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdmin_ID() {
		return admin_ID;
	}

	public void setAdmin_ID(String admin_ID) {
        if(checkAdminID(admin_ID)){
            this.admin_ID = admin_ID;
        }
        else {
            OkAlert.display("Error", "wrong ID, ID should start with 1");
            throw new IllegalArgumentException();

        }
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

    public boolean checkAdminID (String id){

        return id.matches("[1]\\d{4}");
    }
}
