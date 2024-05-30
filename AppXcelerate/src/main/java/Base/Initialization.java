package Base;



import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Initialization {
	
	private WebDriver driver;
	private Properties prop;
	Logger logger=LogManager.getLogger(Initialization.class);

	
   public WebDriver browserIntialization(String environment ) throws IOException {
	
	   prop = new Properties();
	   String filepath  =System.getProperty("user.dir");
		FileInputStream file = new FileInputStream(filepath+"\\src\\main\\Resources\\"+environment+".properties");
		
		prop.load(file);
	   
	   
	String Browser;
    Browser	=prop.getProperty("Browser");
   
    switch (Browser) {
    case "edge":
    	logger.info("Launching Edge browser");
//    	logger.info(System.getProperty("OS.Verios",));
    	logger.info("OS Version :" +System.getProperty("os.version"));
    	logger.info(" OS name -> "+System.getProperty("os.name"));
    	logger.info(System.getProperty("os.arch"));
    	driver = new EdgeDriver();
    	driver.get(prop.getProperty("url"));
    	break;
    case "firefox":
    	logger.info("Launching Firefox browser");
    	logger.info("OS Version :" +System.getProperty("os.version"));
    	logger.info(" OS name -> "+System.getProperty("os.name"));
    	logger.info(" OS Architecture ->"+System.getProperty("os.arch"));
         driver=new FirefoxDriver();
         driver.get(prop.getProperty("url"));
         break;
    case "chrome":
    	logger.info("Lanching Chrome browser");
    	logger.info("OS Version :" +System.getProperty("os.version"));
    	logger.info(" OS name -> "+System.getProperty("os.name"));
    	logger.info(System.getProperty("os.arch"));
    	driver=new ChromeDriver();
    	driver.get(prop.getProperty("url"));
    	break;
    default:
    	logger.info("Lanching default browser : Firefox");
    	logger.info("OS Version :" +System.getProperty("os.version"));
    	logger.info(" OS name -> "+System.getProperty("os.name"));
    	logger.info(System.getProperty("os.arch"));
    	driver=new FirefoxDriver();
    	driver.get(prop.getProperty("url"));
        break;
    }
    	
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.manage().window().maximize();
	
	
	return driver;
}
   
   public WebDriver getDriver() {
	   return driver;
   }



}
