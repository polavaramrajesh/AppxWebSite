package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions2 {

	public static void main(String[]args) throws Exception {

		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		driver.manage().window().maximize();
		WebElement doubleClick=	driver.findElement(By.xpath("//button[@ondblclick=\"myFunction1()\"]"));
		Actions a = new Actions(driver);
		//a.doubleClick(doubleClick).perform();

		WebElement drag= driver.findElement(By.xpath("//div[@id=\"draggable\"]"));

		WebElement drop =driver.findElement(By.xpath("//div[@id=\"droppable\"]"));

	a.dragAndDrop(drag, drop).perform();
		//a.clickAndHold(drag).perform();
        WebElement dragMove=driver.findElement(By.xpath("//input[@id=\"name\"]"));
        Thread.sleep(5000);
       a.clickAndHold(drag).moveToElement(dragMove).perform();

	}
}

  