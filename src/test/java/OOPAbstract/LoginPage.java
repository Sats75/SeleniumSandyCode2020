package OOPAbstract;

//Business logic can be changed for loginpage as per their requirement
//We cannot create object for abstract  (Eg PAge)
//Partial abstraction is allowed but in interface 100% abstraction is required.
//For both abstract & interface we cannot create object
public class LoginPage extends Page {
	
	public  LoginPage() {
		System.out.println("LoginPage .........Default Constructor");
	}


	@Override
	public void header(String name) {
		System.out.println("LoginPage............Header" + name);

	}

	@Override
	public void title(String Title) {
		System.out.println("LoginPage............Title");

	}

	public void doLogin() {
		System.out.println("LoginPage............dologin");
	
	
}
}