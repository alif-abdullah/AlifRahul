package packageAlif;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class radioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		
//		by custom xpath
		driver.findElement(By.xpath("//input[@value='milk']")).click();		
		
//		by copied xpath
		driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[1]")).click();
		
//		to count the number of radio buttons present in the same segment
		System.out.println(driver.findElement(By.xpath("//input[@name='group1']")).getSize());
	}

}

//==================================== s 7 L 45 ====================