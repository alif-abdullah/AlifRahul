package packageAlif;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver ();
		driver.get("http://echoecho.com/htmlforms10.htm");

	}

}
