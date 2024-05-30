package base;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr=new ChromeDriver();
		WebDriverWait wdw=new WebDriverWait(dr, Duration.ofSeconds(4));
		dr.navigate().to("https://testautomationpractice.blogspot.com/");
		
		dr.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium");
		
		dr.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		
		List<WebElement>list=wdw.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='wikipedia-search-result-link']/a")));
		
		//List<WebElement> list = dr.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
		
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			list.get(i).click();
		}
		Set<String> windows = dr.getWindowHandles();
		for(String w:windows) {
			System.out.println(w);
		}
		List<String> al = new ArrayList<String>(windows);

		
		
//		for(int i=0;i<al.size();) {
//			String title = dr.getTitle();
//			dr.switchTo().window(al.get(++i));
//			System.out.println(title);
//			
//		}
		
		for(String win:al) {
			dr.switchTo().window(win);
			System.out.println(dr.getTitle());
			String title = dr.getTitle();
			if(title.equals("Selenium - Wikipedia")||title.equals("Selenium dioxide - Wikipedia")||title.equals("Selenium disulfide - Wikipedia")||title.equals("Selenium (software) - Wikipedia")) {
				dr.close();
			}
		}
		
//		System.out.println(dr.getTitle());     
		
	}

}
