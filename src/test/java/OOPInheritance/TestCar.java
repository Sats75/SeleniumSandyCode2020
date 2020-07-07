package OOPInheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		 Car c1 = new BMW();//Child class object referred by parent class reference variable . Explain about autoparking
		// Small box fit into big box == Top casting
		 c1.start();
		 c1.stop();
		 c1.refuel();
		 
		 //Down casting  //ClassCastException - Runtime not allowed -Converting car into bmw
		    BMW b1 = (BMW) new Car();
		    
		  
		 
		
		
	}

}

