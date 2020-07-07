package OOPAbstract;

//Can we create constructor of the abstract class
public class TestPage {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();
		lp.search();
		lp.title("Google Login");
		lp.title("Google account login");
		lp.doLogin();
		
		HomePage hp = new HomePage (); 
		hp.search();
		
		
		Page p = new LoginPage();
		p.header("Facebook");
		p.title("FB Login");
	//Mention about do login cannot be accessed using  p.
		
			
		}
		
	}


