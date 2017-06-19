package autotests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTC {
	
	@Test
	public void firstTest(){
		System.setProperty("webdriver.gecko.driver", "D:\\SNEI\\AT rumpup\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/"); 
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Sperasoft");
		element.submit();
		WebDriverWait timeout = new WebDriverWait(driver, 10);
		timeout.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#resultStats")));
		WebElement result = driver.findElement(By.cssSelector("#resultStats"));
		System.out.println(result.getText());
		Assert.assertTrue(result.isDisplayed()); 
		driver.quit();
	}
}
