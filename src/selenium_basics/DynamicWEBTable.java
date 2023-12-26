package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicWEBTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://integratedtoolingsystems.in/1swishzz_staging/admin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys("admin@admin.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Upcoming Batches')]")).click();
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		while (true) {
			int rows = driver.findElements(By.xpath("//tbody/tr")).size();
			int cols = driver.findElements(By.xpath("//tbody/tr[1]/td")).size();
			for (int i = 1; i < rows; i++) {
				for (int j = 1; j < cols; j++) {
					WebElement field = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[" + j + "]"));
					String tdata = field.getText();
					System.out.print(tdata + "   ");
					if (tdata.equalsIgnoreCase("Hyderabad")) {
						//// tbody/tr[8]/td[8]/a[1]/i[1]
						driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[8]/a[1]/i[1]")).click();
						driver.switchTo().alert().dismiss();
					}
				}
			
				System.out.println();
			}
			if (ElementUtils.isClickable(driver, driver.findElement(By.xpath("//a[@id='example_next']")))) {
				driver.findElement(By.xpath("//a[@id='example_next']")).click();
			} else {
				System.out.println("not repeat");
				break;
			}
			System.out.println("repeat");
		}
	}

}
