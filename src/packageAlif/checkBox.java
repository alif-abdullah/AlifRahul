package packageAlif;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		check box should be 3-step work. 
//		firstly, test if the box is already checked, then click it, then test again if it is checked by now
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		
//		test if it's already checked by default
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		
//		now check the box by selenium
		driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		
//		now test the checkbox again if it's checked by now
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		

	}

}
