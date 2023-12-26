package testNGpkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginWithTestNG {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://integratedtoolingsystems.in/1swishzz_staging/admin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@Test
	public void Login() {
		driver.findElement(By.name("email")).sendKeys("admin@admin.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("submit")).click();
		String actTile=driver.findElement(By.xpath("//div[contains(text(),'admin')]")).getText();
		System.out.println(actTile);
		Assert.assertTrue(actTile.equalsIgnoreCase("admin"));
		Assert.assertTrue(actTile.equalsIgnoreCase("admin"),"System Failed to Login" );
//		if (actTile.equalsIgnoreCase("admin")) {
//			Assert.assertTrue(true);
//			
//		} else {
//			Assert.assertTrue(false,"System Failed to Login" );
//		}
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
