package browserClose;

import java.net.SocketException;

import org.openqa.selenium.WebDriver;

import synchronization.WaitMethods;

public class Close {
	WaitMethods wait;

	public void CloseBrowser(WebDriver driver) throws SocketException {
		wait = new WaitMethods(driver);
		wait.close(driver);
	}
}
