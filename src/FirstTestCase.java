


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstTestCase extends Credentials {
	
	Credentials url = new Credentials();
	
	public void checkLoginUrlinFirefox() {
		
		FirefoxDriver firefoxDriver = new FirefoxDriver();
		firefoxDriver.manage().window().maximize();
		firefoxDriver.get(url.loginURL);
		url.setSleep();
		firefoxDriver.close();
	}
	
	public void checkLoginUrlinChrome() {
		
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get(url.loginURL);
		chromeDriver.manage().window().maximize();
		url.setSleep();
		chromeDriver.close();
	}
	
	public void checkLoginUrlinIE() {
		
		InternetExplorerDriver ieDriver = new InternetExplorerDriver();
		ieDriver.manage().window().maximize();
		ieDriver.get(url.loginURL);
		url.setSleep();
		ieDriver.close();
	}

}
