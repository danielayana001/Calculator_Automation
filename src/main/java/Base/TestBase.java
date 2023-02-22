package Base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {

	static WebDriver driver;
	public Logger logger;
	public File file;
	public File file1;
	public Properties Basic;
	public Properties Advance;
	public FileInputStream fileInput;
	public FileInputStream fileInput1;

	public static WebDriver MainSetUp(String browser) throws Exception {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Drivers//geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "//Drivers//msedgedriver.exe");
			driver = new EdgeDriver();

		} else {
			throw new Exception("You have not choosen the Browser");
		}
		driver.manage().window().maximize();
		driver.get("https://duffmanns.github.io/calc-test/calculator/app/index.html");

		return driver;
	}

}
