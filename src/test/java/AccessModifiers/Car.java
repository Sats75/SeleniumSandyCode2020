package AccessModifiers;

public class Car {

	public String name;
	private String chasisNumber;
	String color;
	protected String price;

	private void start() {
		System.out.println("car -- start");
	}

	public static void main(String a[]) {

		Car c = new Car();
		c.name = "Audi";
		c.chasisNumber = "123ere";

		c.start();

	}

}
