package automationLib;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
      driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      
      
     // driver.close();
      
     
	}

}
