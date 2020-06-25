package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadTest {

	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\tiwar\\chromedriver_win32\\chromedriver.exe");
		String baseUrl = "http://www.facebook.com/"; 
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		WebElement el =  driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
		el.sendKeys("C:\\Users\\tiwar\\OneDrive\\Pictures\\Screenshots\\sc1.png");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();
	}

}
