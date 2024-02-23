package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EdgeBrowserCloseAndopen {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./Reqsoftwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(1000);
	
	driver.close();
	}
}
