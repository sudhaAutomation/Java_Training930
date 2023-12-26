package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://integratedtoolingsystems.in/1swishzz_staging/admin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		/*
		 * locators::will help to the selenium to identify the web elements in the web
		 * Page 8 locators id name className xpath linkText partialLinkText tagName
		 * cssSelector
		 */
//		driver.findElement(By.name("email")).sendKeys("admin@admin.com");
//		driver.findElement(By.name("password")).sendKeys("123456");
//		driver.findElement(By.name("submit")).sendKeys(Keys.ENTER);
		driver.findElement(By.className("form-control")).sendKeys("admin@admin.com");
		Thread.sleep(3000);
		driver.findElement(By.className("form-control")).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.name("submit")).submit();
		Thread.sleep(3000);
		//driver.close();

	}

}
