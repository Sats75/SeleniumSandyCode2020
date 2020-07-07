package WebDriverArchitecture;

public class FireFoxDriver implements WebDriver {

	public void get(String url) {
		System.out.println("Launching url" + url);

	}

	public void findElement(String Element) {
		System.out.println("finding element" + Element);

	}

	public void getTitle() {
		System.out.println("get the page title");

	}

}
