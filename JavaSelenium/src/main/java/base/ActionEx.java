package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionEx {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	WebElement k=	driver.findElement(By.xpath("//span[text()='Dhanunjaya Reddy']"));
	
	Actions a=new Actions(driver);
	a.moveToElement(k).build().perform();
	driver.findElement(By.className("Pke_EE")).sendKeys("chockolates");
	driver.findElement(By.className("_2iLD__")).click();
	
	
	
	

	}

}
