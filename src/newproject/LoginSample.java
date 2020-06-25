package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tiwar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/login.html");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Pwd");;
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
