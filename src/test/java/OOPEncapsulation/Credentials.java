package OOPEncapsulation;
//Credentials has private variables and loginpage is the class
//Simple but important concept. Will be using POM and also in API .Powerful concept but we need to use it properly (Python etc).
//Few prop which are private ( 9.40 m) in nature .
//PRivate variables can be accessed within the class ..20.08 video and 20.32
//Getter Setter ......
//Rt click -- Source -----Generate Getter ,setter and choose the variables
//Done as we dont want to give access to private variables 
//We dont want to expose few logic which is internal to bank

public class Credentials {

	private String username;
	private String password;

	public Credentials() {

	}

	public Credentials(String username, String password) {
		this.username = username;
		this.password = password;
	}

	// getter and setter:

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
