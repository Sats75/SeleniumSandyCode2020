package OOPAbstract;

//We can have abstract as well as non abstract methods

public abstract class Page {
	
	public Page() {
		System.out.println("Page .........Default Constructor");
	}
	
	public Page(int i ) {
		System.out.println("1 param Constructor");

	}
	
	public abstract void header(String header);
	public abstract void title (String title);

	//Non abstract method
	public void search() {
		System.out.println("Page Search");
	}
	
}
