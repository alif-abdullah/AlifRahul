package packageAlif;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {

	public static void main(String[] args) {

		//xpath= //tagname[@attribute='value']
		//css= tagname[attribute='value'] 
		
			//example with css:   div[class='log']   or, [class="log"]
			//example with xpath tag:  //div[@class='log']
		
//		***Preference: id>name>CSS(prefer not for class)>xpath/linkText (For <a> tag, usually link text if no others availabale)
		
			System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://portal.aiub.edu/");
			System.out.println(driver.getTitle());
			driver.findElement(By.id("username")).sendKeys("14-26709-2");
			driver.findElement(By.id("password")).sendKeys("65683069");
			driver.findElement(By.linkText("Can’t access your account?")).click();
			
//			to login, make following uncomment (Using cssSelector)
			//driver.findElement(By.cssSelector("button[class='btn btn-block btn-primary p-lg-left-right\']")).click();

	}

}
