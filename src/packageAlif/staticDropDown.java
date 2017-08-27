package packageAlif;


import java.lang.reflect.Array;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		=====================================  Static dropdowns ==============================
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		
//		by value is the value of attribute in html
		s.selectByValue("2");
		
//		By index is like an Array.0 is the initial position
		s.selectByIndex(2);
		
//		by visible text is the text part of li in html
		s.selectByVisibleText("5 adult");
		

	}

}
