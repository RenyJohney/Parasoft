package parasoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageObject {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public BasePageObject(WebDriver driver) {
		
		this.driver = driver;
		wait = new WebDriverWait (driver, 40);
	}
	
	public WebElement waitforElement(By locator) {
		
		WebElement element;
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return element;
			
	}
	
	public void loadPage(String url) {
		driver.get(url);
			
	}

	
	public void typeValue(By locator, String value) {
		waitforElement(locator).sendKeys(value);	
		
	}
	
	public String getValue(By locator) {
		String value;
		value = waitforElement(locator).getText();
		return value;
		
	}
	
	public void clickButton(By locator) {
		waitforElement(locator).click();
	}
}
