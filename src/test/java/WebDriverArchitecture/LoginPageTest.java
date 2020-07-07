package WebDriverArchitecture;

public class LoginPageTest {
	static FireFoxDriver driver;

	public static void main(String[] args) {

		String browser = "chrome";

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FireFoxDriver();

		}

		WebDriver driver = new ChromeDriver();

		driver.get("http//:www.google.com");
		driver.findElement("username");
		driver.findElement("Password");
		driver.findElement("login");
		System.out.println(driver.getTitle());
	}

}
