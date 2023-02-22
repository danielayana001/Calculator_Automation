package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ScreenShotCapture;
import Base.TestBase;
import Pages.CalculationPage;

public class CalculationTests {
	WebDriver driver;
	CalculationPage CP;
	String One, Zero, Eight, Multy, Three, Result;
	int i = 0;

	@BeforeTest
	public void browserlaunch() throws Exception {
		driver = TestBase.MainSetUp("chrome");
		CP = new CalculationPage(driver);
	}

	@Test
	public void Execution() throws Exception {
		CP = new CalculationPage(driver);
		CP.EnterOne();
		One = CP.ScreenValue();
		Assert.assertEquals(One, "1");
		CP.EnterZero();
		Zero = CP.ScreenValue();
		Thread.sleep(1500);
		Assert.assertEquals(Zero, "10");
		CP.SubClick();
		CP.EnterEight();
		Thread.sleep(1500);
		Eight = CP.ScreenValue();
		Assert.assertEquals(Eight, "8");
		Thread.sleep(1500);
		CP.MulClick();
		Multy = CP.ScreenValue();
		Assert.assertEquals(Multy, "2");
		Thread.sleep(1500);
		CP.EnterThree();
		Three = CP.ScreenValue();
		Assert.assertEquals(Three, "3");
		Thread.sleep(1500);
		CP.equalClick();
		Result = CP.ScreenValue();
		Assert.assertEquals(Result, "6");
		Thread.sleep(1500);
	}

	@AfterMethod
	public void screenshot(ITestResult result) {
		i = i + 1;
		String name = "ScreenShot";
		String x = name + String.valueOf(i);
		if (ITestResult.FAILURE == result.getStatus()) {
			ScreenShotCapture.captureScreenShot(driver, x);
		}
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
