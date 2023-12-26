package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathWriting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://integratedtoolingsystems.in/1swishzz_staging/admin");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		// by using Absolute xpath
		// driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[1]/input")).sendKeys("admin@admin.com");
		// driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[2]/input")).sendKeys("123456");
		// driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[3]/input")).click();
		
		// by using relative xpath/customised xpath

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@admin.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='submit']")).submit();
		 String title =
				 driver.findElement(By.xpath("//div[text()='Welcome']")).getText();//div[@class='title']
		System.out.println(title);
		 if (title.equalsIgnoreCase("welcome")) {
		 System.out.println("System logged into the application successfuly");
		 } else {
		 System.out.println("System logged failed");
		 }

		Thread.sleep(2000);
		driver.close();
	}

}
