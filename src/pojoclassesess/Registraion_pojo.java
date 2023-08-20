package pojoclassesess;

public class Registraion_pojo 
{
	private String First_name;
	private String Email_ID;
	private String password;
	
	
	
	public Registraion_pojo(String first_name, String email_ID, String password) {
		//super();
		First_name = first_name;
		Email_ID = email_ID;
		this.password = password;
	}
	public String getFirst_name() {
		return First_name;
	}
	public void setFirst_name(String first_name) {
		First_name = first_name;
	}
	public String getEmail_ID() {
		return Email_ID;
	}
	public void setEmail_ID(String email_ID) {
		Email_ID = email_ID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	


}
