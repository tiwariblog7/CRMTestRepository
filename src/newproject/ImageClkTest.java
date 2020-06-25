package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageClkTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tiwar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/identify?ctx=recover");
		driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();	
		if(driver.getTitle().equals("Facebook – log in or sign up"))
		{
			System.out.println("Navigate to the base page");
		}
		else
		{
			System.out.println("recovery page");
		}

	}

}
