package WebDriverArchitecture;

public class ChromeDriver implements WebDriver {

	public ChromeDriver() {
		System.out.println("Launch google chrome");

	}

	public void get(String url) {
		System.out.println("Launch url" + url);

	}

	public void findElement(String Element) {
		System.out.println("Launch element" + Element);

	}

	public void getTitle() {
		System.out.println("get the page title");

	}

	// non overriden method
	
	public void addplugin() {
		System.out.println("Chrome.......plugin");

	
	
}
