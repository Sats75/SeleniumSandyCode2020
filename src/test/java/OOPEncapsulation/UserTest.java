package OOPEncapsulation;

public class UserTest {

	public static void main(String[] args) {
		
		//In the below example show user salary info 
		//Explain about user accessing website (Private method of version ,Browser etc.Why to give access to internal data.
		//User should be able to access only public information.
		//If data is allowed to be displayed to the user,then data can be hacked.

	
		  User u1 = new User();
		  
		  u1.setAge(13);
		  u1.setName("Sandy");
		  u1.setPhone(454646);
		 
		  System.out.println(u1.getName() + " "+ u1.getName()+ " "+ u1.getPhone());
		  
		  
		  
		 }
		 
		}
	
		
		
		
		
	