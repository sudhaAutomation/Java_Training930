package selenium_basics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://integratedtoolingsystems.in/1swishzz_staging/admin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@admin.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='submit']")).submit();
		driver.findElement(By.linkText("Courses List")).click();
		driver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody/tr[1]/td[2]/a[1]")).click();
		Alert alert = driver.switchTo().alert();
		//alert.accept();

		// String successmessage =
		// driver.findElement(By.xpath("/html/body/div/section/div/div/section/div/div/div[1]")).getText();
		// if (successmessage.contains("success")) {
		// System.out.println("message is ::" + successmessage);
		// } else {
		//
		// System.out.println("course not deleted and message is ::" + successmessage);
		// }
		System.out.println(alert.getText());
		alert.dismiss();
		ScreenshotBySelenium.getScreenShot(driver,"AlertScreen");
		//alert.sendKeys(arg0);
		
		Thread.sleep(3000);
		driver.close();
	}

}
