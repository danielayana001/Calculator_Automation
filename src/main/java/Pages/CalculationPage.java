package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalculationPage {
	WebDriver driver;

	By btn_One = By.id("one");
	By btn_Zero = By.id("zero");
	By btn_Sub = By.id("subtract");
	By btn_Eight = By.id("eight");
	By btn_Multiply = By.id("multiply");
	By btn_three = By.id("three");
	By btn_equals = By.id("equals");
	By GetScreen = By.xpath("//div[@id=\"display\"]/div");

	public CalculationPage(WebDriver dr) {

		this.driver = dr;
		

	}

	public void EnterOne() {

		driver.findElement(btn_One).click();
		
		
	}
	public String ScreenValue()
	{
		return driver.findElement(GetScreen).getText();
	}

	public void EnterZero() {

		driver.findElement(btn_Zero).click();

	}

	public void SubClick() {

		driver.findElement(btn_Sub).click();

	}

	public void EnterEight() {

		driver.findElement(btn_Eight).click();

	}

	public void MulClick() {

		driver.findElement(btn_Multiply).click();

	}

	public void EnterThree() {

		driver.findElement(btn_three).click();

	}

	public void equalClick() {

		driver.findElement(btn_equals).click();

	}
}
