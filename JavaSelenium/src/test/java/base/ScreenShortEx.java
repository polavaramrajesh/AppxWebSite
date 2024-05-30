package base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShortEx {
	public static void main(String[] args) throws IOException {
		WebDriver dr=new ChromeDriver();
		dr.get("https://demo.nopcommerce.com/");
		dr.manage().window().maximize();
		
		TakesScreenshot shot=(TakesScreenshot)dr;   
		
		//full page screenshort
//		File src = shot.getScreenshotAs(OutputType.FILE);
//		
//		File f=new File("D:\\selenium workspace\\seleniumdemo\\Screenshort\\fullpage.png");
//		FileUtils.copyFile(src, f);
		
		//element screenshort
		
		WebElement element = dr.findElement(By.xpath("//img[@title='Show products in category Electronics']"));
		File src = element.getScreenshotAs(OutputType.FILE);
		
		File f=new File("D:\\workspace\\JavaSelenium\\screenshot\\element.png");
		FileUtils.copyFile(src, f);
		
		
	}

}
