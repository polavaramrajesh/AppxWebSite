package browserInitialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import synchronization.WaitMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BrowserInitialization {
	private WebDriver driver;
	private Properties prop;
	private static Logger Log = LogManager.getLogger(BrowserInitialization.class);
	WaitMethods wait;

	public WebDriver browserIntialization(String environment) throws IOException {

		prop = new Properties();
		String filepath = System.getProperty("user.dir");
		FileInputStream file = new FileInputStream(filepath + "\\src\\test\\resources\\"+environment+".properties");
		prop.load(file);

		String browser;
		browser = prop.getProperty("browserName");
		browser=browser.toLowerCase();

		switch (browser) {
		case "chrome":
			Log.info("lanching the Chrome browser");
			driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
			break;
		
		case "edge":
			Log.info("lanching the edge browser");
			driver = new EdgeDriver();
			driver.get(prop.getProperty("url"));
			break;
			
		case "firefox":
			Log.info("lanching the firefox browser");
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("url"));
			break;
			
		default:
			Log.info("lanching the Chrome browser defaultly");
			driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
			break;
		}
		wait=new WaitMethods(driver);
		wait.maximize(driver);
		wait.implicitlyWait(30);
		return driver;
		
	}
}
