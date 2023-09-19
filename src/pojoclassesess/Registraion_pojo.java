package pojoclassesess;

public class Registraion_pojo 
{
	private String first_name;
	private String email_ID;
	private String password;
	
	
	
	public Registraion_pojo(String first_name, String email_ID, String password) {
		//super();
		this.first_name = first_name;
		this.email_ID = email_ID;
		this.password = password;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		first_name = first_name;
	}
	public String getEmail_ID() {
		return email_ID;
	}
	public void setEmail_ID(String email_ID) {
		email_ID = email_ID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
}
