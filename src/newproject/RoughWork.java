package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class RoughWork {

	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\tiwar\\chromedriver_win32\\chromedriver.exe");
		String baseUrl = "http://www.facebook.com/"; 
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseUrl);
		WebElement wb = driver.findElement(By.id("email"));
		Actions tr = new Actions(driver);
		Action gt = tr
				    .moveToElement(wb)
				    .click()
				    .keyDown(wb, Keys.SHIFT)
				    .sendKeys("hello")
				    .keyUp(wb, Keys.SHIFT)
				    .doubleClick()
				    .contextClick()
				    .build();
		gt.perform();

	}

}
