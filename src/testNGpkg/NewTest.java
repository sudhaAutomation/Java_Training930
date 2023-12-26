package testNGpkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest {
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
		driver.findElement(By.name("email")).sendKeys("admin@admin.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Courses List')]")).click();
	}
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/a[1]")).click();
	  new Select(driver.findElement(By.name("category_id"))).selectByVisibleText("DevOps");
		driver.findElement(By.name("course_name")).sendKeys("Dev-Ops");
		driver.findElement(By.name("course_slug")).sendKeys("http://www.devops.com");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='TypeHere11_ifr']")));
		driver.findElement(By.xpath("//body/p[1]")).sendKeys("Devops is the deployment technology");
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		//driver.findElement(By.name("meta_title")).sendKeys("devops meta info");
		Thread.sleep(3000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		//driver.navigate().back();
//		Thread.sleep(3000);
//		boolean course=driver.findElement(By.xpath("//td[contains(text(),'DevOps')]")).isDisplayed();
//		Assert.assertTrue(course,"Course Not created");
  }
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
