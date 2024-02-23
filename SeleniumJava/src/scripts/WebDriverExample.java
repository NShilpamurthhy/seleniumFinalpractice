package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverExample {
	public static WebDriver driver;
	public static void chrome() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Reqsoftwares/chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.close();
	}
	public static void firefox() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Reqsoftwares/geckodriver.exe");
		driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		chrome();
		firefox();
	}
}
