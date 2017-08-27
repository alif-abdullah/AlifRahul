package packageAlif;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		//driver.get("http://qaclickacademy.com");
		
		//xpath is generated from firepath, its a link to the element we are testing.
		
		//driver.findElement(By.xpath(".//*[@id='homepage']/section[2]/div/a")).click();
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		driver.close();
		
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("email.com"); //find element by id and send/put email address
		driver.findElement(By.name("pass")).sendKeys("12345");
//		driver.findElement(By.id("u_0_q")).click();
		driver.findElement(By.id("u_0_t")).click();

		System.out.println(driver.getTitle());
		
		

	}

}
